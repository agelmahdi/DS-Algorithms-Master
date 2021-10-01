package com.agelmahdi.divideconqueralgorithms;

class MinimumCostReachLastCell {
    /*
     * 1. 2D matrix is given
     * 2. Each cell has a cost associated with it for accessing
     * 3. we need to start from (0,0) cell and go till (n-1,n-1) cell
     * 4. we need to go only right or down cell from current cell
     * 5. find the way in which the cost is minimum
     * */

    private int minimumCostReachLastCell(int[][] matrix, int row, int col) {
        if (row == -1 || col == -1) {
            return Integer.MAX_VALUE;
        }
        if (col == 0 && row == 0) {
            return matrix[row][col];
        }

        int sub1 = minimumCostReachLastCell(matrix, row - 1, col);
        int sub2 = minimumCostReachLastCell(matrix, row, col - 1);

        return matrix[row][col] + Math.min(sub1, sub2);
    }

    public int findMCTLC(int[][] matrix) {
        return minimumCostReachLastCell(matrix, matrix.length - 1, matrix[0].length - 1);
    }

}
