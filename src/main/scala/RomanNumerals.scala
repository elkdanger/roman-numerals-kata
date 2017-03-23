object RomanNumerals {

  def convert(digit: Int): String =
    if (digit < 4)
      "I" * digit
    else
      "IV"

}
