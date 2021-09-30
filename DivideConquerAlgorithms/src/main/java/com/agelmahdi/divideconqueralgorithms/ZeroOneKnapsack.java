package com.agelmahdi.divideconqueralgorithms;

class ZeroOneKnapsack {
    /*
     * 1. Given the weights and profits of N items
     * 2. Find the max profit within a given capacity
     * 3. items cannot be broken
     * */

    private int knapsack(int[] profits, int[] weights, int capacity, int currentIndex) {
        if (currentIndex < 0 || capacity <= 0 || currentIndex >= profits.length) {
            return 0;
        }
        int p1 = 0;
        if (weights[currentIndex] <= capacity) {
            p1 = profits[currentIndex] + knapsack(profits, weights, capacity - weights[currentIndex], currentIndex + 1);
        }
        int p2 = knapsack(profits, weights, capacity, currentIndex + 1);

        return Math.max(p1, p2);

    }

    public  int zeroOneKnapsack(int[] profits, int[] weights, int capacity){
        return this.knapsack(profits,weights,capacity,0);
    }
}
