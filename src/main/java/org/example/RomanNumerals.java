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
      final String roman1000 = temporalMethod(i, number);
      if (roman1000 != null) {
        return roman1000;
      }
    }

    return "I".repeat(number);
  }

  private static String temporalMethod(final int index, final int number) {
    final Roman roman1000 = romans.get(index);
    final int n1000 = roman1000.value();
    if (number >= n1000) {
      return roman1000.symbol() + toRoman(number - n1000);
    }

    int value1000 = getRestableFor(n1000);
    if (number >= (n1000 - value1000)) {
      return toRoman(value1000) + toRoman(n1000) + toRoman(number - (n1000 - value1000));
    }
    return null;
  }
}
