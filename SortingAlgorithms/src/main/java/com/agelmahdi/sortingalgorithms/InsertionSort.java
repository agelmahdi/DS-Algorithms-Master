
package com.agelmahdi.sortingalgorithms;

public class InsertionSort {

    private String sortType;
    public static final String DESCENDING = "DES";

    public InsertionSort(String type) {
        sortType = type;
    }

    public InsertionSort() {
    }

    // Time complexity O(n~2)
    // Space complexity O(1)
    public void sort(int[] sortArray) {
        int length = sortArray.length;

        for (int i = 1; i < length; i++) {
            int temp = sortArray[i], j = i;

            if (sortType != null && sortType.equals(DESCENDING)) {
                while (j > 0 && sortArray[j - 1] < temp) {
                    sortArray[j] = sortArray[j - 1];
                    j--;
                }
            } else {
                while (j > 0 && sortArray[j - 1] > temp) {
                    sortArray[j] = sortArray[j - 1];
                    j--;
                }
            }
            sortArray[j] = temp;
        }

    }

    public void print(int[] sortArray) {
        for (int i = 0; i < sortArray.length; i++) {
            System.out.print(sortArray[i] + " ");
        }
    }
}
