package com.agelmahdi.strings.challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidAnagram {
    /*
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
     * */
    public static boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> countS = new HashMap<Character, Integer>();
        HashMap<Character, Integer> countT = new HashMap<Character, Integer>();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            countS.put(c, countS.getOrDefault(c, 0) + 1);
        }


        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }


        HashMap<Character, Integer> result = new HashMap<Character, Integer>();
        result.putAll(countS);
        result.putAll(countT);

        for (Map.Entry<Character, Integer> entry1 : result.entrySet()) {

            char key = entry1.getKey();
            int value1 = countS.getOrDefault(key, 0);
            int value2 = countT.getOrDefault(key, 0);

            if (countT.containsKey(key) && countS.containsKey(key) && value1 == value2 ){
                continue;
            }

             return false;

        }


        return true;
    }
}
