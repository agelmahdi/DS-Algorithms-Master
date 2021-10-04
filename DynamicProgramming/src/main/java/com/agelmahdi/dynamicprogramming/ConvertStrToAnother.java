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
        if (str1.charAt(index1) == str2.charAt(index2)) { // perform replace
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

}
