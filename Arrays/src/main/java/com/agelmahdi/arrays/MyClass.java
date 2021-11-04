package com.agelmahdi.arrays;

import java.util.Arrays;
import java.util.Collection;

public class MyClass {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        int arr[] = {1,1,-1,1,1,-1};
        int arr1[] = {1,1,1,-1,1,-1};

        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(myClass.rotateMatrix90Degree(matrix));

        System.out.println(Arrays.deepToString(matrix));

       // System.out.println(myClass.isPermutation(arr,arr1));;

    }

    private String missingNumbers(int arr[]){
        Arrays.sort(arr);
        int firstNum =arr[0];
        String missing ="";
        for (int i=0; i< arr.length;i++){
            if (firstNum == arr[i]){
                firstNum++;
                continue;
            }
            missing+=arr[i];


        }
        return missing;
    }

    private void allPairsEqualToNumber(int []arr, int num){
        String pairs = "";

        for (int i = 0; i< arr.length;i++){
            for (int j=i+1; j<arr.length;j++){
                System.out.println(i+","+j);
                if (arr[i] + arr[j] ==num){
                    pairs +="["+arr[i]+","+arr[j]+"]";
                }
            }
        }
        System.out.println(pairs);
    }
    private void maxProdPairs(int []arr){

        int max=1;
        Arrays.sort(arr);
        max= arr[arr.length-1] * arr[arr.length-2];
        System.out.println("Max is: "+ max+" Pairs: "+arr[arr.length-1] +","+ arr[arr.length-2]);

//        for (int i = 0; i< arr.length;i++){
//            for (int j=i+1; j<arr.length;j++){
//                int innerMax = arr[i] * arr[j];
//
//            }
//        }

        //throw new IllegalArgumentException("Solution not found");
    }

    private boolean isUnique(int []nums){

        if (nums.length == 0) throw new ArrayIndexOutOfBoundsException();

        Arrays.sort(nums);

        for (int i = 0; i< nums.length - 1;i++){
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    private boolean isPermutation(int arr1[],int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);


        for (int i = 0; i< arr1.length;i++){
           if (arr1[i]!=arr2[i]){
               return false;
           }
        }

        return true;

    }

    private boolean rotateMatrix90Degree(int matrix[][]){
        int length = matrix.length;

        if (length ==0 || length != matrix[0].length) return false;

        //an anti clockwise example

        int rotated[][] = new int[length][length];
        for (int r = 0; r < length; r++) {
            for (int c = 0; c < length; c++) {
                rotated[c][length - 1 - r] = matrix[r][c];
            }
        }

        System.out.println(Arrays.deepToString(rotated));

        //an clockwise example

        for (int layer=0; layer < length/2 ;layer++){

            int first = layer;
            int last = length -1 -layer;
            for (int cell = first; cell < last ; cell++){

                int offset = cell - first; // to find the location of the cell of inner layer

                int top = matrix[first][cell]; // save top element

                matrix[first][cell] = matrix[last - offset][first]; // save last to the first cell

                matrix[last - offset][first] = matrix[last][last-offset];

                matrix[last][last-offset] = matrix[cell][last];

                matrix[cell][last] = top;


            }

        }
        return true;

    }
}
