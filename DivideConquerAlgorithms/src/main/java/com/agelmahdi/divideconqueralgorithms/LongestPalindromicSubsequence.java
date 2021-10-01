package com.agelmahdi.divideconqueralgorithms;

class LongestPalindromicSubsequence {
    /*
    * 1. S is a given string.
    * 2. Find the longest palindromic subsequence.
    * 3. Subsequence: a sequence that can be driven from another algorithm by deleting some elements without changing the order of them.
    * 4. Palindrome is a string that reads the same backward as well as forward.
    * */

    private int longestPalindromicSubsequence(String str, int start, int end){
        if (start > end){
            return 0;
        }

        int both = 0;
        if (str.charAt(start) == str.charAt(end)){
            both = 2 + longestPalindromicSubsequence(str, start + 1, end - 1);
        }
        int subForward = longestPalindromicSubsequence(str, start + 1, end);
        int subBackward = longestPalindromicSubsequence(str, start , end - 1);

        return Math.max(both,Math.max(subForward,subBackward));
    }

    public int findLPSQ(String str){
        return longestPalindromicSubsequence(str,0,str.length() - 1);
    }
}
