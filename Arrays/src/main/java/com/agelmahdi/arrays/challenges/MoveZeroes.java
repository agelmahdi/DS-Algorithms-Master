package com.agelmahdi.arrays.challenges;

import java.util.Arrays;

class MoveZeroes {
    /* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * Note that you must do this in-place without making a copy of the array.
     */

    // response time = 2 ms
    public static void moveZeroes(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != 0) {
                i++;
            }
            if (nums[j] != 0) {
                swap(nums, i, j);
            }
        }

        System.out.println(Arrays.toString(nums));

    }

    // response time = 0ms
    public void moveZeroes2(int[] nums) {
        int s = 0, f = 0;
        while (f < nums.length) {
            if (nums[f] == 0) {
                f++;
                continue;
            }
            swap(nums, s, f);
            s++;
            f++;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
