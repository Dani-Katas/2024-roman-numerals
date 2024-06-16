package org.example;

public record Roman(String symbol, int value) {
  public static Roman M = new Roman("M", 1000);
  public static Roman D = new Roman("D", 500);
  public static Roman C = new Roman("C", 100);
  public static Roman L = new Roman("L", 50);
  public static Roman X = new Roman("X", 10);
  public static Roman V = new Roman("V", 5);
  public static Roman I = new Roman("I", 1);
}
