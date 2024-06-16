package org.example;

public class RomanNumerals {

  public static String toRoman(final int number) {
    return Roman.fromArabic(number).map(Roman::symbol).reduce("", String::concat);
  }
}
