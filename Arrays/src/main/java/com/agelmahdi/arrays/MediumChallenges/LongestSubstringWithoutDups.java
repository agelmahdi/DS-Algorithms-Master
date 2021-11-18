package com.agelmahdi.arrays.MediumChallenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class LongestSubstringWithoutDups {

    /*
     * Given a string s, find the length of the longest substring without repeating characters.
     * */

    public static int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) return 0;

        HashMap<Character, Integer> map = new HashMap<>();

        int max = 0;

        for (int i = 0, j = 0; i < s.length(); ++i) {

            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }

            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }

        return max;
    }
}
