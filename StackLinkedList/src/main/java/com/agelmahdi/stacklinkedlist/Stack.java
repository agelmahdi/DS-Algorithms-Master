package com.agelmahdi.stacklinkedlist;

public class Stack {
    LinkedList linkedList = new LinkedList();

    // Time complexity --> O(1)
    // Space Complexity --> O(1)
    public void push(int value) {
        linkedList.insert(value);
    }

    // Time complexity --> O(1)
    // Space Complexity --> O(1)
    public int poll() {
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            int value = linkedList.head.value;
            linkedList.head = linkedList.head.next;
            linkedList.size--;
            return value;
        }
    }

    // Time complexity --> O(1)
    // Space Complexity --> O(1)
    public int peek() {
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            return linkedList.head.value;
        }
    }


    public boolean isEmpty() {
        return linkedList.head == null;

    }

    public void delete() {
        linkedList.head = null;
        linkedList.tail = null;

        System.out.println("Stack is successfully deleted");
    }

    public void traverse() {

        Node node = linkedList.head;
        for (int i = 0; i < linkedList.size; i++) {
            System.out.print(node.value);
            if (i != linkedList.size - 1) {
                System.out.print(" -> ");
            }
            node = node.next;

        }
        System.out.println("\n");

    }


}
