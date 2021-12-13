package com.agelmahdi.dynamicprogramming.CodeChallenge;

import java.util.Arrays;

public class ClimbingStairs {

    public static void main(String[] args) {

        climbStairs(3);
    }

    public static int climbStairs(int n) {

        int []tabular = new int[n + 2];
        tabular[0] = 0;
        tabular[1] = 1;
        tabular[2] = 2;
        for (int i = 3; i<= n; i++){
            tabular[i] = tabular[i-1] + tabular[i-2];
        }

        System.out.println(Arrays.toString(tabular));
        System.out.println(tabular[n]);
        return tabular[n];


    }
    public static int climbStairs2(int n) {

        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        if(n == 2){
            return 2;
        }

        return climbStairs2(n - 1) + climbStairs2(n - 2);
    }
}
