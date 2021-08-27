package com.agelmahdi.stackqueuequestions.MinStackValue;

public class Stack {
    Node top;
    Node min;

    public Stack() {
        top = null;
        min = null;
    }

    public void push(int value) {


        if (min == null) {
            min = new Node(min, value);
        } else if (min.value < value) {
            min = new Node(min, min.value);
        } else {
            min = new Node(min, value);
        }
        top = new Node(top, value);
    }

    public int poll() {
        if (top == null) {
            throw new NullPointerException("Stack is empty");
        }
        min = min.next;
        int value = top.value;
        top = top.next;
        return value;

    }

    public int getMin() {
        return min.value;
    }
}
