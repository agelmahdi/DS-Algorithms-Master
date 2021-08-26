package com.agelmahdi.queuearray;

public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(4);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();


        // queue.traverse();


    }
}
