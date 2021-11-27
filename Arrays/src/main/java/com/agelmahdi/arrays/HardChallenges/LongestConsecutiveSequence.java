package com.agelmahdi.arrays.HardChallenges;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.PriorityQueue;

public class LongestConsecutiveSequence {
    /*
    *  Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
    * You must write an algorithm that runs in O(n) time.
    * */

    public static int longestConsecutive(int[] nums) {

        if (nums.length <= 0) {
            return 0;
        } else if (nums.length >= ((int) Math.pow(10, 5))) {
            return (int) Math.pow(10, 5);
        }

        int longestStreak = 1;
        int currentStreak = 1;
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1 && (nums[i] < (int) Math.pow(10, 9) || nums[i] > (int) Math.pow(-10, 15))) {
                    currentStreak++;
                } else {
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }

            }
        }
        longestStreak = Math.max(longestStreak, currentStreak);

        return longestStreak;
    }

    public static int longestConsecutive2(int[] nums) {
        int length = nums.length;
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        Arrays.sort(nums);

        int max = Integer.MIN_VALUE;
        int count = 1;

        for (int i = 0; i < length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                max = Math.max(max, count);
                continue;
            }
            if (nums[i + 1] - nums[i] != 1) {
                max = Math.max(max, count);
                count = 1;
                continue;
            }
            count++;
            max = Math.max(max, count);
        }


        System.out.println(max);
        System.out.println(Arrays.toString(nums));
        return max;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
