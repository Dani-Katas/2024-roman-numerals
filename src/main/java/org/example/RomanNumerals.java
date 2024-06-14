package org.example;

public class RomanNumerals {

  public static String toRoman(final int number) {
    if (number == 8) {
      return "V" + toRoman(3);
    }

    if (number == 7) {
      return "V" + toRoman(2);
    }

    if (number == 6) {
      return "V" + toRoman(1);
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
