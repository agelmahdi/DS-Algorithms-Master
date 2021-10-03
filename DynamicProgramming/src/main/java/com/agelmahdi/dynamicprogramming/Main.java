package com.agelmahdi.dynamicprogramming;

public class Main {
    public static void main(String[] args) {
        FibonacciNumber fib = new FibonacciNumber();
       // System.out.println(fib.fibMemo(10));
       // System.out.println(fib.fibTabular(10));
       // fib.print();
        NumberFactor nf = new NumberFactor();
        System.out.println(nf.numberFactorMemo(5));
        System.out.println(nf.numberFactorTabular(5));
    }
}