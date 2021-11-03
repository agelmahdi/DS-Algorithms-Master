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
//        System.out.println(lpcs.findLPSQRecursion("elrmenment"));
//        System.out.println(lpcs.findLPSQMemo("a"));

        MatrixChainMultiplication multiplication = new MatrixChainMultiplication();
        int[] seq = {5, 4, 6, 2,7};

    //    System.out.println(multiplication.matrixChainOrderRecursion(seq,1,seq.length-1));
       // System.out.println(multiplication.matrixMultiplicationTabular(seq));

        MultiStageGraph multiStageGraph = new MultiStageGraph();
//        int[][] matrix = new int[][]{{0, 1, 2, 5, 0, 0, 0, 0},
//                {0, 0, 0, 0, 4, 11, 0, 0},
//                {0, 0, 0, 0, 9, 5, 16, 0},
//                {0, 0, 0, 0, 0, 0, 2, 0},
//                {0, 0, 0, 0, 0, 0, 0, 18},
//                {0, 0, 0, 0, 0, 0, 0, 13},
//                {0, 0, 0, 0, 0, 0, 0, 2}};
//       System.out.println(multiStageGraph.minPathCost(matrix)) ;

        OptimalBinarySearchTree optimalBinarySearchTree = new OptimalBinarySearchTree();
        int[] keys = {10, 20, 30, 40};
        int[] freq = {4, 2, 6, 3};
        System.out.println(optimalBinarySearchTree.optimalBinarySearchTree(keys,freq));

        int found[] = {3, 3, 1, 1};
        int unfound[] = {2, 3, 1, 1, 1};

        System.out.println(optimalBinarySearchTree.optimalBinarySearchTree(keys,found,unfound));

    }
}