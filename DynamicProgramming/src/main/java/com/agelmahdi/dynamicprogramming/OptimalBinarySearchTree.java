package com.agelmahdi.dynamicprogramming;

import java.util.Arrays;

class OptimalBinarySearchTree {

    /*
     *  1. Given a sequence of BST of keys and its frequencies.
     *  2. Find the cost of optimal BST.
     *
     *  -> formula = min{c[i, k-1]+ c[k,j]} + w(i,j)
     *  -> i < k <= j
     * */

    public int optimalBinarySearchTree(int[] keys, int[] frequencies) {
        int length = keys.length;
        int[][] tabular = new int[length][length];
        int j;

        for (int i = 0; i < length; i++)
            tabular[i][i] = frequencies[i];

        for (int d = 1; d <= length; d++) {
            for (int i = 0; i < length - d + 1; i++) {
                j = i + d - 1;
                tabular[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j; k++) {
                    int c = ((k > i) ? tabular[i][k - 1] : 0) + ((k < j) ? tabular[k + 1][j] : 0) + weight(frequencies, i, j);
                    if (c < tabular[i][j])
                        tabular[i][j] = c;
                }
            }
        }

        return tabular[0][length - 1];
    }

    private int weight(int[] freq, int i, int j) {
        int w = 0;
        for (int k = i; k <= j; k++) {
            w += freq[k];
        }
        System.out.println("i= " + i + " j= " + j + " weight= " + w);
        return w;
    }

}
