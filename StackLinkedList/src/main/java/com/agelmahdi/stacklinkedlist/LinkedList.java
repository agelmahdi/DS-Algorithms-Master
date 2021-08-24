package com.agelmahdi.stacklinkedlist;

public class LinkedList {
    Node head = null;
    Node tail = null;
    int size = 0;

    public void linkedList(int value) {
        Node node = new Node();
        head = new Node();

        node.value = value;
        node.next = null;

        head = node;
        tail = node;

        size = 1;
    }

    public void insert(int value) {
        Node node = new Node();
        System.out.println("inserted: "+ value);

        if (head == null) {
            linkedList(value);
            return;
        }

        node.value = value;
        node.next = head;

        head = node;
        size++;

    }

}
