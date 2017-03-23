import org.scalatest.{MustMatchers, WordSpec}

class RomanNumeralsSpec extends WordSpec with MustMatchers {

  "The roman numerals converter" must {

    "convert the number 1" in {

      RomanNumerals.convert(1) mustBe "I"

    }

    "convert the number 2" in {

      RomanNumerals.convert(2) mustBe "II"

    }

    "convert the number 3" in {

      RomanNumerals.convert(3) mustBe "III"

    }

    "convert the number 4" in {

      RomanNumerals.convert(4) mustBe "IV"

    }

    "convert the number 5" in {

      RomanNumerals.convert(5) mustBe "V"

    }

    "convert the number 6" in {

      RomanNumerals.convert(6) mustBe "VI"

    }

    "convert the number 7" in {

      RomanNumerals.convert(7) mustBe "VII"

    }

    "convert the number 8" in {

      RomanNumerals.convert(8) mustBe "VIII"

    }

  }

}
