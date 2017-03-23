object RomanNumerals {

  private val fixedDigits = Map(
    4 -> "IV",
    9 -> "IX"
  )

  def convert(digit: Int): String =
    if (fixedDigits.contains(digit))
      fixedDigits(digit)
    else {
      if (digit < 4)
        "I" * digit
      else if (digit < 9)
        "V" + "I" * (digit - 5)
      else
        "X" + "I" * (digit - 10)
    }

}
