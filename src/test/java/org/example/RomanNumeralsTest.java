package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RomanNumeralsTest {

  @ParameterizedTest(name = "{0} in roman numerals is {1}")
  @CsvSource({
      "1, I",
      "2, II",
      "3, III",
      "4, IV",
      "5, V",
      "6, VI",
      "7, VII",
      "8, VIII",
      "9, IX",
      "10, X",
      "11, XI",
      "12, XII",
      "13, XIII",
      "40, XL",
      "50, L",
      "51, LI",
      "52, LII",
  })
  void transforms_number_to_roman(int input, String expected) {
    String result = RomanNumerals.toRoman(input);

    assertThat(result).isEqualTo(expected);
  }
}
