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
    final Roman roman1000 = romans.get(0);
    final int n1000 = roman1000.value();
    if (number >= n1000) {
      return roman1000.symbol() + toRoman(number - n1000);
    }

    int value1000 = getRestableFor(n1000);
    if (number >= (n1000 - value1000)) {
      return toRoman(value1000) + toRoman(n1000) + toRoman(number - (n1000 - value1000));
    }

    final Roman roman500 = romans.get(1);
    final int n500 = roman500.value();
    if (number >= n500) {
      return roman500.symbol() + toRoman(number - n500);
    }

    int value500 = getRestableFor(n500);
    if (number >= (n500 - value500)) {
      return toRoman(value500) + toRoman(n500) + toRoman(number - (n500 - value500));
    }

    final Roman roman100 = romans.get(2);
    final int n100 = roman100.value();
    if (number >= n100) {
      return roman100.symbol() + toRoman(number - n100);
    }

    int value100 = getRestableFor(n100);
    if (number >= (n100 - value100)) {
      return toRoman(value100) + toRoman(n100) + toRoman(number - (n100 - value100));
    }

    final Roman roman50 = romans.get(3);
    final int n50 = roman50.value();
    if (number >= n50) {
      return roman50.symbol() + toRoman(number - n50);
    }

    int value50 = getRestableFor(n50);
    if (number >= (n50 - value50)) {
      return toRoman(value50) + toRoman(n50) + toRoman(number - (n50 - value50));
    }

    final Roman roman10 = romans.get(4);
    final int n10 = roman10.value();
    if (number >= n10) {
      return roman10.symbol() + toRoman(number - n10);
    }

    int value10 = getRestableFor(n10);
    if (number == (n10 - value10)) {
      return toRoman(value10) + toRoman(n10) + toRoman(number - (n10 - value10));
    }

    final Roman roman5 = romans.get(5);
    final int n5 = roman5.value();
    if (number >= n5) {
      return roman5.symbol() + toRoman(number - n5);
    }

    int value5 = getRestableFor(n5);
    if (number == (n5 - value5)) {
      return toRoman(value5) + toRoman(n5) + toRoman(number - (n5 - value5));
    }

    return "I".repeat(number);
  }
}
