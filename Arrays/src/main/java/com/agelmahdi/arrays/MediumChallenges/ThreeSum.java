package com.agelmahdi.arrays.MediumChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

    /*
     * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
     * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
     *
     * Notice that the solution set must not contain duplicate triplets.
     */

    public static List<List<Integer>> threeSum(int[] nums) {

        if (nums.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));

        Set<List<Integer>> lists = new HashSet<>();

        for (int i = 0; i < nums.length ; i++) {

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {

                int value = nums[i] + nums[j] + nums[k];

                if (value == 0) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    lists.add(list);
                    j++;
                    k--;
                } else if (value < 0) {
                    j++;
                }
                else {
                    k--;
                }

            }

        }

        System.out.println(Arrays.toString(new Set[]{lists}));

        return new ArrayList<>(lists);
    }
}
