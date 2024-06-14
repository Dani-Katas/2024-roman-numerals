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

    if (number == 90) {
      return "XC";
    }
    if (number == (50 - 10)) {
      return toRoman(10) + toRoman(number + 10);
    }
    if (number == (10 - 1)) {
      return toRoman(1) + toRoman(number + 1);
    }
    if (number == (5 - 1)) {
      return toRoman(1) + toRoman(number + 1);
    }

    if (number > 50) {
      return toRoman(50) + toRoman(number - 50);
    }
    if (number > 10) {
      return toRoman(10) + toRoman(number - 10);
    }
    if (number > 5) {
      return toRoman(5) + toRoman(number - 5);
    }

    return toRoman(1).repeat(number);
  }
}
