package org.example;

import java.util.List;

public class RomanNumerals {

  static List<Roman> romans = List.of(
      new Roman("M", 1000),
      new Roman("D", 500),
      new Roman("C", 100),
      new Roman("L", 50),
      new Roman("X", 10),
      new Roman("V", 5),
      new Roman("I", 1)
  );

  public static String toRoman(final int number) {
    if (number >= 1000) {
      return "M" + toRoman(number - 1000);
    }

    if (number >= (1000 - 100)) {
      return toRoman(100) + toRoman(1000) + toRoman(number - (1000 - 100));
    }

    if (number >= 500) {
      return "D" + toRoman(number - 500);
    }

    if (number >= (500 - 100)) {
      return toRoman(100) + toRoman(500) + toRoman(number - (500 - 100));
    }

    if (number >= 100) {
      return "C" + toRoman(number - 100);
    }

    if (number >= (100 - 10)) {
      return toRoman(10) + toRoman(100) + toRoman(number - (100 - 10));
    }

    if (number >= 50) {
      return "L" + toRoman(number - 50);
    }

    if (number >= (50 - 10)) {
      return toRoman(10) + toRoman(50) + toRoman(number - (50 - 10));
    }

    if (number >= 10) {
      return "X" + toRoman(number - 10);
    }

    if (number == (10 - 1)) {
      return toRoman(1) + toRoman(10) + toRoman(number - (10 - 1));
    }

    if (number >= 5) {
      return "V" + toRoman(number - 5);
    }

    if (number == (5 - 1)) {
      return toRoman(1) + toRoman(5) + toRoman(number - (5 - 1));
    }

    return "I".repeat(number);
  }
}
