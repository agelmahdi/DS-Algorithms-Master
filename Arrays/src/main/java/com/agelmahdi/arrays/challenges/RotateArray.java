package com.agelmahdi.arrays.challenges;

import java.util.Arrays;

class RotateArray {

    // Time Exceeded
    public static void rotate(int[] nums, int k) {
        while (k > 0) {
            int temp = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
            k--;

            System.out.println(Arrays.toString(nums));
        }
    }

    // Time Exceeded
    public static void rotateViaReverse(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int lastPos = nums.length - 1;
            for (int j = 0; j < lastPos; j++) {
                int temp = nums[j];
                nums[j] = nums[lastPos];
                nums[lastPos] = temp;
            }
            System.out.println(Arrays.toString(nums));
        }

    }
    // Time Efficient
    public void rotateRight(int[] nums, int k) {
        int n = nums.length;
        if (k > n) {
            k = k % n;
        }
        reverseNums(nums, 0, n - k - 1);
        reverseNums(nums, n - k, n - 1);
        reverseNums(nums, 0, n - 1);
    }

    public void reverseNums(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
