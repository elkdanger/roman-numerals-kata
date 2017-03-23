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

  }

}
