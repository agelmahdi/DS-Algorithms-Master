package com.agelmahdi.arrays.challenges;

class TimeToBuy {

    public static int maxProfit(int[] prices) {

        if (prices.length == 0) return 0;
        int i = 0;
        int max = 0;

        for (int j = 1; j < prices.length; j++) {
            if (prices[i] > prices[j]) {
                i++;
            } else {
                max += prices[j] - prices[i];
                i = j;
            }
        }
        return max;
    }
}
