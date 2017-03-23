object RomanNumerals {

  private val fixedDigits = Map(
    4 -> "IV",
    9 -> "IX",
    14 -> "XIV",
    19 -> "XIX"
  )

  def convert(digit: Int): String = {
    val base = findBase(digit)

    if (fixedDigits.contains(digit))
      fixedDigits(digit)
    else
      base + "I" * (digit % 5)
  }

  private def findBase(digit: Int): String = {
    val X = "X" * (lower(digit) / 10)
    val V = if ((5 until 10) contains (digit - lower(digit))) "V" else ""

    s"$X$V"
  }

  private def lower(digit: Int) = Math.round(digit / 10) * 10

}
