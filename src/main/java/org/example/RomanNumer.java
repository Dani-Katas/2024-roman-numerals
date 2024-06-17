package org.example;

import java.util.List;

public class RomanNumer {

  private final List<RomanSymbol> symbols;

  public RomanNumer(final List<RomanSymbol> symbols) {
    this.symbols = symbols;
  }

  static RomanNumer fromArabic(final int number) {
    return new RomanNumer(RomanSymbol.from(number).toList());
  }

  @Override
  public String toString() {
    return this.symbols.stream().map(RomanSymbol::toString).reduce("", String::concat);
  }
}
