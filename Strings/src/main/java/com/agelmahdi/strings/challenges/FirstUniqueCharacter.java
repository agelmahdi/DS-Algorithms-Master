package com.agelmahdi.strings.challenges;

import java.util.HashMap;

public class FirstUniqueCharacter {
    /*
     * Given a string s, find the first non-repeating character in it and return its index.
     *  If it does not exist, return -1.
     */

    // response time 19ms
    public static int firstUniqChar(String s) {

        HashMap<Character, Boolean> map = new HashMap<>();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], true);
            } else {
                map.put(chars[i], false);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i])) {
                return i;
            }
        }

        return -1;
    }

    // response time 1ms
    public int firstUniqChar2(String s) {

        int answer = Integer.MAX_VALUE;

        for (char c = 'a'; c <= 'z'; c++) {

            // checks that char whether in the string
            int i = s.indexOf(c);

            if (i != -1 && i == s.lastIndexOf(c)) {
                answer = Math.min(answer, i);
            }
        }

        // if true return -1
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
}
