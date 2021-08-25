package com.agelmahdi.queuearray;

public class LinearQueue {
    int queue[] = null;
    int startOfQueue;
    int topOfQueue;

    public LinearQueue(int size) {
        queue = new int[size];
        startOfQueue = -1;
        topOfQueue = -1;
    }

    public void enQueue(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Queue is full");
        } else if (isEmpty()){
            startOfQueue = 0;
            topOfQueue++;
            queue[topOfQueue] = value;
            System.out.println("inserted: " + value);

        }
        else {
            topOfQueue++;
            queue[topOfQueue] = value;
            System.out.println("inserted: " + value);
        }

    }

    public int deQueue() {
        if (isEmpty()) {
            throw new NullPointerException("Queue is empty");
        } else {
            int val = queue[startOfQueue];
            startOfQueue++;
            if (startOfQueue > topOfQueue){
                startOfQueue = topOfQueue = -1;
            }
            return val;
        }
    }

    public int peek() {

        if (isEmpty()) {
           // System.out.println("Queue is empty");
            throw new NullPointerException("Queue is empty");
        } else {
            return queue[startOfQueue];
        }
    }

    public boolean isEmpty() {
        if (startOfQueue == -1 || startOfQueue == queue.length) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (topOfQueue == queue.length - 1) {
            return true;
        } else return false;
    }

    public void traverse() {
        for (int i = 0; i < queue.length; i++) {

            System.out.print(queue[i]);

            if (i != queue.length - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println("\n");

    }

    public void deleteQueue() {
        queue = null;
        System.out.println("Queue is successfully deleted");

    }
}
