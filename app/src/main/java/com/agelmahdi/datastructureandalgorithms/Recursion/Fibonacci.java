package com.agelmahdi.datastructureandalgorithms.Recursion;

public class Fibonacci {

    public static void main(String[] args) {

        Fibonacci myClass = new Fibonacci();
        myClass.fib(3);

    }

    /*Sequence of numbers in which each number is the sum of the two preceding once and the sequence starts from 0,1
     * 0,1,1,2,3,5,8,13 .......
     */

    public int fib(int n) {

        //Step 1: Recursive case - the Flow
        int theFlow = fib(n - 1) + fib(n - 2);


        return theFlow;
    }

}
