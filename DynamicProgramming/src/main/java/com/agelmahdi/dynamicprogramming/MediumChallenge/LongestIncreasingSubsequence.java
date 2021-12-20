package com.agelmahdi.dynamicprogramming.MediumChallenge;

import java.util.Arrays;

class LongestIncreasingSubsequence {

    /*
    * Given an integer array nums, return the length of the longest strictly increasing subsequence.
    * A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements.
    * For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
    * */

    public static void main(String[] args) {
        int []nums = {10,9,2,5,3,7,101,18};
        lengthOfLIS(nums);
    }
    public static int lengthOfLIS(int[] nums) {
        int[] tabular = new int[nums.length];
        int len = 0;

        for(int x : nums) {
            int i = Arrays.binarySearch(tabular, 0, len, x);
            if(i < 0) i = -(i + 1);
            tabular[i] = x;
            if(i == len) len++;
        }

        return len;
    }
}
