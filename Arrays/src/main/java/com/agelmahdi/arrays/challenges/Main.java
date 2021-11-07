package com.agelmahdi.arrays.challenges;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int[] nums = {1, 3, 1, -1, 3};
        //  System.out.println(SingleNumber.singleNumber(nums));

        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};

//        System.out.println(Arrays.toString(IntersectionOfTwoArrays.intersect(arr1,arr2)));
//        System.out.println(Arrays.toString(IntersectionOfTwoArrays.intersect2(arr1,arr2)));
//        System.out.println(Arrays.toString(IntersectionOfTwoArrays.intersect3(arr1,arr2)));
        //    System.out.println(Arrays.toString(IntersectionOfTwoArrays.intersect4(arr1,arr2)));

        int[] digits = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6};
        int[] digits2 = {9, 9};
        // System.out.println(Arrays.toString(PlusOne.plusOne(digits2)));

        // int []arr = {0,1};
        // MoveZeroes.moveZeroes(arr);
        int[] arr = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6};
        int[] arr3 = {7, 11, 15, 2};
        int[] arr4 = {1, 11, 7, 2};
        int[] arr5 = {-1, -2, -3, -4, -5};
        int[] arr6 = {-10, -1, -18, -19};

        // System.out.println(Arrays.toString(TwoSum.twoSum2(arr4, 9)));

        char[][] board =
                {
                        {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}

                };

        char[][] invalid =
                {
                        {'8', '3', '.', '.', '7', '.', '.', '.', '.'}
                        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}

                };

        System.out.println(ValidSudoku.validSudoku(invalid));


    }
}
