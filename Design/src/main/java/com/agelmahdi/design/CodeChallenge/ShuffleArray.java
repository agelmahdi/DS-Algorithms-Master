package com.agelmahdi.design.CodeChallenge;

import java.util.Arrays;
import java.util.Random;

class ShuffleArray {

    /*
     * Given an integer array nums, design an algorithm to randomly shuffle the array.
     * All permutations of the array should be equally likely as a result of the shuffling.
     *
     * implement the Solution class:
     *
     *  solution(int[] nums) Initializes the object with the integer array nums.
     *  int[] reset() Resets the array to its original configuration and returns it.
     *  int[] shuffle() Returns a random shuffling of the array.
     * */

    public static void main(String[] args) {

        ShuffleArray obj = new ShuffleArray(new int[]{1, 2, 3});
        int[] reset = obj.reset();
        int[] shuffle = obj.shuffle();

        System.out.println(Arrays.toString(shuffle));
    }

    private int[] array;
    private int[] original;

    Random rand = new Random();

    //Fisher-Yates Algorithm
    public ShuffleArray(int[] nums) {
        array = nums;
        original = nums.clone();
    }

    private int randRange(int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    private void swapAt(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public int[] reset() {
        array = original;
        original = original.clone();
        return original;
    }

    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            swapAt(i, randRange(i, array.length));
        }
        return array;
    }
}
