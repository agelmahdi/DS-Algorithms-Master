package com.agelmahdi.matrix;

import java.util.Arrays;

class SearchSortedMatrix {
    /*
     *  1. Given an n x n matrix, where every row and column is sorted in increasing order.
     *  2. Given a number x, how to decide whether this x is in the matrix.
     *  3. Algorithm should have linear time complexity.
     * */

    public boolean searchInMatrix(int[][] matrix, int number) {
        int length = matrix.length;
        int row = 0, col = length - 1;
        System.out.println(Arrays.deepToString(matrix));

        while (row < length && col >= 0) {

            if (matrix[row][col] == number) {
                System.out.println("Number found");
                return true;
            }

            if (matrix[row][col] > number) { // move left
                col--;
            } else { // move down
                row++;
            }
        }
        System.out.println("Number not found");

        return false;
    }
}
