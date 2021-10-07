package com.agelmahdi.matrix;

import java.util.Arrays;

class MaximumSizeSquare {
    /*
     * 1. Given a binary matrix
     * 2. Find out the maximum size square sub matrix with all 1's
     * */

    public void printMaxSubSquare(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] subMatrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            subMatrix[i][0] = matrix[i][0];
        }

        for (int i = 0; i < col; i++) {
            subMatrix[0][i] = matrix[0][i];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == 1) {
                    int sub1 = subMatrix[i - 1][j - 1];
                    int sub2 = subMatrix[i][j - 1];
                    int sub3 = subMatrix[i - 1][j];
                    subMatrix[i][j] = Math.min(sub1, Math.min(sub2, sub3)) + 1;
                } else {
                    subMatrix[i][j] = 0;
                }
            }
        }

        int maxOfSubMatrix = subMatrix[0][0];

        int max_i = 0, max_j = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (maxOfSubMatrix < subMatrix[i][j]) {
                    maxOfSubMatrix = subMatrix[i][j];
                    max_i = i;
                    max_j = j;
                }
            }
        }

        for (int i = max_i; i > max_i - maxOfSubMatrix; i--) {
            for (int j = max_j; j > max_j - maxOfSubMatrix; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
