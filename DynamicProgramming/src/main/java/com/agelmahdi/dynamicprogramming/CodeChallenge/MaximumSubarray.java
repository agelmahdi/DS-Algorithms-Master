package com.agelmahdi.dynamicprogramming.CodeChallenge;

import java.util.Arrays;

class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {5,4,-1,7,8};
        maxSubArray(nums2);
    }

    public static int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;

        int maxSubArray= 0;

        for (int num : nums) {
            maxSubArray += num;

            if (num > maxSubArray) {
                maxSubArray = num;
            }

            max = Math.max(max, maxSubArray);

        }

        System.out.println(max);

        return max;
    }
}
