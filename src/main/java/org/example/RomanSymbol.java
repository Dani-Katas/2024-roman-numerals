package org.example;

import java.util.List;
import java.util.stream.Stream;

public enum RomanSymbol {
  M(1000),
  D(500),
  C(100),
  L(50),
  X(10),
  V(5),
  I(1) {
    @Override
    protected Stream<RomanSymbol> tryFromArabic(final int number) {
      return Stream.generate(() -> RomanSymbol.I).limit(number);
    }
  },
  NO_ROMAN(0) {
    @Override
    public String toString() {
      return "";
    }
  };

  private final int value;

  RomanSymbol(final int value) {
    this.value = value;
  }

  public static Stream<RomanSymbol> fromArabic(final int number) {
    return M.tryFromArabic(number);
  }

  protected Stream<RomanSymbol> tryFromArabic(final int number) {
    if (number >= value) {
      return Stream.concat(Stream.of(this), fromArabic(number - value));
    }

    RomanSymbol subtractiveNumeral = this.subtractiveNumeral();
    final int subtractValue = value - subtractiveNumeral.value;
    if (number >= subtractValue) {
      return Stream.concat(Stream.of(subtractiveNumeral, this), fromArabic(number - subtractValue));
    }

    return getNext().tryFromArabic(number);
  }

  public RomanSymbol getNext() {
    final List<RomanSymbol> romanSymbols = allValues();
    return romanSymbols.get(romanSymbols.indexOf(this) + 1);
  }

  private List<RomanSymbol> allValues() {
    return List.of(RomanSymbol.values());
  }

  private boolean canBeSubtracted() {
    return this.equals(I) || this.equals(X) || this.equals(C);
  }

  private RomanSymbol subtractiveNumeral() {
    return allValues().stream()
        .filter(RomanSymbol::canBeSubtracted)
        .filter(roman -> roman.value < this.value)
        .findFirst()
        .orElse(NO_ROMAN);
  }
}
