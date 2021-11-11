package com.agelmahdi.strings.challenges;

public class StringtoInteger {

    /*
     *  Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
     * The algorithm for myAtoi(string s) is as follow
     *
     * 1. Read in and ignore any leading whitespace.
     *
     * 2. Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either.
     *    This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
     *
     * 3. Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
     *
     * 4. Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0.
     *    Change the sign as necessary (from step 2).
     *
     * 5. If the integer is out of the 32-bit signed integer range [-231, 231 - 1],
     *    then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231,
     *    and integers greater than 231 - 1 should be clamped to 231 - 1.
     *
     * 6. Return the integer as the final result.
     *
     *   Note:
     *    - Only the space character ' ' is considered a whitespace character.
     *    - Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
     * */

    public static int myAtoi(String s) {

        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        int sign = 1, result = 0;

        int index = 0;

        if (s.charAt(index) == '+') {
            sign = 1;
            index++;
        } else if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        }

        for (int i = index; i < s.length(); i++) {

            char c = s.charAt(i);

            int digit = c - '0';

            if (digit < 0 || digit > 9) break;

            if (Integer.MAX_VALUE / 10 < result || Integer.MAX_VALUE / 10 == result
                    && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = 10 * result + digit;

        }

        return result * sign;
    }
}
