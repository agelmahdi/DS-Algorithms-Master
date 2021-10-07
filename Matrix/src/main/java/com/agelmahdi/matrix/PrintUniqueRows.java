package com.agelmahdi.matrix;

import java.util.HashSet;

class PrintUniqueRows {
    /*
     * 1. Given a binary matrix
     * 2. Print all unique rows of a given matrix
     * */

    // Time complexity: O( ROW^2 x COL )
    // Space complexity O(1)
    public void uniqueMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            int flag = 0;
            for (int j = 0; j < i; j++) {
                flag = 1;
                for (int k = 0; k < col; k++) {
                    if (matrix[i][k] != matrix[j][k]) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1) {
                    break;
                }
            }
            if (flag == 0) {
                for (int j = 0; j < col; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    // Time complexity: O( ROW x COL )
    // Space complexity: O( ROW )
    public void uniqueMatrixOptimal(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < row; i++) {
            StringBuilder key = new StringBuilder();
            for (int j = 0; j < col; j++) {
                key.append(matrix[i][j]).append(" ");
            }

            if (!set.contains(key.toString())) {
                set.add(key.toString());
                System.out.println(key);
            }
        }

    }

}
