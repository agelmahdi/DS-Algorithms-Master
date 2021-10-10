package com.agelmahdi.dynamicprogramming;

import java.util.Arrays;

class MultiStageGraph {
    /*
     *  1. it is a weighted directed graph
     *  2. its vertices are divided into stages
     *  3. useful for representing resource allocation
     * 4.  find the minimum cost path
     *
     * - formula
     *  1. cost(i,j) = min {c (i,k) + cost(i+1,k)}
     *  2. <j,k> belongs to Edge
     *  3. "k" belongs to vertex_i+1
     * */

    public int minPathCost(int[][] matrix) {
        int n = matrix[0].length;
        int []cost = new int[n];
        cost[n-1] = 0;

        for (int i = n - 2; i >= 0; i--){
            cost[i] = Integer.MAX_VALUE;
            for (int k = i; k < n; k++){
                if (matrix[i][k] ==0 ){
                    continue;
                }
                cost[i] = Math.min(cost[i], matrix[i][k]+ cost[k]);

            }
        }
        return cost[0];
    }
}
