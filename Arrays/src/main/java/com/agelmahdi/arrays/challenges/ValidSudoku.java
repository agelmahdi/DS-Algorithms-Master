package com.agelmahdi.arrays.challenges;

import java.util.HashSet;
import java.util.Set;

class ValidSudoku {

    /*
    * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
    * Each row must contain the digits 1-9 without repetition.
    * Each column must contain the digits 1-9 without repetition.
    * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
    *
    * Note:
    * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
    * Only the filled cells need to be validated according to the mentioned rules.
    *
    * */

    // Response Time 1 ms
    public boolean isValidSudoku(char[][] board) {
        boolean[][] horizontals = new boolean[9][9];
        boolean[][] verticals = new boolean[9][9];
        boolean[][] cells = new boolean[9][9];
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == '.') {
                    continue;
                }
                int k = board[i][j] - '1';
                int x = i / 3 * 3 + j / 3;
                if (horizontals[i][k] || verticals[j][k] || cells[x][k]) {
                    return false;
                }
                horizontals[i][k] = true;
                verticals[j][k] = true;
                cells[x][k] = true;
            }
        }
        return true;
    }

    //Response Time 17 ms
    public static boolean validSudoku(char[][] matrix) {
        Set<String> seen = new HashSet<String>();
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                char number = matrix[i][j];
                if (number != '.')
                    if (!seen.add(number + " in row " + i) ||
                            !seen.add(number + " in column " + j) ||
                            !seen.add(number + " in block " + i / 3 + "-" + j / 3))
                        return false;
            }
        }
        return true;
    }

}
