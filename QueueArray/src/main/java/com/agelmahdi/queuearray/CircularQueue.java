package com.agelmahdi.queuearray;

public class CircularQueue {
    int queue[] = null;
    int start;
    int top;
    int size;

    //Time complexity O(1)
    //Space complexity O(n)
    public CircularQueue(int size) {
        queue = new int[size];
        top = -1;
        start = -1;
        this.size = size;
    }

    //Time complexity O(1)
    //Space complexity O(1)
    public void enQueue(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Queue is full");
        } else if (isEmpty()) {
            start = 0;
            top++;
            queue[top] = value;

            System.out.println("Queued: " + value + " Position: " + top);
        } else {
            if (top + 1 == size) {
                top = 0;
            } else {
                top++;
            }
            queue[top] = value;
            System.out.println("Queued: " + value + " Position: " + top);
        }

    }

    //Time complexity O(1)
    //Space complexity O(1)
    private boolean isFull() {
        if (top + 1 == start) return true;
        else return start == 0 && top + 1 == size;
    }

    //Time complexity O(1)
    //Space complexity O(1)
    private boolean isEmpty() {
        return top == -1;
    }

    //Time complexity O(1)
    //Space complexity O(1)
    public int deQueue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is full");
        } else {
            int value = queue[start];
            queue[start] = Integer.MIN_VALUE;
            if (start == top) {
                top = start = -1;
            } else if (start + 1 == size) {
                start = 0;
            } else {
                start++;
            }
            return value;
        }
    }

    //Time complexity O(1)
    //Space complexity O(1)
    public int peek() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty");
        } else {
            return queue[start];
        }

    }


}
