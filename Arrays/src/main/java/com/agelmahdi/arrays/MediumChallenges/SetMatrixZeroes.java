package com.agelmahdi.arrays.MediumChallenges;

import java.util.Arrays;

public class SetMatrixZeroes {

    /*
     * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.
     * You must do it in place.
     * */

    // response time 1ms
    public static void setZeroes(int[][] matrix) {

        int[][] temp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 0, temp[i], 0, matrix[0].length);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (temp[i][j] == 0) {
                    convertRowToZero(matrix, i);
                    convertColToZero(matrix, j);
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));

    }

    // response time
    public static void setZeroes2(int[][] matrix) {

        boolean isColZero = false;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                isColZero = true;
            }
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        for (int r = matrix.length - 1; r >= 0; r--) {
            for (int c = matrix[0].length - 1; c >= 1; c--) {
                if (matrix[r][0] == 0 || matrix[0][c] == 0) {
                    matrix[r][c] = 0;
                }
            }

            if (isColZero) matrix[r][0] = 0;
        }
        System.out.println(Arrays.deepToString(matrix));

    }


    private static void convertColToZero(int[][] matrix, int j) {
        int max = Integer.MAX_VALUE;
        for (int x = 0; x < matrix.length; x++) {
            if (matrix[x][j] == max) {
                continue;
            }
            matrix[x][j] = 0;
        }
    }

    private static void convertRowToZero(int[][] matrix, int i) {
        int max = Integer.MAX_VALUE;

        for (int x = 0; x < matrix[0].length; x++) {
            if (matrix[i][x] == max) {
                continue;
            }
            matrix[i][x] = 0;
        }
    }
}
