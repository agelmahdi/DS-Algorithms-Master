package com.agelmahdi.doublylinkedlist;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public Node createDLL(int value) {

        Node node = new Node();
        node.value = value;

        node.next = null;
        node.previous = null;

        head = node;
        tail = node;

        size = 1;

        return node;


    }

    public void insertInDLL(int value, int location) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            createDLL(value);
            return;
        } else if (location == 0) {
            node.previous = null;
            node.next = head;
            head.previous = node;
            head = node;
        } else if (location >= size) {
            node.next = null;
            node.previous = tail;
            tail.next = node;
            tail = node;
        } else {
            Node temp = head;
            for (int i = 0; i < location - 1; i++) {
                temp = temp.next;
            }
            Node nextNode = temp.next;

            node.previous = temp;
            node.next = nextNode;
            temp.next = node;

            node.next.previous = node;
        }
        size++;

    }

    public void deleteItemFromDLL(int location) {
        if (head == null) {
            return;
        } else if (location == 0) {
            head = head.next;
            head.previous = null;
            if (size == 0){
                head = tail =null;
                //size--;
            }
            size--;

        }
        else if (location >= size -1){

            Node beforeLast = tail.previous;

            if (beforeLast == head){
                head=tail=null;
                size--;
                return;
            }

            beforeLast.next = null;
            tail.next = beforeLast;
            tail = beforeLast;
            size--;

        }
        else {
             Node before= head;

             for (int i=0;i<location-1;i++){
                 before=before.next;
             }

            before.next = before.next.next;
            before.next.previous = before;
            //temp.previous = temp.previous.previous;

           // temp.next.next.previous = temp.next;

            size--;
        }
    }
    public void traverseDLL(){

        if (head == null){
            System.out.println("Head not found");
        }
        else {
            Node temp = head;
            for (int i =0; i<size; i++){
                System.out.print(temp.value);
                if (i != size -1){
                    System.out.print(" -> ");
                }
                temp = temp.next;
            }
        }
        System.out.println("\n");
        //Time Complexity O(n)
        //Space Complexity O(1)

    }
}
