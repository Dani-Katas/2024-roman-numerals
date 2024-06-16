package org.example;

public class RomanNumerals {

  public static String toRoman(final int number) {
    if(number == 500) {
      return "D";
    }

    if(number >= 400) {
      return toRoman(100) + toRoman(500) + toRoman(number - 400);
    }

    if(number >= 100) {
      return "C" + toRoman(number - 100);
    }

    if(number >= 90) {
      return toRoman(10) + toRoman(100) + toRoman(number - 90);
    }

    if(number >= 50) {
      return "L" + toRoman(number - 50);
    }

    if(number >= 40) {
      return toRoman(10) + toRoman(50) + toRoman(number - 40);
    }

    if (number >= 10) {
      return "X" + toRoman(number - 10);
    }

    if(number == 9) {
      return toRoman(1) + toRoman(10);
    }

    if (number >= 5) {
      return "V" + toRoman(number - 5);
    }

    if (number == 4) {
      return toRoman(1) + toRoman(5);
    }

    return "I".repeat(number);
  }
}
