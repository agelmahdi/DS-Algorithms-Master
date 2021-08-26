package com.agelmahdi.queuearray;

public class LinearQueue {
    int queue[] = null;
    int startOfQueue;
    int topOfQueue;

    //Time complexity O(1)
    //Space complexity O(n)
    public LinearQueue(int size) {
        queue = new int[size];
        startOfQueue = -1;
        topOfQueue = -1;
    }

    //Time complexity O(1)
    //Space complexity O(1)
    public void enQueue(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Queue is full");
        } else if (isEmpty()) {
            startOfQueue = 0;
            topOfQueue++;
            queue[topOfQueue] = value;
            System.out.println("inserted: " + value);

        } else {
            topOfQueue++;
            queue[topOfQueue] = value;
            System.out.println("inserted: " + value);
        }

    }

    //Time complexity O(1)
    //Space complexity O(1)
    public int deQueue() {
        if (isEmpty()) {
            throw new NullPointerException("Queue is empty");
        } else {
            int val = queue[startOfQueue];
            startOfQueue++;
            if (startOfQueue > topOfQueue) {
                startOfQueue = topOfQueue = -1;
            }
            return val;
        }
    }

    //Time complexity O(1)
    //Space complexity O(1)
    public int peek() {

        if (isEmpty()) {
            // System.out.println("Queue is empty");
            throw new NullPointerException("Queue is empty");
        } else {
            return queue[startOfQueue];
        }
    }

    //Time complexity O(1)
    //Space complexity O(1)
    private boolean isEmpty() {
        return startOfQueue == -1 || startOfQueue == queue.length;
    }

    //Time complexity O(1)
    //Space complexity O(1)
    private boolean isFull() {
        return topOfQueue == queue.length - 1;
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
