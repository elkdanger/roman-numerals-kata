object RomanNumerals {

  def convert(digit: Int): String =
    if (digit == 1)
      "I"
    else if (digit == 2)
      "II"
    else
      "III"

}
