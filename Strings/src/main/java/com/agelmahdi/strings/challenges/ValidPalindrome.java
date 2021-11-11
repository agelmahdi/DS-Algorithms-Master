package com.agelmahdi.strings.challenges;

import java.util.Locale;

public class ValidPalindrome {

    /*
    * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
    * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    * Given a string s, return true if it is a palindrome, or false otherwise.
    * */


    public static boolean isPalindrome(String s) {

        // remove all non-alphanumeric characters

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i =0; i < s.length() / 2; i++){

            int lastIndex = s.length() - i - 1;

            if (s.charAt(i) == s.charAt(lastIndex)){
                continue;
            }

            return false;
        }

        return true;
    }


}
