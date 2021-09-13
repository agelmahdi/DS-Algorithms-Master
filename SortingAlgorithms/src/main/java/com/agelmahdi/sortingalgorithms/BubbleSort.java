package com.agelmahdi.sortingalgorithms;

public class BubbleSort {
    private String sortType;
    public static final String DESCENDING = "DES";

    public BubbleSort(String type) {
        sortType = type;
    }

    public BubbleSort() {
    }

    // Time complexity O(n~2)
    // Space complexity O(1)
    public void sort(int[] sortArray) {
        int length = sortArray.length;

        for (int i = 0; i < length - 1; i++) { // ----> O(n)
            for (int j = 0; j < length - i - 1; j++) { // ----> O(n)
                if (sortType!=null && sortType.equals(DESCENDING)) {
                    if (sortArray[j] < sortArray[j + 1]) {
                        int temp = sortArray[j];
                        sortArray[j] = sortArray[j + 1];
                        sortArray[j + 1] = temp;
                    }
                } else {
                    if (sortArray[j] > sortArray[j + 1]) {
                        int temp = sortArray[j];
                        sortArray[j] = sortArray[j + 1];
                        sortArray[j + 1] = temp;
                    }
                }

            }
        }
    }

    public void print(int[] sortArray) {
        for (int i = 0; i < sortArray.length; i++) {
            System.out.print(sortArray[i] + " ");
        }
    }
}
