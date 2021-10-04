package com.agelmahdi.dynamicprogramming;

import java.util.HashMap;

class ConvertStrToAnother {

    private int convertStrMemo(String str1, String str2, int index1, int index2, HashMap<Integer, Integer> memo) {
        if (str1.length() == index1) { // perform delete
            return str2.length() - index2;
        }
        if (str2.length() == index2) { // perform insert
            return str1.length() - index1;
        }
        if (str1.charAt(index1) == str2.charAt(index2)) {
            return convertStrMemo(str1, str2, index1 + 1, index2 + 1, memo);
        }

        int key = str1.charAt(index1) + str2.charAt(index2);

        if (!memo.containsKey(key)) {
            int deleteOp = 1 + convertStrMemo(str1, str2, index1 + 1, index2, memo);
            int insertOp = 1 + convertStrMemo(str1, str2, index1, index2 + 1, memo);
            int replaceOp = 1 + convertStrMemo(str1, str2, index1 + 1, index2 + 1, memo);
            int min = Math.min(deleteOp, Math.min(insertOp, replaceOp));

            memo.put(key, min);
        }
        return memo.get(key);

    }

    public int findMinOperationsMemo(String str1, String str2) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        return convertStrMemo(str1, str2, 0, 0, memo);
    }

    public int convertStrTabular(String str1, String str2) {

        int[][] tabular = new int[str1.length() + 1][str2.length() + 1];

        // initialize by the maximum edits possible
        for (int i = 0; i <= str1.length(); i++)
            tabular[i][0] = i;

        for (int j = 0; j <= str2.length(); j++)
            tabular[0][j] = j;

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                // if the characters are same
                // no changes required
                if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    tabular[i][j] = tabular[i - 1][j - 1];
                else {
                    // minimum of three operations possible
                    int deleteOp = 1 + tabular[i - 1][j];
                    int insertOp = 1 + tabular[i][j - 1];
                    int replaceOp = 1 + tabular[i - 1][j - 1];
                    tabular[i][j] = Math.min(deleteOp, Math.min(insertOp, replaceOp));
                }
            }
        }

        return tabular[str1.length()][str2.length()];

    }


}
