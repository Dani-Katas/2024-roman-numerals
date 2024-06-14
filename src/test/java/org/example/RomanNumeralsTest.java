package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RomanNumeralsTest {

  @ParameterizedTest
  @CsvSource({
      "1, I",
      "2, II",
      "3, III",
      "4, IV",
      "5, V",
      "6, VI"
  })
  void transforms_number_to_roman(int input, String expected) {
    String result = RomanNumerals.toRoman(input);

    assertThat(result).isEqualTo(expected);
  }
}
