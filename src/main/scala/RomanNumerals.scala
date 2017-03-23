object RomanNumerals {

  private val fixedDigits = Map(
    4 -> "IV",
    9 -> "IX",
    14 -> "XIV",
    19 -> "XIX"
  )

  private val base = Seq(
    5 -> "V",
    10 -> "X",
    15 -> "XV",
    20 -> "XX"
  )

  def convert(digit: Int): String = {
    val base = findBase(digit)

    if (fixedDigits.contains(digit))
      fixedDigits(digit)
    else
      base + "I" * (digit % 5)
  }

  private def findBase(digit: Int): String = {
    base.find(digit <= _._1) match {
      case Some((key, value)) if key == digit => value
      case x@Some(_) if base.indexOf(x.get) > 0 => base(base.indexOf(x.get) - 1)._2
      case _ => ""
    }
  }

}
