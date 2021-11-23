package com.agelmahdi.arrays.HardChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FourSum {

    /*
     *  Given four integer arrays nums1, nums2, nums3, and nums4 all of length n,
     *  return the number of tuples (i, j, k, l) such that:
     *    - 0 <= i, j, k, l < n
     *    -  nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
     * */

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        int sum=0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        Arrays.sort(nums4);

        HashMap<Integer,Integer>map=new HashMap<>();

        for (int i : nums3) {
            for (int j : nums4) {
                int s = i + j;
                map.compute(s, (k, v)-> v==null? 1 : v+1);
            }
        }

        for (int k : nums1) {
            for (int i : nums2) {
                int m = -(k + i);
                sum += map.getOrDefault(m, 0);

            }
        }

      //  System.out.println(sum);
        return sum;
    }
}
