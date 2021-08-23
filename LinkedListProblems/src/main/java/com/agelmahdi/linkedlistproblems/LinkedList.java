package com.agelmahdi.linkedlistproblems;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
    Node head;
    Node tail;
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

        if (head == null) {
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

    public void traverse(LinkedList ll) {

        Node temp = ll.head;
        for (int i = 0; i < ll.size; i++) {
            System.out.print(temp.value);
            if (i != ll.size - 1) {
                System.out.print(" -> ");

            }
            temp = temp.next;
        }
        System.out.println("\n");

    }


}

