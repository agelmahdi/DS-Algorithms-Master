package com.agelmahdi.arrays.challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    /*
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * */

    // response time = 0 ms
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if ((nums[j-i] + nums[j]) == target) {
                    return new int[]{j-i, j};
                }
            }
        }

        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }

    public static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }


}
