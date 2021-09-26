package com.agelmahdi.greedy_algorithms.CoinChange;

public class Main {
    public static void main(String[] args) {
        int[] arr= {1,2,5,10,20,50,100,1000};
        CoinsChange coins = new CoinsChange(arr);
        coins.changeAmountToCoins(49);
    }



}
