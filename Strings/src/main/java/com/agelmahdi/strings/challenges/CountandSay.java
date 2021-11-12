package com.agelmahdi.strings.challenges;

public class CountandSay {

    /*
     * The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
     *
     *   countAndSay(1) = "1"
     *    countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
     *    To determine how you "say" a digit string, split it into the minimal number of groups so that each group is a contiguous section all of the same character. Then for each group, say the number of characters, then say the character. To convert the saying into a digit string, replace the counts with a number and concatenate every saying.
     *
     *   For example, the saying and conversion for digit string "3322251" : 2 of 3, 3 of 2, 1 of 5, and 1 of 1 result = "23"
     *   Given a positive integer n, return the nth term of the count-and-say sequence.
     * */

    public static String countAndSay(int n) {

        if (n == 1) return "1";

        String prev = countAndSay(n - 1);

        StringBuilder result = new StringBuilder();

        int count = 0;

        char num = '.';

        for (char c : prev.toCharArray()) {
            if (num == '.') {
                num = c;
                count++;
            } else {
                if (c == num) {
                    count++;
                } else {
                    result.append(count);
                    result.append(num);
                    num = c;
                    count = 1;
                }
            }
        }

        result.append(count);
        result.append(num);

        return result.toString();

    }

}
