package org.example;

public class RomanNumerals {

  public static String toRoman(final int number) {
    if (number == 4) {
      return "IV";
    }

    return "I".repeat(number);
  }
}
