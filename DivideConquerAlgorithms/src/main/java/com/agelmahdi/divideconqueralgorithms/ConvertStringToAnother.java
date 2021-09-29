package com.agelmahdi.divideconqueralgorithms;

class ConvertStringToAnother {
    /*
    *  1. Given s1 and s2 which are strings.
    *  2. Convert s2 to s1 using delete, insert and replace.
    *  3. Find the minimum count of edit operations
    *
    *  e.g. s1 = table, s2 = tbres
    *  - Output = 3
    *  - Explanation:
    *   1. insert a to second position.
    *   2. replace r with l.
    *   3. and delete s.
    * */

    private int findMin(String str1, String str2, int index1, int index2) {
        if (index1 == str1.length()){
            return str2.length() - index2;
        }
        if (index2 == str2.length()){
            return str1.length() - index1;
        }
        if (str1.charAt(index1) == str2.charAt(index2)){
            return findMin( str1,  str2,  index1+1,  index2+1);
        }

        int delete = 1 + findMin(str1,  str2,index1+1, index2);
        int insert = 1 + findMin(str1,  str2,index1, index2+1);
        int replace = 1 + findMin(str1,  str2,index1+1, index2+1);
        return Math.min(delete,Math.min(insert,replace));
    }

    public int findMinOperations(String str1, String str2){
        return findMin(str1,str2,0,0);
    }
}
