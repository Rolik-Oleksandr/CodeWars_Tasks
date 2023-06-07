package org.tasks.codewars.kyu_7;

import java.util.stream.IntStream;

public class MultiplesOfN {
  public static int[] multiples(int m, int n) {
    return IntStream.range(1, m+1)
            .map(i -> i * n)
            .toArray();
  }
}