package com.masterengineerficct.strategypattern;

import java.util.Arrays;
import java.util.Random;

public class VectorNumbers {

    private int[] arrayNumber;
    private int countElements;

    public SortStrategy sortStrategy;

    public VectorNumbers(int[] arrayNumber, int countElements) {
        this.arrayNumber = arrayNumber;
        this.countElements = countElements;
    }


    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort() {
        arrayNumber = sortStrategy.sort(this.arrayNumber, this.countElements);
    }

    public void moveElementsRandowWay() {
        int[] vMix = new int[this.countElements];
        boolean marks[] = new boolean[this.countElements]; // all position in FALSE
        Random rnd = new Random(); // generate random
        for (int i = 0; i < countElements; i++) {
            int currentElement = arrayNumber[i];
            int newPositionFix;
            do {
                newPositionFix = rnd.nextInt(countElements);
            } while (marks[newPositionFix]);
            vMix[newPositionFix] = currentElement;
            marks[newPositionFix] = Boolean.TRUE;
        }
        arrayNumber = vMix;
    }

    @Override
    public String toString() {
        return "VectorNumbers{" +
                "arrayNumber =" + Arrays.toString(arrayNumber) +
                '}';
    }
}
