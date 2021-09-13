package com.agelmahdi.sortingalgorithms;

public class QuickSort {

    private int partition(int[] arr, int left, int right) {
        int pivot = right;
        int j = left - 1;

        for (int i = left; i <= right; i++) {
            if (arr[i] <= arr[pivot]) {
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        return j;
    }

    /*
     * t(n) = 2 t(n/2) + n
     * using Substitution method (plug&chug)
     * t(n) = 2~k * t(n/2~k) + k * n
     *
     * -> last recursion = 1
     * -> n/2~k = 1
     * -> n = 2~k
     * -> k = log2(n)
     *
     * t(n) = 2~k * t(1) + K.n
     *      = 2~log2(n) + 1+ log2(n) * n
     *      = n~log2(2) + log2(n) * n
     *      = n + n log(n)
     *      = n log(n)
     *
     *  Time complexity = O(n log(n))
     *  Space complexity = O(n)
     *
     * */

    private void sort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);// -----> O(n)
            sort(arr, left, pivot - 1);// -----> T(n/2)
            sort(arr, pivot + 1, right);// -----> T(n/2)
        }
    }

    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }
    public void print(int[] sortArray) {
        for (int i = 0; i < sortArray.length; i++) {
            System.out.print(sortArray[i] + " ");
        }
    }
}
