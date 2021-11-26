package com.agelmahdi.arrays.HardChallenges;

import java.util.Arrays;
import java.util.Base64;

public class FirstMissingPositive {

    /*
     * Given an unsorted integer array nums, return the smallest missing positive integer.
     * You must implement an algorithm that runs in O(n) time and uses constant extra space.
     * */

    public static int firstMissingPositive(int[] nums) {

        int length = nums.length;

        int min = 1;

        int i = 0;

        while (i < length) {
            if (nums[i] <= 0 || nums[i] > length || nums[nums[i] - 1] == nums[i]) {
                i++;
            } else {
                swap(nums, nums[i] - 1, i);
            }
        }

        for (int num : nums) {
            if (num != min) break;
            min++;
        }

        return min;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int firstMissingPositive2(int[] nums) {

        int min = 1;

        int e = 256;

        int[] temp = new int[e];

        for (int num : nums) {
            if (num > 0) {
                temp[convertByte(num)] = num;
            }
        }

        for (int i = 1; i < temp.length; i++) {
            if (min != temp[i]) {
                break;
            }
            min++;
        }

        System.out.println(min);

        return min;
    }

    private static int convertByte(int max) {
        byte b = (byte) max;

        return b & 0xFF;
    }


}
