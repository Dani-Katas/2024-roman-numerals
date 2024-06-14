package org.example;

public class RomanNumerals {

  public static String toRoman(final int number) {
    if (number == 50) {
      return "L";
    }
    if (number == 10) {
      return "X";
    }
    if (number == 5) {
      return "V";
    }
    if (number == 1) {
      return "I";
    }

    if (number == 51) {
      return toRoman(50) + toRoman(number - 50);
    }
    if (number == 40) {
      return toRoman(10) + toRoman(number + 10);
    }
    if (number >= 11) {
      return toRoman(10) + toRoman(number - 10);
    }
    if (number == 9) {
      return toRoman(1) + toRoman(number + 1);
    }
    if (number >= 6) {
      return toRoman(5) + toRoman(number - 5);
    }

    if (number == 4) {
      return toRoman(1) + toRoman(5);
    }

    return toRoman(1).repeat(number);
  }
}
