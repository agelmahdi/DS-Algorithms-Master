package com.agelmahdi.searchingalgorithms;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {2,4,6,7,9,12,15,21,40,90,95};

        System.out.println(binarySearch.search(arr,40));

    }
}
