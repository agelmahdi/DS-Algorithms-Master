package com.agelmahdi.arrays.MediumChallenges;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromicSubstring {

    // Expand Around Center
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static String longestPalindrome2(String s) {

        if (s.length() == 0) return "";

        HashMap<Integer, String> map = new HashMap<>();

        int max = Integer.MIN_VALUE;

        int j = 0;

        String str = "";

        String sub = "";

        for (int i = 0; i < s.length(); i++) {


            if (str.contains(String.valueOf(s.charAt(i)))) {

                if (s.charAt(i) == s.charAt(j)){
                    j = str.indexOf(s.charAt(i)) ;
                }
                else {
                    j = str.lastIndexOf(s.charAt(i)) ;

                }

            }

            sub = s.substring(j, i + 1);

            if (isPalindrome(sub)){
                map.put(sub.length(), sub);
            }
            str += String.valueOf(s.charAt(i));


        }

        for (Map.Entry<Integer, String> entry: map.entrySet()){
            max = Math.max(max, entry.getKey());
        }


      // System.out.println(Arrays.toString(map.entrySet().toArray()));
        return map.get(max);
    }

    public static boolean isPalindrome(String s) {

        for (int i = 0; i < s.length() / 2; i++) {

            int lastIndex = s.length() - i - 1;

            if (s.charAt(i) == s.charAt(lastIndex)) {
                continue;
            }

            return false;
        }
       //  System.out.println("Plindrom: "+ s);

        return true;
    }
}
