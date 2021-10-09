package com.agelmahdi.dynamicprogramming;

import java.util.Arrays;

class MatrixChainMultiplication {
    /*
     *  1. Given a sequence of matrices.
     *  2. Find the most efficient way to multiply these matrices together
     *
     *  - formula c[i,j] = min {c[i,k] + c[k+1,j] + d_i-1 * d_K * d_J}
     *  - i <= k < j
     * */

    public int matrixChainOrderRecursion(int p[], int i, int j) {
        if (i == j)
            return 0;

        int min = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int count = matrixChainOrderRecursion(p, i, k)
                    + matrixChainOrderRecursion(p, k + 1, j)
                    + p[i - 1] * p[k] * p[j];

            if (count < min)
                min = count;
        }

        return min;
    }

    public int matrixMultiplicationTabular(int[] chain) {
        int n = chain.length;
        int[][] tabular = new int[n][n];
        int j;
        for (int d = 1; d < n - 1; d++) {
            for (int i = 1; i < n - d; i++) {
                j = i + d;
                tabular[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    int sub1 = tabular[i][k] + tabular[k + 1][j] + chain[i - 1] * chain[k] * chain[j];
                    int sub2 = tabular[i][j];
                    tabular[i][j] = Math.min(sub1, sub2);
                }

            }
        }
        return tabular[1][n - 1];
    }


}
