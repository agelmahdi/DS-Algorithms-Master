package com.agelmahdi.circulardoublylinkedlist;

import org.omg.CORBA.NO_IMPLEMENT;

public class CircularDoublySingleList {
    Node head= null;
    Node tail =null;
    int size=0;

    public Node createCDLL(int value) {

        Node node = new Node();
        node.value = value;

        head = node;
        tail = node;

        node.next = node;
        node.previous = node;

        size = 1;

        return head;



    }
    public void insertInCDLL(int value, int location) {

        Node node = new Node();
        node.value = value;
        if (head == null){
            createCDLL(value);
            return;
        }
        else if (location ==0){
            node.previous = tail;
            node.next =head;

            head.previous =node;

            head =node;
            tail.next =node;

        }else if (location >= size){
            node.next=head;
            node.previous=tail;

            head.previous=node;

            tail.next=node;
            tail = node;
        }else {
            Node before = head;
            for (int i =0; i<location -1;i++){
                before = before.next;
            }
            Node nextNode = before.next;
            before.next = node;
            node.previous = before;
            node.next = nextNode;
            nextNode.previous = node;
           // node.next.previous = node;

        }

        size++;

    }

    public void deleteItemFromCDLL(int location) {
        if (head == null){
            return;
        }
        else if (location ==0){
            head = head.next;
            head.previous = tail;
            tail.next =head;
           // tail =head;

            size--;
            if (size==0){
                head = tail= head.next=head.previous=null;
            }

        }
        else if (location >= size){

            Node beforeLast = tail.previous;

            if (beforeLast == head){
                head = tail= head.next=head.previous=null;
                size--;
                return;
            }

            //tail=tail.previous;
            beforeLast.next = head;
            tail.next = head;
           // head.previous =tail;

            size--;
        }
        else {
            Node before = head;
            for (int i=0; i<location -1; i++){
                before = before.next;
            }

            Node nextNode = before.next.next;
            before.next = nextNode;
            nextNode.previous = before;
            size--;

        }
    }

    public void traverseCDLL() {

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
