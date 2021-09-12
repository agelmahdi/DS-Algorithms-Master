package com.agelmahdi.sortingalgorithms;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort(BubbleSort.DESCENDING);
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort(InsertionSort.DESCENDING);
        MergeSort mergeSort = new MergeSort();
        BucketSort bucketSort = new BucketSort(new int[2]);

        int[] arr = {9,4,2,4,6,7,8,9,2,4,8};

        mergeSort.sort(arr);
        System.out.println("\n\nSorted array");
        mergeSort.print(arr);
    }



}
