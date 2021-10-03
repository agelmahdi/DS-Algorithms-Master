package com.agelmahdi.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;

class NumberFactor {

    private int numFactorMemo(int number, int[] memo) {
        if (number == 0 || number == 1 || number == 2) {
            return 1;
        }
        if (number == 3) {
            return 2;
        }
        if (memo[number] == 0) {
           int sub1 = numFactorMemo(number - 1, memo);
           int sub2 = numFactorMemo(number - 3, memo);
           int sub3 = numFactorMemo(number - 4, memo);
            memo[number] = sub1 + sub2 + sub3;
        }

        return memo[number];

    }
    public int numberFactorMemo(int number){
        int []memo = new int[number + 1];
        return numFactorMemo(number,memo);
    }

}
