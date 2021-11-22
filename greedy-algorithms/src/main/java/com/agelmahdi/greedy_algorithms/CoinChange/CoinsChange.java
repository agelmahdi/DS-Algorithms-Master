package com.agelmahdi.greedy_algorithms.CoinChange;

import java.util.Arrays;

class CoinsChange {

    private final int[] coins;

    public CoinsChange(int[] coins) {
        this.coins = coins;
    }

    public void changeAmountToCoins(int amount) {
        Arrays.sort(coins);
        int index = coins.length - 1;
        do {
            int coinValue = coins[index];
            index--;
            int maxAmount = (amount / coinValue) * coinValue;
            if (maxAmount > 0) {
                System.out.println("Coin value: " + coinValue + " taken count: " + (amount / coinValue));
                amount = amount - maxAmount;
            }
        } while (amount != 0);
    }
}
