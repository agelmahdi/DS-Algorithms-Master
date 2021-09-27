package com.agelmahdi.greedy_algorithms.Fractionalknapsack;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        ArrayList<KnapsackItem> knapsackItems = new ArrayList<>();
        int[] values = {100, 120, 60};
        int[] weights = {20, 30, 10};
        for (int i = 0; i < values.length; i++) {
            knapsackItems.add(new KnapsackItem(i + 1, weights[i], values[i]));
        }
        FractionalKnapsackProblem.knapSack(knapsackItems, 50);
    }
}
