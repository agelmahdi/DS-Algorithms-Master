package com.agelmahdi.dynamicprogramming;

public class Main {
    public static void main(String[] args) {
        FibonacciNumber fib = new FibonacciNumber();
        // System.out.println(fib.fibMemo(10));
        // System.out.println(fib.fibTabular(10));
        // fib.print();
        NumberFactor nf = new NumberFactor();
        // System.out.println(nf.numberFactorMemo(5));
        //  System.out.println(nf.numberFactorTabular(5));

        HouseRobber hr = new HouseRobber();
        int[] houses = {6, 7, 1, 30, 8, 2, 4};
        // System.out.println(hr.maxValueMemo(houses));
        // System.out.println(hr.maxValueTabular(houses));

        ConvertStrToAnother cs = new ConvertStrToAnother();
//        System.out.println(cs.findMinOperationsMemo("table","tbres"));
//        System.out.println(cs.convertStrTabular("table","tbres"));
//        cs.printChanges();

        ZeroOneKnapsack zeroOneKnapsack = new ZeroOneKnapsack();
        int[] profits = {31, 26, 17, 72};
        int[] weights = {3, 1, 2, 5};
//        System.out.println(zeroOneKnapsack.zeroOneKnapsack(profits, weights, 7));
//        System.out.println(zeroOneKnapsack.zeroOneKnapsackMemo(profits, weights, 7));
//        System.out.println(zeroOneKnapsack.zeroOneKnapsackTabular(profits, weights, 7));

        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
//        System.out.println(lcs.lcsRecursion("elephant", "erepat"));
//        System.out.println(lcs.lcsMemo("elephant", "erepat"));
//        System.out.println(lcs.lcsTabular("elephant", "erepat"));
//        lcs.printLCS();

        LongestPalindromicSubsequence lpcs = new LongestPalindromicSubsequence();
        System.out.println(lpcs.findLPSQRecursion("elrmenment"));
        System.out.println(lpcs.findLPSQMemo("a"));
    }
}