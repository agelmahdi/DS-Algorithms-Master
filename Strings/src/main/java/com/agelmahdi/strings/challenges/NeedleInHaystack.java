package com.agelmahdi.strings.challenges;

import java.util.Arrays;
import java.util.HashMap;

public class NeedleInHaystack {
    /*
     * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     * Clarification:
     * What should we return when needle is an empty string? This is a great question to ask during an interview.
     * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
     * */

    public static int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        }

        if (needle.length() > haystack.length() || !haystack.contains(needle)) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {

            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }

        }

        return -1;
    }
}
