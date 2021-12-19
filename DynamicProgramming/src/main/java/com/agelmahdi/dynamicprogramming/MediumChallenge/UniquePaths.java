package com.agelmahdi.dynamicprogramming.MediumChallenge;

class UniquePaths {
    /* A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
    The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
    How many possible unique paths are there?
    * */
    public static void main(String[] args) {

        uniquePathsMathSolution(3,7);
    }


    public static int uniquePathsMathSolution(int m, int n) {
        if (m == 1 || n == 1)
            return 1;
        m--;
        n--;
        // Swap, so that m is the bigger number
        if (m < n) {
            m = m + n;
            n = m - n;
            m = m - n;
        }
        long res = 1;
        int j = 1;
        // Instead of taking factorial, keep on multiply & divide
        for (int i = m + 1; i <= m + n; i++, j++) {
            res *= i;
            res /= j;
        }

        return (int) res;
    }
}
