package org.example;

import java.util.stream.Stream;

public class RomanNumerals {

  public static String toRoman(final int number) {
    return toRoman3(number);
  }

  public static Stream<Roman> toRoman2(final int number) {
    for (Roman roman : Roman.UNITS) {
      final int value = roman.value();
      if (number >= value) {
        return Stream.concat(Stream.of(roman), toRoman2(number - value));
      }

      Roman restable = roman.getRestable();
      if (number >= (value - restable.value())) {
        return Stream.concat(Stream.of(restable, roman), toRoman2(number - (value - restable.value())));
      }
    }

    return Stream.generate(() -> Roman.I).limit(number);
  }

  public static String toRoman3(final int number) {
    return toRoman2(number).map(Roman::symbol).reduce("", String::concat);
  }
}
