package com.agelmahdi.dynamicprogramming.MediumChallenge;

import java.util.HashMap;

public class JumpGame {

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 1, 4};
        int[] nums1 = {3, 2, 1, 0, 4};
        int[] nums2 = {3, 3, 6, 1, 2, 10, 50, 100};
        int[] nums3 = {2, 0};
        int[] nums4 = {0};
        int[] nums5 = {1, 2, 3};
        int[] nums6 = {2, 5, 0, 0};
        System.out.println(canJump(nums6));
    }

    public static boolean canJump(int[] nums) {


        int lastIndex = nums.length;

        int currentIndex = 0;

        for (int i = 0; i < lastIndex; i++) {
            int stepToJum = nums[i] + i;
            if (currentIndex < i)
                return false;

            if (stepToJum > currentIndex)
                currentIndex = stepToJum;

        }

        return true;
    }
}
