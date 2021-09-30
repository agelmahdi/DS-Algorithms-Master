package com.agelmahdi.divideconqueralgorithms;

public class Main {
    public static void main(String[] args) {

        NumberFactor numberOfWays = new NumberFactor();
        // System.out.println(numberOfWays.factor(9));

        int[] Houses = {6, 7, 1, 30, 8, 2, 4};
        HouseRobber houseRobber = new HouseRobber();
        //  System.out.println(houseRobber.maxValue(Houses));

        ConvertStringToAnother convertStringToAnother = new ConvertStringToAnother();
        // System.out.println(convertStringToAnother.findMinOperations("table","tbres"));

        ZeroOneKnapsack zeroOneKnapsack = new ZeroOneKnapsack();
        int[] profits = {31, 26, 17, 72};
        int[] weights = {3, 1, 2, 5};
        System.out.println(zeroOneKnapsack.zeroOneKnapsack(profits, weights, 7));

    }
}