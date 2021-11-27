package com.agelmahdi.arrays.HardChallenges;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {
    /*
    * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
    * There is only one repeated number in nums, return this repeated number.
    * You must solve the problem without modifying the array nums and uses only constant extra space.
    * */

    // Time Efficient
    public static int findDuplicate(int[] nums) {

        boolean []visited = new boolean[nums.length];

        int i=0;

        while(!visited[nums[i]]){
            visited[nums[i]] = true;
            i++;
        }

        return nums[i];
    }

    public static int findDuplicate2(int[] nums) {
        // using two pointer approach
        int s = nums[0];
        int f = nums[nums[0]];

        while(f != s) {
            s = nums[s]; // moving one step
            f = nums[nums[f]]; // moving two steps
        }

        // re-initialise f
        f = 0;

        while(f != s) {
            // move both s and p one step
            s = nums[s];
            f = nums[f];
        }

        return s;
    }


    // Space efficient
    public static int findDuplicate3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            if (set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;
    }

}
