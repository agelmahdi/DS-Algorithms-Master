package com.agelmahdi.arrays.HardChallenges;

import java.util.HashMap;
import java.util.Stack;

public class BasicCalculatorII {

   /* Given a string s which represents an expression, evaluate this expression and return its value.
    * The integer division should truncate toward zero.
    * You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].
    *
    * Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
    */


    public static int calculate(String s) {

        int length = s.length();

        if (length == 0) return 0;

        int res = 0;

        int lastSum = 0;

        int num = 0;

        char lastSign = '+';

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (Character.isDigit(c)) num = num * 10 + c - '0';

            if (i == length - 1 || !Character.isDigit(c) && c != ' ') {

                switch (lastSign) {
                    case '+':
                        res += lastSum;
                        lastSum = num;
                        break;
                    case '-':
                        res += lastSum;
                        lastSum = -num;
                        break;
                    case '*':
                        lastSum *= num;
                        break;
                    case '/':
                        lastSum /= num;
                        break;
                }
                lastSign = c;
                num = 0;
            }
        }
        res += lastSum;

        return res;
    }

    public static int calculate2(String s) {

        int length = s.length();

        if (length == 0) return 0;

        int res = 0;

        int num = 0;

        char lastSign = '+';

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) num = num * 10 + c - '0';

            if (i == length - 1 || !Character.isDigit(c) && c != ' ') {
                if (lastSign == '-') {
                    stack.push(-num);
                }
                if (lastSign == '+') {
                    stack.push(num);
                }
                if (lastSign == '*') {
                    stack.push(stack.pop() * num);
                }
                if (lastSign == '/') {
                    stack.push(stack.pop() / num);
                }
                lastSign = c;
                num = 0;
            }
        }

        for (int i : stack) {
            res += i;
        }
        return res;
    }
}
