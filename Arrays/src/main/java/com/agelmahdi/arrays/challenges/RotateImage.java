package com.agelmahdi.arrays.challenges;

import java.util.Arrays;

class RotateImage {

    /*
     * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
     * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
     * DO NOT allocate another 2D matrix and do the rotation.
     */

    public static void rotate(int[][] matrix) {

        int length = matrix.length;

        for (int layer=0; layer < length / 2 ;layer++){

            int last = length - layer - 1;

            for (int cell = layer; cell < last ; cell++){

                int offset = cell - layer;

                int top = matrix[layer][cell];

                matrix[layer][cell] = matrix[last - offset][layer];

                matrix[last - offset][layer] = matrix[last][last-offset];

                matrix[last][last-offset] = matrix[cell][last];

                matrix[cell][last] = top;

            }

        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
