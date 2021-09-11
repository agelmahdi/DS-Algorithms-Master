package com.agelmahdi.sortingalgorithms;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort(BubbleSort.DESCENDING);
        SelectionSort selectionSort = new SelectionSort();

        int[] arr = {9,4,2,4,6,7,8,9,2,4,50,8,10};

        selectionSort.sort(arr);
        selectionSort.print(arr);
    }



}
