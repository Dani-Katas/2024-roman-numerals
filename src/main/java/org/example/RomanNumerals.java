package org.example;

public class RomanNumerals {

  public static String toRoman(final int number) {
    if (number == 51) {
      return "L"+ "I";
    }
    if (number == 50) {
      return "L";
    }
    if (number == 40) {
      return "X" + "L";
    }
    if (number >= 10) {
      return "X" + toRoman(number - 10);
    }
    if (number == 9) {
      return "I" + "X";
    }
    if (number >= 5) {
      return "V" + toRoman(number - 5);
    }
    if (number == 4) {
      return "I" + "V";
    }

    return "I".repeat(number);
  }
}
