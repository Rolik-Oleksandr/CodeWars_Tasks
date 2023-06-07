package org.tasks.codewars.kyu_7;

public class Row_Weights {
    public static int[] rowWeights (final int[] weights) {
        int odd = 0;
        int even = 0;
        for(int i = 0; i < weights.length; i = i + 2) {
            odd += weights[i];
        }
        for(int j = 1; j < weights.length; j = j + 2){
            even += weights[j];
        }
        return new int[]{odd, even};
    }
}