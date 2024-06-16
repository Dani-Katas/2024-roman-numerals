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
    for (int i = 0; i < romans.size() - 1; i++) {
      final String roman1000 = temporalMethod(romans.get(i), number);
      if (roman1000 != null) {
        return roman1000;
      }
    }

    return "I".repeat(number);
  }

  private static String temporalMethod(final Roman roman, final int number) {
    final int value = roman.value();
    if (number >= value) {
      return roman.symbol() + toRoman(number - value);
    }

    int restableValue = getRestableFor(value);
    if (number >= (value - restableValue)) {
      return toRoman(restableValue) + toRoman(value) + toRoman(number - (value - restableValue));
    }
    return null;
  }
}
