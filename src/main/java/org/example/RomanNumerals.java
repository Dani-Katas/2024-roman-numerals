package org.example;

public class RomanNumerals {

  public static String toRoman(final int number) {
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
