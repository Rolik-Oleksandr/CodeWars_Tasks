package org.tasks.codewars.kyu_7;

public class NegativeZero {
  public static boolean isNegativeZero(float n) {
    return Float.compare(n, -0.0f) == 0 && 1.0f / n == Float.NEGATIVE_INFINITY;
  }
}