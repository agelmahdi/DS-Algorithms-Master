package com.agelmahdi.dynamicprogramming.CodeChallenge;

import java.util.Arrays;

public class BestTimeBuySell {

    public static void main(String[] args) {

        int[] prices = {7, 6, 4, 3, 1};
        int[] prices2 = {2, 1, 2, 1, 0, 1, 2};
        maxProfit(prices2);
    }

    public static int maxProfit(int[] prices) {

        int max = 0, min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min)
                min = price;
            else if (price > min)
                max = Math.max(price - min, max);
        }
        return max;
    }

}
