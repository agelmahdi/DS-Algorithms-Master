package com.agelmahdi.arrays.challenges;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class IntersectionOfTwoArrays {

    // Response Time 4ms
    public static int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;

        List<Integer> result = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // Response Time 4ms
    public static int[] intersect2(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i : nums1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else map.put(i, 1);
        }

        for (int i : nums2) {
            if (map.containsKey(i) && map.get(i) > 0) {
                result.add(i);
                map.put(i, map.get(i) - 1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // Response Time 1ms
    public static int[] intersect3(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j])
                j++;
            else if (nums1[i] < nums2[j])
                i++;
            else {
                nums1[k++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOf(nums1, k);

    }

    // the best solution with response time 0ms
    public static int[] intersect4(int[] nums1, int[] nums2) {

        int[] lookup = new int[1001];
        for (int i : nums1) {
            lookup[i]++;
        }
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;
        for (int i : nums2) {
            if (lookup[i] > 0) {
                lookup[i]--;
                res[k++] = i;
            }
        }

        System.out.println(k);

        return Arrays.copyOf(res, k);
    }

}
