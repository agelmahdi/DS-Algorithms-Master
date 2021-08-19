package com.agelmahdi.bigo;

import java.util.Arrays;

public class MyClass {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();

        int arr[] = {1,2,3,4,5,6};
        myClass.reverseArr(arr);

    }

    private void printPairsOfArray(int arr[]){

        for (int i=0; i<arr.length;i++){
            for (int j=0; j < arr.length; j++){
                System.out.println(arr[i] +"."+ arr[j]);
            }
        }
    }

    private void printPairs(int arr[]){

        for (int i=0; i<arr.length;i++){ //---------- O(n)
            for (int j=i+1; j < arr.length; j++){ //----------- O(n)
                System.out.println(arr[i] +"."+ arr[j]); //---------- 0(1)
            }
        }

        // O(n^2)
    }
    private void printUnOrderedPairsOfArray(int arr1[],int arr2[]){

        for (int i=0; i<arr1.length;i++){ //---------- O(a)
            for (int j=0; j < arr2.length; j++){ //----------- O(b)
                System.out.println(arr1[i] +"."+ arr2[j]); //---------- 0(1)
            }
        }
        // O(ab) === O(n^2)
    }

    private void printUnOrderedPairs(int arr1[],int arr2[]){

        for (int i=0; i<arr1.length;i++){ //---------- O(a)
            for (int j=i+1; j < arr2.length; j++){ //----------- O(b)
                for (int k =0; k< 10000000;k++){ // ----------------------- O(1) constant
                    System.out.println(arr1[i] +"."+ arr2[j]); //---------- 0(1)
                }

            }
        }
        // O(ab) === O(n^2)
    }


    private void reverseArr(int [] arr){

        //divide the array to the half of length
        for(int i =0; i< arr.length/2;i++){ //----------- O(n/2)

            // store last index of the element value from the array
            int lastPos = arr.length-i-1; // ----------------------- O(1)

            // store the first the element value from the array in temp
            int temp = arr[i]; // ----------------------- O(1)

            // swap last element value with first element value
            arr[i] = arr[lastPos]; // ----------------------- O(1)

            // swap first element value with the last element value stored in temp
            arr[lastPos] = temp; // ----------------------- O(1)

        }
        System.out.println(Arrays.toString(arr)); // ----------------------- O(1)

        // O(n^2)
    }
}
