package com.agelmahdi.greedy_algorithms.Fractionalknapsack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class FractionalKnapsackProblem {

    /*
     * 1. Calculate the density or ratio of each item
     * 2. Sort items DES based on this ratio
     * 3. Take items with the highest density sequentially until weight allows
     * 4. Add the next item as much (fractional) as we can
     * */

    public static void knapSack(ArrayList<KnapsackItem> knapsackItems, int capacity) {

        Comparator<KnapsackItem> comparator = new Comparator<KnapsackItem>() {
            @Override
            public int compare(KnapsackItem o1, KnapsackItem o2) {
                if (o2.getRatio() > o1.getRatio()) return 1;
                else return -1;
            }
        };

        Collections.sort(knapsackItems, comparator);

        int inUseCapacity = 0;
        double maxValue = 0;

        for (KnapsackItem kanpsack : knapsackItems) {
            if (inUseCapacity + kanpsack.getWeight() <= capacity) {
                inUseCapacity += kanpsack.getWeight();
                maxValue += kanpsack.getValue();
                System.out.println("Included: " + kanpsack);
            } else {
                int remainingCapacity = capacity - inUseCapacity;
                double allocated = kanpsack.getRatio() * remainingCapacity;
                maxValue += allocated;
                inUseCapacity += remainingCapacity;
                System.out.println("Included: " + kanpsack + " remaining: " + remainingCapacity + ", allocated: " + allocated);
            }

            if (inUseCapacity == capacity) break;

        }

        System.out.println("Max value: " + maxValue);


    }
}
