package com.agelmahdi.dynamicprogramming;

import java.util.HashMap;

class FibonacciMemoization {
    private final HashMap<Integer,Integer> hashMap = new HashMap<>();
    private int fib(int n, HashMap<Integer,Integer> memo){
        if (n==1 || n <=0){
            return 0;
        }
        if (n==2){
            return 1;
        }
        if (!memo.containsKey(n)){
            int fib = fib(n-1,memo) +fib(n-2,memo);
            memo.put(n, fib);
        }

        return memo.get(n);

    }

    public int fib(int n){
        return fib(n,hashMap);
    }


}
