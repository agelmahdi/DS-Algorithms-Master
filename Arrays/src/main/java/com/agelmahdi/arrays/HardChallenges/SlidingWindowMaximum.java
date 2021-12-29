package com.agelmahdi.arrays.HardChallenges;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.PriorityQueue;


public class SlidingWindowMaximum {

    /*
     * You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
     * You can only see the k numbers in the window. Each time the sliding window moves right by one position.
     * Return the max sliding window.
     * */

    public static int[] maxSlidingWindow(int[] nums, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int max = Integer.MIN_VALUE;

            if (k <= nums.length)
                for (int j = i; j < k; j++) {
                    max = Math.max(max, nums[j]);
                }
            k++;
            if (max != Integer.MIN_VALUE) {
                list.add(max);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    //Priority Queue solution
    public int[] maxSlidingWindowPQ(int[] nums, int k) {
        // assume nums is not null
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n - k + 1]; // number of windows

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((o1, o2) -> (o2 - o1)); // stores values

        for (int i = 0; i < n; ++i) {
            int start = i - k;
            if (start >= 0) {
                maxPQ.remove(nums[start]); // remove the out-of-bound value
            }
            maxPQ.offer(nums[i]);
            if (maxPQ.size() == k) {
                result[i - k + 1] = maxPQ.peek();
            }
        }
        return result;
    }

    //Deque Solution
    public int[] maxSlidingWindowDQ(int[] nums, int k) {
        // assume nums is not null
        int n = nums.length;
        if (n == 0 || k == 0) {
            return new int[0];
        }
        int[] result = new int[n - k + 1]; // number of windows
        Deque<Integer> win = new ArrayDeque<>(); // stores indices

        for (int i = 0; i < n; ++i) {
            // remove indices that are out of bound
            while (win.size() > 0 && win.peekFirst() <= i - k) {
                win.pollFirst();
            }
            // remove indices whose corresponding values are less than nums[i]
            while (win.size() > 0 && nums[win.peekLast()] < nums[i]) {
                win.pollLast();
            }
            // add nums[i]
            win.offerLast(i);
            // add to result
            if (i >= k - 1) {
                result[i - k + 1] = nums[win.peekFirst()];
            }
        }
        return result;
    }

    public int[] maxSlidingWindowMath(int[] nums, int k) {
        int n = nums.length;
        int[] rslt = new int[n - k + 1];
        int pos = -1;
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = k - 1;
        while (right < n) { // max is in the window
            if (left <= pos) {
                if (nums[right] >= max) {
                    max = nums[right];
                    pos = right;
                }
            } // max is out of the window, but the new one is as large as max
            else if (nums[right] >= max - 1) {
                max = nums[right];
                pos = right;
            } // max is out of the window, but the last one is as large as max
            else if (nums[left] >= max - 1) {
                max = nums[left];
                pos = left;
            } // the worse scene, you have to search for a new max value
            else {
                max = Integer.MIN_VALUE;
                for (int i = left; i <= right; i++) {
                    if (nums[i] >= max) {
                        max = nums[i];
                        pos = i;
                    }
                }
            }
            rslt[left] = max;
            left++;
            right++;
        }
        return rslt;
    }

    public int[] maxSlidingWindowMATH2(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) return new int[0];
        if (k == 1) return nums;

        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = nums[0];
        right[n - 1] = nums[n - 1];

        for (int i = 1; i < n; i++) {
            if (i % k == 0) {
                left[i] = nums[i];
            } else {
                left[i] = Math.max(left[i - 1], nums[i]);
            }

            int j = n - i - 1;
            if ((j + 1) % k == 0) {
                right[j] = nums[j];
            } else {
                right[j] = Math.max(right[j + 1], nums[j]);
            }
        }

        int[] output = new int[n - k + 1];
        for (int i = 0; i < n - k + 1; i++) {
            output[i] = Math.max(left[i + k - 1], right[i]);
        }
        return output;
    }
}
