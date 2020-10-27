package com.masterengineerficct.strategypattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class VectorNumberApp {


    public static void main(String[] args) {

        int[] vParam = new int[]{4, 51, 5, 12, 451, 32};
        VectorNumbers vectorNumbers = new VectorNumbers(
                vParam, vParam.length
        );

        // Aplicando nueva estrategia de ordenamiento
        vectorNumbers.setSortStrategy(new SortStrategy() {
            @Override
            public int[] sort(int[] v, int countElements) {
                List<Integer> listNumbers =  Arrays.stream(v)
                        .boxed()
                        .collect(Collectors.toList());Collectors.toList();
                listNumbers.sort((o1, o2) -> ((Integer)o1).compareTo((Integer)o2));
                System.out.println(listNumbers);
                return listNumbers.stream()
                        .mapToInt( i -> (Integer) i).toArray();
            }
        });
        vectorNumbers.sort();
        System.out.println("Aplicando la tecnica de ordenamiento anonima");
        System.out.println(vectorNumbers);

        // Mezclando nuevamente los elementos del vector
        vectorNumbers.moveElementsRandowWay();

        System.out.println("Mezclando nuevamente los elementos del vector");
        System.out.println(vectorNumbers);

        // Aplicando nueva estrategia de ordenamiento de intercambio
        vectorNumbers.setSortStrategy(new SwapSortStrategy());
        System.out.println("Aplicando el primer ordenamiento");
        vectorNumbers.sort();
        System.out.println(vectorNumbers);


    }
}
