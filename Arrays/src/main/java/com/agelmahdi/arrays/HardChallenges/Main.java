package com.agelmahdi.arrays.HardChallenges;

public class Main {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4};
//        int[] nums2 = {-1, 1, 0, -3, 3};
//        int[] nums3 = {-1, 4, 0, -3, 0, 10};
//        int[] nums4 = {0, 0};
//        int[] nums5 = {1, 0};
//        int[] nums6 = {0, 4, 0};
//        ProductofArrayExceptSelf.productExceptSelf(nums);
//        ProductofArrayExceptSelf.productExceptSelf(nums2);
//        ProductofArrayExceptSelf.productExceptSelf(nums3);
//        ProductofArrayExceptSelf.productExceptSelf(nums4);
//        ProductofArrayExceptSelf.productExceptSelf(nums5);
//        ProductofArrayExceptSelf.productExceptSelf(nums6);


        int [][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int [][]matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int [][]matrix3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int [][]matrix4 = {{2},{3}};
        int [][]matrix6 = {{1},{2},{3},{4},{5},{6},{7},{8},{9},{10}};
        int [][]matrix5 = {{2,3},{4,5},{6,7}};
        int [][]matrix7 = {{6,9,7}};
       // SpiralMatrix.spiralOrder(matrix7);

        int []nums1 = {1}, nums2 = {-1}, nums3 = {0}, nums4 = {1};
       // FourSum.fourSumCount(nums1,nums2,nums3,nums4);

        int []height = {1,8,6,2,5,4,8,3,7};
        int []height2 = {1,1};
        int []height3 = {4,3,2,1,4};
        int []height4 = {1,2,1};
        int []height5= {2,3,10,5,7,8,9}; // 36
        int []height6= {2,3,4,5,18,17,6}; // 17
        int []height7= {1,1000,1000,6,2,5,4,8,3,7}; // 1000
        ContainerWithMostWater.maxArea(height);
        ContainerWithMostWater.maxArea(height2);
        ContainerWithMostWater.maxArea(height3);
        ContainerWithMostWater.maxArea(height4);
        ContainerWithMostWater.maxArea(height5);
        ContainerWithMostWater.maxArea(height6);
        ContainerWithMostWater.maxArea(height7);
    }
}
