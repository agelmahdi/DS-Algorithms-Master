package com.agelmahdi.sortingalgorithms;

public class SelectionSort {

    private String sortType;
    public static final String DESCENDING = "DES";

    public SelectionSort(String type) {
        sortType = type;
    }

    public SelectionSort() {
    }

    // Time complexity O(n~2)
    // Space complexity O(1)
    public void sort(int[] sortArray) {

        int length = sortArray.length;
        for (int i = 0; i < length; i++) { // ----> O(n)
            int selectionIndex = i;
            for (int j = i + 1; j < length; j++) { // ----> O(n)
                if (sortType != null && sortType.equals(DESCENDING)) {
                    if (sortArray[j] > sortArray[selectionIndex]) {
                        selectionIndex = j; // max index
                    }
                } else {
                    if (sortArray[j] < sortArray[selectionIndex]) {
                        selectionIndex = j; // min index
                    }
                }

            }

            if (selectionIndex != i) {
                int temp = sortArray[i];
                sortArray[i] = sortArray[selectionIndex];
                sortArray[selectionIndex] = temp;
            }
        }
    }

    public void print(int[] sortArray) {
        for (int i = 0; i < sortArray.length; i++) {
            System.out.print(sortArray[i] + " ");
        }
    }
}
