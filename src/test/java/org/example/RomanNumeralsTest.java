package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RomanNumeralsTest {
  @ParameterizedTest(name = "{0} in roman numerals is {1}")
  @CsvFileSource(resources = "/romans.csv", numLinesToSkip = 1)
  public void transforms_number_to_roman(int input, String expected) {
    String result = RomanNumerals.toRoman(input);

    assertThat(result).isEqualTo(expected);
  }
}
