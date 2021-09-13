package com.agelmahdi.sortingalgorithms.HeapSort;


public class HeapSort {
    private int[] array;

    public HeapSort(int[] arr) {
        this.array = arr;

    }

    // Time Complexity O(nLog(n))
    // Space Complexity O(n) because of recursion
    // Space Complexity O(1) without recursion
    public void sort() {
        BinaryHeap binaryHeap = new BinaryHeap(array.length);//----> O(1)

        for (int i = 0; i < array.length; i++) {//----> O(n)
            binaryHeap.insertInHeap(array[i]);//----> O(log(n))
        }
        for (int i = 0; i < array.length; i++) {//---->  O(n)
            array[i] = binaryHeap.extractHeadOfHeap();//----> O(log(n))
        }

    }

}
