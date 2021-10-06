package com.agelmahdi.dynamicprogramming;

import com.sun.org.apache.xerces.internal.impl.dv.XSSimpleType;

import java.util.Arrays;
import java.util.HashMap;

import static java.lang.Math.max;

class LongestPalindromicSubsequence {
    /*
     * 1. S is a given string.
     * 2. Find the longest palindromic subsequence.
     * 3. Subsequence: a sequence that can be driven from another algorithm by deleting some elements without changing the order of them.
     * 4. Palindrome is a string that reads the same backward as well as forward.
     * */

    private int lpsqRecursion(String str, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return 0;
        }
        if (startIndex == endIndex) {
            return 1;
        }

        int count1 = 0;
        if (str.charAt(startIndex) == str.charAt(endIndex)) {
            count1 = 2 + lpsqRecursion(str, startIndex + 1, endIndex - 1);
        }
        int count2 = lpsqRecursion(str, startIndex + 1, endIndex);
        int count3 = lpsqRecursion(str, startIndex, endIndex - 1);

        return Math.max(count1, Math.max(count2, count3));

    }

    public int findLPSQRecursion(String str) {
        return lpsqRecursion(str, 0, str.length() - 1);
    }

    private int lpsqMemo(String str, int startIndex, int endIndex, int[][] memo) {
        if (startIndex > endIndex) {
            return 0;
        }
        if (startIndex == endIndex) {
            return 1;
        }

        if (memo[startIndex][endIndex] == 0) {
            int count1 = 0;
            if (str.charAt(startIndex) == str.charAt(endIndex)) {
                count1 = 2 + lpsqMemo(str, startIndex + 1, endIndex - 1, memo);
            }
            int count2 = lpsqMemo(str, startIndex + 1, endIndex, memo);
            int count3 = lpsqMemo(str, startIndex, endIndex - 1, memo);

            memo[startIndex][endIndex] = Math.max(count1, Math.max(count2, count3));
        }

        return memo[startIndex][endIndex];

    }

    public int findLPSQMemo(String str) {
        int[][] memo = new int[str.length()][str.length()];
        return lpsqMemo(str, 0, str.length() - 1, memo);
    }

}
