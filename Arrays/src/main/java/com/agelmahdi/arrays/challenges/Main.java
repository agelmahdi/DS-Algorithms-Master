package com.agelmahdi.arrays.challenges;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int []nums = {1,3,1,-1,3};
        System.out.println(SingleNumber.singleNumber(nums));

        int []arr1 = {4,9,5};
        int []arr2 = {9,4,9,8,4};

//        System.out.println(Arrays.toString(IntersectionOfTwoArrays.intersect(arr1,arr2)));
//        System.out.println(Arrays.toString(IntersectionOfTwoArrays.intersect2(arr1,arr2)));
//        System.out.println(Arrays.toString(IntersectionOfTwoArrays.intersect3(arr1,arr2)));
        System.out.println(Arrays.toString(IntersectionOfTwoArrays.intersect4(arr1,arr2)));
    }
}
