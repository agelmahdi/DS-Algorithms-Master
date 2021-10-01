package com.agelmahdi.divideconqueralgorithms;

class NumberOfPathsToReachLast {

    /*
     * 1. 2D matrix is given
     * 2. Each cell has a cost associated with it for accessing
     * 3. we need to start from (0,0) cell and go till (n-1,n-1) cell
     * 4. we need to go only right or down cell from current cell
     * 5. we are given total cost to reach last cell
     * 5. find the number of ways to reach end of matrix with a given cost
     * */

    private int numberOfPathsToReachLast(int[][] matrix, int row, int col, int cost) {
        if (cost == 0) {
            return 0; // reach the out of cost
        }
        if (row == 0 && col == 0) { // at the first cell
            if (matrix[row][col] - cost == 0) {
                return 1;
            } else return 0;
        }
        if (row == 0) { // at the first row we are not going to the left
            return numberOfPathsToReachLast(matrix, 0, col - 1, cost - matrix[row][col]);
        }

        if (col == 0) { // at the first col we can only go up
            return numberOfPathsToReachLast(matrix, row - 1, 0, cost - matrix[row][col]);
        }

        int sub1 = numberOfPathsToReachLast(matrix, row - 1, col, cost - matrix[row][col]);
        int sub2 = numberOfPathsToReachLast(matrix, row, col - 1, cost - matrix[row][col]);
        return sub1 + sub2;


    }


    public int findNOPTRLC(int[][] matrix, int cost) {
        return numberOfPathsToReachLast(matrix, matrix.length - 1, matrix[0].length - 1,cost);
    }



}
