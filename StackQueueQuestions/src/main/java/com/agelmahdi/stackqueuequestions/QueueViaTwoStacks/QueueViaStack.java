package com.agelmahdi.stackqueuequestions.QueueViaTwoStacks;

import java.util.EmptyStackException;
import java.util.Stack;

public class QueueViaStack {
    Stack<Integer> inputStack = null;
    Stack<Integer> outputStack = null;


    public QueueViaStack() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void enqueue(int value) {
        inputStack.push(value);
    }

    public int dequeue() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.pop();
    }

}
