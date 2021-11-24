package com.agelmahdi.arrays.HardChallenges;

import java.util.Arrays;

public class GameOfLife {
    /*
     * The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0).
     * Each cell interacts with its eight neighbors (horizontal, vertical, diagonal)
     * using the following four rules (taken from the above Wikipedia article):
     *  1 - Any live cell with fewer than two live neighbors dies as if caused by under-population.
     *  2 - Any live cell with two or three live neighbors lives on to the next generation.
     *  3 - Any live cell with more than three live neighbors dies, as if by over-population.
     *  4 - Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
     *
     * The next state is created by applying the above rules simultaneously to every cell in the current state,
     * where births and deaths occur simultaneously.
     * Given the current state of the m x n grid board, return the next state.
     * */

    public static void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;

        int[][] tempBoard = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tempBoard[i][j] = board[i][j];
            }
        }

        for (int row = 0; row < n; row++) {
            int top = row - 1;
            int bottom = row + 1;
            for (int col = 0; col < m; col++) {

                int left = col - 1;
                int right = col + 1;
                int count = 0;

                if (top >= 0) {

                    if (tempBoard[top][col] == 1) {
                        count++;
                    }
                }

                if (bottom < n) {
                    if (tempBoard[bottom][col] == 1) {
                        count++;
                    }
                }

                if (left >= 0) {

                    if (tempBoard[row][left] == 1) {
                        count++;
                    }
                }


                if (right < m) {

                    if (tempBoard[row][right] == 1) {
                        count++;
                    }
                }

                if (top >= 0 && left >= 0) {

                    if (tempBoard[top][left] == 1) {
                        count++;
                    }
                }

                if (top >= 0 && right < m) {

                    if (tempBoard[top][right] == 1) {
                        count++;
                    }
                }

                if (bottom < n && left >= 0) {

                    if (tempBoard[bottom][left] == 1) {

                        count++;
                    }
                }
                if (bottom < n && right < m) {

                    if (tempBoard[bottom][right] == 1) {
                        count++;
                    }
                }


                if (tempBoard[row][col] == 1) {

                    if (count == 2 || count == 3) {
                        board[row][col] = 1;
                    } else {
                        board[row][col] = 0;
                    }
                } else {
                    if (count == 3) {
                        board[row][col] = 1;
                    }
                }

            }
        }

        System.out.println(Arrays.deepToString(board));

    }


}
