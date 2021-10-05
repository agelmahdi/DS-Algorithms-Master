package com.agelmahdi.dynamicprogramming;

import static java.lang.Math.max;

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
        return max(p1, p2);

    }

    public int zeroOneKnapsack(int[] profits, int[] weights, int capacity) {
        return this.knapsack(profits, weights, capacity, 0);
    }

    private int knapsackMemo(int[] profits, int[] weights, int[] memo, int capacity, int currentIndex) {
        if (capacity <= 0 || currentIndex < 0 || currentIndex >= profits.length) {
            return 0;
        }
        if (memo[currentIndex] == 0) {
            int p1 = 0;
            if (weights[currentIndex] <= capacity) {
                p1 = profits[currentIndex] + knapsack(profits, weights, capacity - weights[currentIndex], currentIndex + 1);
            }
            int p2 = knapsack(profits, weights, capacity, currentIndex + 1);

            memo[currentIndex] = max(p1, p2);
        }

        return memo[currentIndex];
    }

    public int zeroOneKnapsackMemo(int[] profits, int[] weights, int capacity) {
        int[] memo = new int[profits.length - 1];
        return this.knapsackMemo(profits, weights, memo, capacity, 0);
    }

    public int zeroOneKnapsackTabular(int[] profits, int[] weights, int capacity) {
        int length = profits.length;
        int[][] tabular = new int[length][capacity + 1];

        // if we have only one weight, we will take it if it is not more than the capacity
        for (int c = 0; c <= capacity; c++) {
            if (weights[0] <= c) {
                tabular[0][c] = profits[0];
            }
        }

        for (int i = 1; i < length; i++) {
            for (int c = 1; c <= capacity; c++) {
                int p1 = 0, p2 = 0;
                if (weights[i] <= c) {
                    p1 = profits[i] + tabular[i - 1][c - weights[i]];
                }
                p2 = tabular[i - 1][c];
                tabular[i][c] = Math.max(p1, p2);
            }
        }
        return tabular[length - 1][capacity];
    }
}