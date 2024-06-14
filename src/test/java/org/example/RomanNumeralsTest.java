package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {
  @Test
  public void transforms_one_to_roman() {
    String result = RomanNumerals.toRoman(1);

    assertThat(result).isEqualTo("I");
  }

  @Test
  public void transforms_two_to_roman() {
    String result = RomanNumerals.toRoman(2);

    assertThat(result).isEqualTo("II");
  }

  @Test
  public void transforms_three_to_roman() {
    String result = RomanNumerals.toRoman(3);

    assertThat(result).isEqualTo("III");
  }

  @Test
  public void transforms_four_to_roman() {
    String result = RomanNumerals.toRoman(4);

    assertThat(result).isEqualTo("IV");
  }

  @Test
  public void transforms_five_to_roman() {
    String result = RomanNumerals.toRoman(5);

    assertThat(result).isEqualTo("V");
  }
}
