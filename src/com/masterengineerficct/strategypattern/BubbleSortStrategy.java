package com.masterengineerficct.strategypattern;

public class BubbleSortStrategy implements SortStrategy {

    @Override
    public int[] sort(int[] v, int countElements) {
        for (int i = countElements -1; i > 0; i++) {
            for (int j = 0; j < i; j++) {
                if (v[j] > v[j+1]){
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
        return v;
    }
}
