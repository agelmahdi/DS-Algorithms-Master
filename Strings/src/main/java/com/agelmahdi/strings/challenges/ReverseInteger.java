package com.agelmahdi.strings.challenges;

import java.util.Arrays;

public class ReverseInteger {
    /*
     * Given a signed 32-bit integer x, return x with its digits reversed.
     * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1],then return 0.
     * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
     *
     * */

    // Time Complexity: O(log(x))
    // Space Complexity: O(1)
    public static int reverse(int x) {

        /* using Pop and Push Digits

         * pop operation:
         * pop = x % 10;
         * x /= 10;

         * push operation:
         * rev = rev * 10 + pop;
         */

        int rev = 0;

        while (x != 0) {

            // pop operation
            int pop = x % 10;
            x /= 10;

            // Avoid Overflow
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;

            // Push operation
            rev = rev * 10 + pop;
        }

        return rev;

    }

    public static int reverse2(int x) {

        long res = 0;

        while (x != 0) {
            res *= 10;
            res += x % 10;
            x /= 10;
        }
        return (int) res == res ? (int) res : 0;
    }
}
