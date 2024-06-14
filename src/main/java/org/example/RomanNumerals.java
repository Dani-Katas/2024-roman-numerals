package org.example;

public class RomanNumerals {

  public static String toRoman(final int number) {
    if (number >= 11) {
      return "X" + toRoman(number - 10);
    }
    if (number == 10) {
      return "X";
    }
    if (number == 9) {
      return "IX";
    }
    if (number >= 6) {
      return "V" + toRoman(number - 5);
    }

    if (number == 5) {
      return "V";
    }

    if (number == 4) {
      return "IV";
    }

    return "I".repeat(number);
  }
}
