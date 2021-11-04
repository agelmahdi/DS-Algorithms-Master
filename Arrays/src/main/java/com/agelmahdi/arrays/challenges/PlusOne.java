package com.agelmahdi.arrays.challenges;

import java.util.Arrays;

class PlusOne {

    /*
     * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
     * The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
     * Increment the large integer by one and return the resulting array of digits.
     * */
    public static int[] plusOne(int[] digits) {

        if (digits.length > 100 || digits.length == 0) throw new IllegalArgumentException();

        int startIndex = 0;

        if (digits[0] == 0 && digits.length > 1) {
            startIndex = 1;
        }

        for (int i = digits.length - 1; i >= startIndex; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;
    }

}
