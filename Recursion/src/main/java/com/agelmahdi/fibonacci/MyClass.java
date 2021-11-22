package com.agelmahdi.fibonacci;

import java.util.Arrays;

import static sun.swing.MenuItemLayoutHelper.max;

public class MyClass {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();

        // 1.Fibonacci
        //  System.out.println(myClass.fibonacci(8));

        // 2.Sum of Digits
        //  System.out.println(myClass.sumOfDigit(1154));

        // 3.Power of number
        // System.out.println(myClass.powerOfNumber(2, 1));

        // 4.Greatest common divisor
        //System.out.println(myClass.GCD(8, 4));

        // 5.Decimal to binary
        // System.out.println(myClass.decimalToBinary(10));

        //6.product of array
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(myClass.prodOfArray(nums)));

        // 7. RECURSIVE RANGE
        //System.out.println(myClass.recursiveRange(4));
//        int []nums = {1,2,3,4};
//         //8.Find max number
//        System.out.println(myClass.findMaxNumber(nums,nums.length));
    }

    /*Sequence of numbers in which each number is the sum of the two preceding once and the sequence starts from 0,1
     * 0,1,1,2,3,5,8,13 .......
     */

    private int fibonacci(int n) {


        // unintentional case - the constraint ?? maybe -1, -2 ......
        if (n < 0) {
            return -1;
        }

        // Base case - The Stopping Criteria ?? n = 0 || 1

        if (n == 0 || n == 1) {
            return n;
        }

        // Recursive case - the Flow
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //How to find the sum of digits of a positive integer number using recursion

    /*
     * 1. Recursive case - the flow
     *
     * //Explanation
     * num(10) -> 10/10 = 1 and reminder = 0
     * num(54) -> 54/10 = 5 and reminder = 4
     * num(66) -> 66/10 = 6 and reminder = 6
     * num(112) -> 112/10 = 11 and reminder = 2
     *
     * // Equation
     * f(n) = n%10 + f(n/10)
     *
     * */

    private int sumOfDigit(int n) {

        // The Base case - Stopping criteria ?? f(0) = 0%10 + f(0/10) = 0

        if (n == 0) {
            return 0;
        }

        // The unintentional case - the constraint ?? positive number

        if (n < 0) {
            return 0;
        }

        // The recursion case
        return n % 10 + sumOfDigit(n / 10);
    }

    //How to calculate the power of a number using recursion
    /*
     * 1. Recursive case - the flow
     *
     * //Explanation
     * x^n = x * n(times)
     * 2^4 = 2*2*2*2
     * x^a * x^b = x^a+b
     * x^3 * x^4 = x^7
     *
     * // Equation
     * x^n = X * X^n-1
     *
     * */

    private int powerOfNumber(int base, int exp) {
        if (exp < 0) {
            return -1;
        }

        if (exp == 0 || exp == 1) {
            return base;
        }

        return base * powerOfNumber(base, exp - 1);

    }

    // how to find GCD(Greatest Common Divisor) of two numbers using recursion

    /*
     * 1. Recursive case - the flow
     *
     * -> Explanation
     *
     * - GCD is the Largest positive integer that divides the numbers without the reminder
     * - in math called Greatest common denominator, greatest common factor, or highest common factor
     * - more efficient to calculate GCD is Euclidean algorithm
     *   - gcd(48,18)
     *   - step 1: 48 /18 = 2 reminder =12
     *   - step 2: 18/12 = 1 reminder 6
     *   - step 3: 12/6 = 2 reminder 0
     *
     * -> Equation
     * gcd(a,0) = a
     * gcd(a,b) = gcd(b, a mod b)
     *
     */

    private int GCD(int a, int b) {

        if (a < 0 || b < 0) {
            return -1;
        }

        if (b == 0) {
            return a;
        }

        return GCD(b, a % b);

    }

    //How to convert Decimal number to binary using recursion

    /*
    -> Explanation
    Step 1: divide the number by 2
    Step 2: get the integer quotient for the next iteration
    Step 3: get the reminder for the binary digit
    Step 4: repeat the steps untile the quotient is equal to 0

    -> Equation
    f(n)= n mod 2 + f(n / 2)

    */

    private int decimalToBinary(int n) {

        if (n == 0) {
            return 0;
        }

        return n % 2 + 10 * decimalToBinary(n / 2);
    }

    private int findMaxNumber(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        return max(arr[n - 1], findMaxNumber(arr, n - 1));


    }


    // mutiple of all array elements to a given number
//    public int productofArray(int A[], int N) {
//        if (N <= 0)
//            return 1;
//        return (productofArray(A, N - 1) * A[N - 1]);
//    }

    // sum of all preceding sequence of number
    public int recursiveRange(int num) {
        if (num <= 0) {
            return 0;
        }
        return num + recursiveRange(num - 1);
    }

    private int[] productOfArrayRe(int[] arr) {

        int flag = -1;
        int i = 0;
        int prod = 1;

        int[] result = new int[arr.length];

        while (flag < arr.length - 1) {
            if (flag == arr.length - 1) {
                return result;
            }

            if (i == flag) {
                continue;
            }

            prod *= arr[i];
            i++;

            if (i == arr.length) {
                result[flag + 1] = prod;
                i = 0;
                flag++;
            }


        }

        return result;

    }

    private int[] prodArr = new int[0];
    private int multi = 1;
    private int pos=0;

    private int[] prodOfArray(int[] arr1) {
        if (prodArr.length == 0){
            prodArr = new int[arr1.length];
        }

        //current = pos;

        for (int i = 0; i < arr1.length; i++) {
            if (pos == i){
                continue;
            }
            multi *= arr1[i];

        }
            System.out.println(pos);
            prodArr[pos]= multi;
            multi=1;
            pos++;



        if (pos < arr1.length){
            prodOfArray(arr1);
        }

        return prodArr;

    }

}
