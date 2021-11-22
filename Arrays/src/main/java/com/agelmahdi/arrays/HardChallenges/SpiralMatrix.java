package com.agelmahdi.arrays.HardChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {

        /*
         * Given an m x n matrix, return all elements of the matrix in spiral order.
         *
         * */

        int row = 0;
        int col = 0;

        List<Integer> list = new ArrayList<>();

        int lengthCol = matrix[0].length - 1;

        int lengthRow = matrix.length - 1;

        while (row <= lengthRow && col <= lengthCol) {

            for (int i = col; i <= lengthCol; i++) {
                list.add(matrix[row][i]);
            }
            row++;

            for (int i = row; i <= lengthRow; i++) {
                list.add(matrix[i][lengthCol]);
            }
            lengthCol--;

            if (row <= lengthRow) {
                for (int i = lengthCol; i >= col; i--) {
                    list.add(matrix[lengthRow][i]);
                }
            }

            lengthRow--;
            if (col <= lengthCol) {
                for (int i = lengthRow; i >= row; i--) {
                    list.add(matrix[i][col]);
                }
            }
            col++;
        }


        System.out.println(Arrays.toString(new List[]{list}));

        return list;

    }
}
