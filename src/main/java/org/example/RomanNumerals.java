package org.example;

public class RomanNumerals {

  public static String toRoman(final int number) {
    for (Roman roman : Roman.UNITS) {
      final int value = roman.value();
      if (number >= value) {
        return roman.symbol() + toRoman(number - value);
      }

      Roman restable = roman.getRestable();
      if (number >= (value - restable.value())) {
        return toRoman(restable.value()) + toRoman(value) + toRoman(number - (value - restable.value()));
      }
    }

    return Roman.I.symbol().repeat(number);
  }
}
