package com.agelmahdi.divideconqueralgorithms;

public class Main {
    public static void main(String[] args) {

        NumberFactor numberOfWays = new NumberFactor();
        // System.out.println(numberOfWays.factor(9));

        int[] Houses = {6, 7, 1, 30, 8, 2, 4};
        HouseRobber houseRobber = new HouseRobber();
        //  System.out.println(houseRobber.maxValue(Houses));

        ConvertStringToAnother convertStringToAnother = new ConvertStringToAnother();
         System.out.println(convertStringToAnother.findMinOperations("table","tbres"));

        ZeroOneKnapsack zeroOneKnapsack = new ZeroOneKnapsack();
        int[] profits = {31, 26, 17, 72};
        int[] weights = {3, 1, 2, 5};
        // System.out.println(zeroOneKnapsack.zeroOneKnapsack(profits, weights, 7));

        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        // System.out.println(lcs.findMaxLCSQ("elephant","erepat"));

        LongestPalindromicSubsequence lpcs = new LongestPalindromicSubsequence();
        // System.out.println(lpcs.findLPSQ("elrmenmet"));

        MinimumCostReachLastCell mc = new MinimumCostReachLastCell();

//        int [][]matrix = {
//                {4,7,8,6,4},
//                {6,7,3,9,2},
//                {3,8,1,2,4},
//                {7,1,7,3,7},
//                {2,9,8,9,3},
//        };

        // System.out.println(mc.findMCTLC(matrix));

        NumberOfPathsToReachLast nop = new NumberOfPathsToReachLast();

        int[][] matrix = {
                {4, 7, 1, 6},
                {5, 7, 3, 9},
                {3, 2, 1, 2},
                {7, 1, 6, 3},

        };
      //  System.out.println(nop.findNOPTRLC(matrix, 25));


    }
}