package com.agelmahdi.arrays.HardChallenges;

class ContainerWithMostWater {

    /*
     *  Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
     *  n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines,
     *  which, together with the x-axis forms a container, such that the container contains the most water.
     *
     * Notice that you may not slant the container.
     * */

    public static int maxArea(int[] height) {

        int l = 0, r = height.length - 1;

        int val, max = Integer.MIN_VALUE;

        while (l < r) {
            val = Math.min(height[l], height[r]) * (r - l);
            if (val > max) {
                max = val;
            }
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        System.out.println(max);

        return max;
    }

    public static int maxArea2(int[] height) {

        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {

            for (int j = height.length - 1; j >= i; j--) {

                int min = Math.min(height[i], height[j]);

                int area = min * (j - i);

                maxArea = Math.max(maxArea, area);
            }

        }

        System.out.println(maxArea);
        return maxArea;
    }
}
