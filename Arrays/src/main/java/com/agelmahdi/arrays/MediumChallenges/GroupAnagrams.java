package com.agelmahdi.arrays.MediumChallenges;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

class GroupAnagrams {
    /*
     * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     * */

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            String str = sortString(s);

            if (!map.containsKey(str)) {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(str, list);
            } else {
                map.get(str).add(s);
            }
        }

        return new ArrayList<>(map.values());
    }

    private static String sortString(String inputString) {

        char[] tempArray = inputString.toCharArray();

        Arrays.sort(tempArray);

        return new String(tempArray);
    }
}
