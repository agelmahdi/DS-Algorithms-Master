package com.agelmahdi.stackarray;

public class Stack {
    int arr[];
    int topIndex;


    // Time complexity --> O(1)
    // Space Complexity --> O(n)

    public Stack(int size){
        arr = new int[size];
        topIndex =-1;
    }

    // Time complexity --> O(1)
    // Space Complexity --> O(1)
    public void push(int value){
        if (isFull()){
            System.out.println("Stack is full");
        }else {
            topIndex++;
            arr[topIndex] = value;
            System.out.println("Inserted value: "+value);

        }

    }

    // Time complexity --> O(1)
    // Space Complexity --> O(1)

    public int poll(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            int value = arr[topIndex];
            topIndex--;
            return value;
        }

    }

    // Time complexity --> O(1)
    // Space Complexity --> O(1)

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            return arr[topIndex];
        }

    }

    // Time complexity --> O(1)
    // Space Complexity --> O(1)

    public boolean isEmpty(){
        if (topIndex == -1) return true;
        else return false;
    }

    // Time complexity --> O(1)
    // Space Complexity --> O(1)
    public boolean isFull(){
        if (topIndex == arr.length -1) return true;
        else return false;
    }

    // Time complexity --> O(1)
    // Space Complexity --> O(1)
    public void delete(){
        arr = null;
        System.out.println("Stack is successfully deleted");
    }

}
