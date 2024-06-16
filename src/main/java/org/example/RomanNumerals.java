package org.example;

public class RomanNumerals {
  private static Roman getRestableFor(final Roman roman) {
    if (roman.equals(Roman.M)) {
      return Roman.C;
    }
    if (roman.equals(Roman.D)) {
      return Roman.C;
    }
    if (roman.equals(Roman.C)) {
      return Roman.X;
    }
    if (roman.equals(Roman.L)) {
      return Roman.X;
    }
    if (roman.equals(Roman.X)) {
      return Roman.I;
    }
    if (roman.equals(Roman.V)) {
      return Roman.I;
    }

    return new Roman("", 0);
  }

  public static String toRoman(final int number) {
    for (Roman roman : Roman.UNITS) {
      final int value = roman.value();
      if (number >= value) {
        return roman.symbol() + toRoman(number - value);
      }

      Roman restable = getRestableFor(roman);
      if (number >= (value - restable.value())) {
        return toRoman(restable.value()) + toRoman(value) + toRoman(number - (value - restable.value()));
      }
    }

    return "I".repeat(number);
  }
}
