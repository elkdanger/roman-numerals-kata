object RomanNumerals {

  private val fixedDigits = Map(
    4 -> "IV",
    9 -> "IX",
    14 -> "XIV"
  )

  private val base = Seq(
    5 -> "V",
    10 -> "X",
    15 -> "XV"
  )

  def convert(digit: Int): String = {
    val base = findBase(digit)

    if (fixedDigits.contains(digit))
      fixedDigits(digit)
    else {
      if (digit < 4)
        "I" * digit
      else if (digit < 9)
        base + "I" * (digit - 5)
      else if (digit < 14)
        base + "I" * (digit - 10)
      else
        base
    }
  }

  private def findBase(digit: Int): String = {
     base.find(k => digit <= k._1) match {
       case Some((key, value)) if key == digit => value
       case x@Some(_) if base.indexOf(x.get) > 0 => base(base.indexOf(x.get) - 1)._2
       case _ => ""
     }
  }

}
