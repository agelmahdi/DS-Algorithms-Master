package com.agelmahdi.matrix;

public class Main {
    public static void main(String[] args) {
        int [][]matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };

        SearchSortedMatrix sortedMatrix = new SearchSortedMatrix();
     //   sortedMatrix.searchInMatrix(matrix,4);

        int [][]binaryMatrix = {
                {1,0,0,1},
                {1,1,1,0},
                {1,0,0,1},
                {1,0,0,1},
                {1,1,1,0},
        };

        PrintUniqueRows printUniqueRows = new PrintUniqueRows();
        //printUniqueRows.uniqueMatrix(binaryMatrix);
        printUniqueRows.uniqueMatrixOptimal(binaryMatrix);
    }
}