package com.agelmahdi.divideconqueralgorithms;

class LongestCommonSubsequence {
    /*
     *  1. S1 and S2 are given strings
     *  2. find the length of longest subsequence which is common to both strings
     *  3. Subsequence: a sequence that can be driven from another algorithm by deleting some elements without changing the order of them
     * */

    private int findMaxLCSQ(String str1, String str2, int index1, int index2) {
        if (index1 == str1.length()) {
            return 0;
        }
        if (index2 == str2.length()) {
            return 0;
        }
        if (str1.charAt(index1) == str2.charAt(index2)) {
            return 1 + findMaxLCSQ(str1, str2, index1 + 1, index2 + 1);
        }

        int sub1 = findMaxLCSQ(str1, str2, index1, index2 + 1);
        int sub2 = findMaxLCSQ(str1, str2, index1 + 1, index2);

        return Math.max(sub1, sub2);
    }

    public int findMaxLCSQ(String str1, String str2) {
        return findMaxLCSQ(str1, str2, 0, 0);
    }

}
