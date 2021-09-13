package com.agelmahdi.sortingalgorithms;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort(BubbleSort.DESCENDING);
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort(InsertionSort.DESCENDING);
        MergeSort mergeSort = new MergeSort();
        BucketSort bucketSort = new BucketSort(new int[2]);
        QuickSort quickSort = new QuickSort();
        int[] arr = {9,4,2,4,6,7,8,9,2,4,8};



    }



}
