package com.agelmahdi.circularlinkedlist;

public class CircularSingleLinkedList {
    Node head = null;
    Node tail = null;
    int size = 0;

    public Node createCSll(int value) {

        //Time Complexity O(1)
        //Space Complexity O(1)

        Node node = new Node();

        node.value = value;
        node.next = node;

        head = node;
        tail = node;

        size = 1;

        return node;
    }

    public void insertInCSLL(int value, int location) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            createCSll(value);//-----------------> O(1)
            return;
        } else if (location == 0) {
            node.next = head; // head = first node
            head = node; // insert node in first location
            tail.next = node; // ref recently inserted node in last node
           // tail = node; //

        } else if (location >= size) {
            node.next = head; // ref first node in last node
            tail.next = node; // insert node in last node
            tail = node; // ref tail with last node

        } else {
            Node temp = head;
            for (int i = 0; i < location - 1; i++) {
                temp = temp.next; // current location to insert node
            }
            Node nextNode = temp.next; // save the next node to link with currently inserted node
            temp.next = node; // insert node to linkedlist
            node.next = nextNode; // ref next node to currently inserted node
        }
        size++;

    }


    public void deleteNodeCSLL(int location) {
        if (head == null) {
            System.out.println("Head not found");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next=head;
            tail = head;
            size--;
            if (size==0){
                head = tail= null;
            }

        } else if (location >= size) {
            Node temp = head;
            for (int i = 0; i < size - 1; i++) { // get before last node
                temp = temp.next; // before last node
            }
            if (temp==head){
                head =tail=null;
                size--;
                return;
            }
            temp.next = head;
            tail = temp;
            size--;
        } else {
            Node start = head;
            for (int i = 0; i < location - 1; i++) {
                start = start.next;
            }
            start.next = start.next.next;
            size--;
        }


    }

    public void traverseCSLL() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.println(temp.value);
            temp = temp.next;

        }
    }

}
