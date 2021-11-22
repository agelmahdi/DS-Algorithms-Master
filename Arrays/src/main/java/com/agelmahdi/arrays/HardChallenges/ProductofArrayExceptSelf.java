package com.agelmahdi.arrays.HardChallenges;

import java.util.Arrays;

class ProductofArrayExceptSelf {

    /*
     * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     * You must write an algorithm that runs in O(n) time and without using the division operation.
     *
     *  Follow up: Can you solve the problem in O(1) extra space complexity?
     * (The output array does not count as extra space for space complexity analysis.)
     * */

    public static int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        result[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int product = 1;

        for (int i = nums.length - 1; i >= 0; i--) {

            result[i] = result[i] * product;

            product *= nums[i];
        }

        System.out.println(Arrays.toString(result));

        return result;
    }


}
