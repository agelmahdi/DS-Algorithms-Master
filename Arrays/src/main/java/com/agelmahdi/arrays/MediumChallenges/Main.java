package com.agelmahdi.arrays.MediumChallenges;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int []nums = {-1,0,1,2,-1,-4};
        int []nums2 = {-1,0,1,0};
        int []nums3 = {-2,0,1,1,2};
        int []nums4 = {3,0,-2,-1,1,2};
      //  ThreeSum.threeSum(nums);

        int [][]matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int [][]matrix2 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int [][]matrix3 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
       // SetMatrixZeroes.setZeroes(matrix);

        String []strs = {"eat","tea","tan","ate","nat","bat"};
        String []strs2 = {"a"};
        String []strs3 = {""};

       // System.out.println(Arrays.toString(new List[]{GroupAnagrams.groupAnagrams(strs3)}));

      //  GroupAnagrams.groupAnagrams(strs);

        System.out.println(LongestSubstringWithoutDups.lengthOfLongestSubstring( "abcabcbb"));
        System.out.println(LongestSubstringWithoutDups.lengthOfLongestSubstring( "bbbbb"));
        System.out.println(LongestSubstringWithoutDups.lengthOfLongestSubstring( "pwwkew"));
        System.out.println(LongestSubstringWithoutDups.lengthOfLongestSubstring( " "));
        System.out.println(LongestSubstringWithoutDups.lengthOfLongestSubstring( "au"));
        System.out.println(LongestSubstringWithoutDups.lengthOfLongestSubstring( "abcb"));
        System.out.println(LongestSubstringWithoutDups.lengthOfLongestSubstring( "dvdf")); // 3
    }
}
