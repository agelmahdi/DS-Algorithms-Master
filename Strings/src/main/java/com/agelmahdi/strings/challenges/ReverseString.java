package com.agelmahdi.strings.challenges;

import java.util.Arrays;

public class ReverseString {
    /* Write a function that reverses a string. The input string is given as an array of characters s.
    * Constraints:
    *
    * 1 <= s.length <= 105
    * s[i] is a printable ascii character.
    *
    * Follow up: Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
    */

    public static void reverse(char[] s) {

        for (int i = 0 ; i < s.length / 2 ; i++){

            int last = s.length - i - 1;

            char temp = s[i];

            s[i] = s[last];

            s[last] = temp;

        }

        System.out.println(Arrays.toString(s));
    }
}
