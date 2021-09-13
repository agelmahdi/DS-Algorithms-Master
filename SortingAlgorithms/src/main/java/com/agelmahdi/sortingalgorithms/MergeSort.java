package com.agelmahdi.sortingalgorithms;

public class MergeSort {

    private void merge(int[] arr, int left, int middle, int right) {
        int[] leftTempArray = new int[middle - left + 2];
        int[] rightTempArray = new int[right - middle + 1];

        for (int i = 0; i <= middle - left; i++) {
            leftTempArray[i] = arr[left + i];
        }

        for (int i = 0; i < right - middle; i++) {
            rightTempArray[i] = arr[middle + 1 + i];
        }

        leftTempArray[middle - left + 1] = Integer.MAX_VALUE;
        rightTempArray[right - middle] = Integer.MAX_VALUE;

        int i = 0, j = 0;

        for (int k = left; k <= right; k++) {
            if (leftTempArray[i] < rightTempArray[j]) {
                arr[k] = leftTempArray[i];
                i++;
            } else {
                arr[k] = rightTempArray[j];
                j++;
            }
        }
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
    private void sort(int arr[], int left, int right) {
        if (right > left) {
            int middle = (left + right) / 2;
            sort(arr, left, middle);// ---> t(n/2)
            sort(arr, middle + 1, right);// ---> t(n/2)
            merge(arr, left, middle, right); // ---> O(n)
        }
    }

    public void sort(int arr[]) {
        sort(arr, 0, arr.length - 1);
    }

    public void print(int[] sortArray) {
        for (int i = 0; i < sortArray.length; i++) {
            System.out.print(sortArray[i] + " ");
        }
    }
}
