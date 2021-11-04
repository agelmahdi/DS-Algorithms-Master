package com.agelmahdi.arrays.challenges;

import java.util.Arrays;

class SingleNumber {

    /*
     *  Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     *  You must implement a solution with a linear runtime complexity and use only constant extra space.
     * */


    // One property of XOR is, if you XOR an element with itself, it will result in zero.
    // For example, if you perform 4 ^ 4 ^ 1, the answer is going to be 1.
    // Since, the problem states that only one element is unique while the rest appear twice,


    public static int singleNumber(int[] nums) {
        int res = 0;

        for (int i : nums)
            res = res ^ i;

        return res;
    }



}
