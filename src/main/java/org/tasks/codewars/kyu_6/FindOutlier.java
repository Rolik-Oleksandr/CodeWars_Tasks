package org.tasks.codewars.kyu_6;

public class FindOutlier {
    public static int find(int[] integers) {
      int oddCount = 0, evenCount = 0;
      int oddNum = 0, evenNum = 0;
      for (int i = 0; i < integers.length; i++) {
        if (integers[i] % 2 == 0) {
          evenCount++;
          evenNum = integers[i];
        } else {
          oddCount++;
          oddNum = integers[i];
        }
      }
      return oddCount == 1 ? oddNum : evenNum;
    }
}