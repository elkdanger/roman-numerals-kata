object RomanNumerals {

  def convert(digit: Int): String =
    if (digit < 4)
      "I" * digit
    else if (digit == 4)
      "IV"
    else if (digit == 5)
      "V"
    else
      "VI"

}
