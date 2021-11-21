package com.agelmahdi.arrays.MediumChallenges;

class IncreasingTripletSubsequence {
    /*
    * Given an integer array nums,
    * return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k].
    * If no such indices exists, return false.
    * */

    public static boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= small) { small = n; }
            else if (n <= big) { big = n; }
            else return true;
        }
        return false;
    }

}
