package com.agelmahdi.sortingalgorithms;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort(BubbleSort.DESCENDING);
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort(InsertionSort.DESCENDING);

        int[] arr = {9,4,2,4,6,7,8,9,2,4,8};
        BucketSort bucketSort = new BucketSort(arr);

        bucketSort.sort();
        System.out.println("\n\nSorted array");
        bucketSort.print();
    }



}
