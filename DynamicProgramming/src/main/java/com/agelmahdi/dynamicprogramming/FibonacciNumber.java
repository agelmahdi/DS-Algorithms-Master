package com.agelmahdi.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;

class FibonacciNumber {
    private final HashMap<Integer, Integer> hashMap = new HashMap<>();
    private final ArrayList<Integer> tabular = new ArrayList<>();


    // Time complexity O(n)
    // Space complexity O(n)
    private int fibMemoization(int n, HashMap<Integer, Integer> memo) {
        if (n == 1 || n <= 0) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            int fib = fibMemoization(n - 1, memo) + fibMemoization(n - 2, memo);
            memo.put(n, fib);
        }

        return memo.get(n);

    }

    public int fibMemo(int n) {
        return fibMemoization(n, hashMap);
    }

    // Time complexity O(n)
    // Space complexity O(n)
    public int fibTabular(int n) {
        tabular.add(0);
        tabular.add(1);

        for (int i = 2; i <= n - 1; i++) {
            int n1 = tabular.get(i - 1);
            int n2 = tabular.get(i - 2);
            tabular.add(n1 + n2);
        }

        return tabular.get(n - 1);
    }

    public void print() {
        for (int i = 0; i < tabular.size(); i++) {
            System.out.print(tabular.get(i) + " ");
        }
    }
}
