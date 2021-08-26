package com.agelmahdi.queuelinkedlist;

public class Main {
    public static void main(String[] args) {

        Queue linkedList = new Queue();
        linkedList.enQueue(1);
        linkedList.enQueue(2);
        linkedList.enQueue(3);
        linkedList.enQueue(4);
        linkedList.enQueue(5);
        linkedList.enQueue(6);

        linkedList.deQueue();
        linkedList.deQueue();
        linkedList.deQueue();
        linkedList.deQueue();
        linkedList.deQueue();

        int va =linkedList.peek();
        System.out.println(va);

        linkedList.traverse();
    }
}
