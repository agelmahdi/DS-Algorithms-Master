package com.agelmahdi.stackqueuequestions.StackOfPlates;

import java.util.EmptyStackException;

public class Stack {
    private int capacity;
    Node head;
    Node tail;
    int size;

    public Stack(int capacity){
        this.capacity = capacity;
    }


    public boolean push(int value){
        if (size > capacity){
            return false;
        }
        Node node = new Node();
        node.value = value;

        if (head == null){
            head = new Node();
            head= node;
            size= 1;
        }
        else {
            node.next = head;
            head = node;
            size++;
        }

        return true;

    }

    public int pop(){
        if (head == null) throw new EmptyStackException();
        int value = head.value;

        head = head.next;

        size--;
        return value;
    }

    public boolean isFull(){
        return size == capacity;
    }
    public void traverse() {

        Node node = head;
        for (int i = 0; i < size; i++) {
            System.out.print(node.value);
            if (i != size - 1) {
                System.out.print(" -> ");
            }
            node = node.next;

        }
        System.out.println("\n");

    }
}
