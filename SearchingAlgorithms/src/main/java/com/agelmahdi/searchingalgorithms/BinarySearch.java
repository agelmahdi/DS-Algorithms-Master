package com.agelmahdi.searchingalgorithms;

public class BinarySearch {

    // Time complexity O(log(n))
    // Space complexity O(1)


    /*
    * log2(n) = 2~x = n
    * -> 16 elements = 4 Steps
    * -> log2(16) = 2~x = 2~4 = 16 = 2*2*2*2 = 16
    *
    * -> 32 elements = 5 Steps
    * -> log2(32) = 2~x = 2~5 = 32 = 2*2*2*2*2 = 32
    * */

    public int search(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        int middle = (left + right) / 2;

        while (arr[middle] != value && left <= right) {

            if (arr[middle] > value) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
            middle = (left + right) / 2;
        }
        if (arr[middle] == value) {
            return 1;
        }
        return -1;
    }
}
