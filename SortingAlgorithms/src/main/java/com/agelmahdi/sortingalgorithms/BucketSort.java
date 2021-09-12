package com.agelmahdi.sortingalgorithms;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    private int[] arr;

    /*
    * Number of buckets = round (sqrt(number of elements)).
    * Appropriate bucket = round((Value * number of buckets) / maxValue).
    * then sort all buckets before merging.
    * */

    public BucketSort(int[] arr) {
        this.arr = arr;
    }


    // Time complexity O(n log(n))
    // Space complexity O(n)

    public void sort() {
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length)); // round a number up to the next largest integer
        int maxValue = Integer.MIN_VALUE;

        for (int value : arr) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for (int i=0; i<buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        for (int value: arr) {
            int bucketNumber = (int) Math.ceil(((float)value * numberOfBuckets)/(float)maxValue);
            buckets[bucketNumber-1].add(value);
        }

        System.out.println("\n\nBefore sorting");
        printBuckets(buckets);


        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket); //------> O(N Log(n)) according to java documentation
        }

        System.out.println("\n\nAfter sorting");
        printBuckets(buckets);

        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int value : bucket) {
                arr[index] = value;
                index++;
            }
        }
    }

    public void printBuckets(ArrayList<Integer>[] buckets) {
        for (int i = 0; i < buckets.length; i++) {
            System.out.println("\nBucket#" + i + ": ");
            for (int j = 0; j < buckets[i].size(); j++) {
                System.out.print(buckets[i].get(j) + " ");
            }
        }
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
