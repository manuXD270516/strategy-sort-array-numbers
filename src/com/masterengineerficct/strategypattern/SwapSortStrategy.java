package com.masterengineerficct.strategypattern;

import java.util.Arrays;

public class SwapSortStrategy implements SortStrategy {
    @Override
    public int[] sort(int[] v, int countElements) {
        for (int i = 0; i < countElements; i++) {
            for (int j = i+1; j <countElements; j++) {
                if (v[j] < v[i]){
                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        return v;
    }
}
