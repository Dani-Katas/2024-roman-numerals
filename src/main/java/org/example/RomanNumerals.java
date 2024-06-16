package org.example;

public class RomanNumerals {

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
    for (Roman roman : Roman.UNITS) {
      final int value = roman.value();
      if (number >= value) {
        return roman.symbol() + toRoman(number - value);
      }

      int restableValue = getRestableFor(value);
      if (number >= (value - restableValue)) {
        return toRoman(restableValue) + toRoman(value) + toRoman(number - (value - restableValue));
      }
    }

    return "I".repeat(number);
  }
}
