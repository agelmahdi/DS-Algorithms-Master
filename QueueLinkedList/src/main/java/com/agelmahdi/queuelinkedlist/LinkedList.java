package com.agelmahdi.queuelinkedlist;

public class LinkedList {
    Node head =null;
    Node tail =null;
    int size;
    public void linkedList(int value){
        Node node = new Node();
        node.value= value;
        node.next = null;

        head = node;
        tail = node;
        size= 1;

    }
    public void insert(int value){
        if (head == null){
            linkedList(value);
            return;
        }
        Node node = new Node();
        node.value = value;

        node.next = null;

        tail.next = node;
        tail = node;
        size++;
    }

}
