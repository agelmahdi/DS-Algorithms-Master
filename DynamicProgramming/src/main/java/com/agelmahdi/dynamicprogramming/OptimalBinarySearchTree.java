package com.agelmahdi.dynamicprogramming;

import java.util.Arrays;

class OptimalBinarySearchTree {

    /*
     *  1. Given a sequence of BST of keys and its frequencies.
     *  2. Find the cost of optimal BST.
     *
     *  -> formula - cost[i,j] = min{c[i, k-1]+ c[k,j]} + w(i,j)
     *                       i < k <= j
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
        return w;
    }


    /*
     *  1. Given a sequence of BST of keys and its Successful and Unsuccessful Probabilities.
     *  2. Find Find the cost of optimal BST .
     *
     *  -> formulas
     *      weight[i,j] = w[i, j-1]+ p_j + q_j
     *      cost[i,j] = min{c[i, k-1]+ c[k,j]} + w(i,j)
     *          i < k <= j
     * */

    public int optimalBinarySearchTree(int []keys, int []found, int []unfound) {

        int length = keys.length;
        int[][] cost = new int[length+1][length+1];
        int[][] freq = new int[length+1][length+1];
        int j;
        for (int i = 1; i <= length; i++) {
            freq[i][i-1] = unfound[i-1];
            cost[i][i-1] = found[i-1];
        }
        for (int d = 1; d <= length; d++) {
            for (int i = 1; i < length - d + 1; i++) {
                j = i + d - 1;
                freq[i][j] = freq[i][j - 1] + found[j] + unfound[j];
                cost[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j; k++) {
//                    int c = cost[i][k - 1] + cost[k + 1][j] + freq[i][j];
//                    if (c < cost[i][j])
//                        cost[i][j] = c;
                }
            }
        }
        System.out.println(Arrays.deepToString(freq));
        return 0;
    }
}
