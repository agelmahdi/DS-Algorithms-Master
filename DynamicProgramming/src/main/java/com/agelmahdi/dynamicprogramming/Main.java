package com.agelmahdi.dynamicprogramming;

public class Main {
    public static void main(String[] args) {
        FibonacciNumber fib = new FibonacciNumber();
        System.out.println(fib.fibMemo(10));
        System.out.println(fib.fibTabular(10));
        fib.print();
    }
}