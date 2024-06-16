package org.example;

import java.util.List;
import java.util.stream.Stream;

public record Roman(String symbol, int value) {

  public static final Roman M = new Roman("M", 1000);
  public static final Roman D = new Roman("D", 500);
  public static final Roman C = new Roman("C", 100);
  public static final Roman L = new Roman("L", 50);
  public static final Roman X = new Roman("X", 10);
  public static final Roman V = new Roman("V", 5);
  public static final Roman I = new Roman("I", 1);
  public static final Roman NO_ROMAN = new Roman("", 0);

  public static final List<Roman> UNITS = List.of(
    Roman.M,
    Roman.D,
    Roman.C,
    Roman.L,
    Roman.X,
    Roman.V,
    Roman.I
  );

  public static Stream<Roman> fromArabic(final int number) {
    return fromArabic(number, Roman.M);
  }

  private static Stream<Roman> fromArabic(final int number, final Roman roman) {
    if (roman.equals(Roman.I)) {
      return Stream.generate(() -> I).limit(number);
    }

    if (number >= roman.value()) {
      return Stream.concat(Stream.of(roman), fromArabic(number - roman.value()));
    }

    Roman restable = roman.getRestable();
    if (number >= (roman.value() - restable.value())) {
      return Stream.concat(Stream.of(restable, roman), fromArabic(number - (roman.value() - restable.value())));
    }

    return fromArabic(number, roman.getNext());
  }

  private Roman getNext() {
    if (equals(M)) {
      return D;
    }
    if (equals(D)) {
      return C;
    }
    if (equals(C)) {
      return L;
    }
    if (equals(L)) {
      return X;
    }
    if (equals(X)) {
      return V;
    }
    if (equals(V)) {
      return I;
    }

    return NO_ROMAN;
  }

  private Roman getRestable() {
    if (equals(M)) {
      return C;
    }
    if (equals(D)) {
      return C;
    }
    if (equals(C)) {
      return X;
    }
    if (equals(L)) {
      return X;
    }
    if (equals(X)) {
      return I;
    }
    if (equals(V)) {
      return I;
    }

    return NO_ROMAN;
  }
}
