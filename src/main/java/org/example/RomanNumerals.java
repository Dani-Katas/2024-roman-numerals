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

  private static int getRestableFor(final int i) {
    if (i == 1000) {
      return 100;
    }
    if (i == 500) {
      return 100;
    }
    if (i == 100) {
      return 10;
    }
    if (i == 50) {
      return 10;
    }
    if (i == 10) {
      return 1;
    }
    if (i == 5) {
      return 1;
    }
    return 0;
  }

  public static String toRoman(final int number) {
    if (number >= 1000) {
      return "M" + toRoman(number - 1000);
    }

    int value1000 = getRestableFor(1000);
    if (number >= (1000 - value1000)) {
      return toRoman(value1000) + toRoman(1000) + toRoman(number - (1000 - value1000));
    }

    if (number >= 500) {
      return "D" + toRoman(number - 500);
    }

    int value500 = getRestableFor(500);
    if (number >= (500 - value500)) {
      return toRoman(value500) + toRoman(500) + toRoman(number - (500 - value500));
    }

    if (number >= 100) {
      return "C" + toRoman(number - 100);
    }

    int value100 = getRestableFor(100);
    if (number >= (100 - value100)) {
      return toRoman(value100) + toRoman(100) + toRoman(number - (100 - value100));
    }

    if (number >= 50) {
      return "L" + toRoman(number - 50);
    }

    int value50 = getRestableFor(50);
    if (number >= (50 - value50)) {
      return toRoman(value50) + toRoman(50) + toRoman(number - (50 - value50));
    }

    if (number >= 10) {
      return "X" + toRoman(number - 10);
    }

    int value10 = getRestableFor(10);
    if (number == (10 - value10)) {
      return toRoman(value10) + toRoman(10) + toRoman(number - (10 - value10));
    }

    if (number >= 5) {
      return "V" + toRoman(number - 5);
    }

    int value5 = getRestableFor(5);
    if (number == (5 - value5)) {
      return toRoman(1) + toRoman(5) + toRoman(number - (5 - value5));
    }

    return "I".repeat(number);
  }
}
