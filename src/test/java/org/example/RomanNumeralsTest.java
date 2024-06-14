package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {
  @Test
  public void transforms_one_to_roman() {
    String result = RomanNumerals.toRoman(1);

    assertThat(result).isEqualTo("I");
  }
}
