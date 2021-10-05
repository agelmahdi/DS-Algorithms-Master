package com.agelmahdi.dynamicprogramming;

import java.util.Arrays;
import java.util.HashMap;

class LongestCommonSubsequence {
    /*
     *  1. S1 and S2 are given strings
     *  2. find the length of longest subsequence which is common to both strings
     *  3. Subsequence: a sequence that can be driven from another algorithm by deleting some elements without changing the order of them
     * */

    private String str1;
    private String str2;
    private int[][] tabularDP;

    private int lCSRecursion(String str1, String str2, int index1, int index2) {
        if (str1.length() == index1 || str2.length() == index2) {
            return 0;
        }

        if (str1.charAt(index1) == str2.charAt(index2)) {
            return 1 + lCSRecursion(str1, str2, index1 + 1, index2 + 1);
        }

        int sub1 = lCSRecursion(str1, str2, index1 + 1, index2);
        int sub2 = lCSRecursion(str1, str2, index1, index2 + 1);

        return Math.max(sub1, sub2);
    }

    public int lcsRecursion(String str1, String str2) {
        return lCSRecursion(str1, str2, 0, 0);
    }

    private int lcsMemo(String str1, String str2, int index1, int index2, HashMap<Integer, Integer> memo) {
        if (str1.length() == index1 || str2.length() == index2) {
            return 0;
        }

        if (str1.charAt(index1) == str2.charAt(index2)) {
            return 1 + lcsMemo(str1, str2, index1 + 1, index2 + 1, memo);
        }

        int key = str1.charAt(index1) + str2.charAt(index2);

        if (!memo.containsKey(key)) {
            int sub1 = lcsMemo(str1, str2, index1 + 1, index2, memo);
            int sub2 = lcsMemo(str1, str2, index1, index2 + 1, memo);
            memo.put(key, Math.max(sub1, sub2));
        }

        return memo.get(key);
    }

    public int lcsMemo(String str1, String str2) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        return lcsMemo(str1, str2, 0, 0, memo);
    }

    public int lcsTabular(String str1, String str2) {
        int[][] tabular = new int[str1.length() + 1][str2.length() + 1];

        this.str1 = str1;
        this.str2 = str2;

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    tabular[i][j] = 1 + tabular[i - 1][j - 1];
                } else {
                    int sub1 = tabular[i][j - 1];
                    int sub2 = tabular[i - 1][j];
                    tabular[i][j] = Math.max(sub1, sub2);
                }
            }
        }

        tabularDP = tabular;
        return tabular[str1.length()][str2.length()];

    }

    public void printLCS() {

        int i = str1.length();
        int j = str2.length();
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                System.out.print(str1.charAt(i - 1) + " ");
                i--;
                j--;
            } else if (tabularDP[i - 1][j] > tabularDP[i][j - 1])
                i--;
            else
                j--;
        }
    }
}
