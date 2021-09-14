package com.agelmahdi.searchingalgorithms;

public class BinarySearch {

    // Time complexity O(log(n))
    // Space complexity O(1)

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
