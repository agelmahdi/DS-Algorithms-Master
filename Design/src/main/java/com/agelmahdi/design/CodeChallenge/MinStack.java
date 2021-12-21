package com.agelmahdi.design.CodeChallenge;

import java.util.ArrayList;
import java.util.List;

class MinStack {
    /*
     * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
     *
     * Implement the MinStack class:
     *
     * MinStack() initializes the stack object.
     * void push(int val) pushes the element val onto the stack.
     * void pop() removes the element on the top of the stack.
     * int top() gets the top element of the stack.
     * int getMin() retrieves the minimum element in the stack.
     *
     * */
    private List<Integer> top;
    private List<Integer> min;
    private int lastTopIndex;
    private int lastMinIndex;

    public MinStack() {
        lastTopIndex = -1;
        lastMinIndex = -1;
        top = new ArrayList<>();
        min = new ArrayList<>();
    }

    public void push(int val) {

        if (lastMinIndex == -1) {
            lastMinIndex++;
            min.add(val);
        } else if (min.get(lastMinIndex) < val) {
            min.add(min.get(lastMinIndex));
            lastMinIndex++;
        } else {
            lastMinIndex++;
            min.add(val);
        }
        lastTopIndex++;
        top.add(val);
    }

    public void pop() {
        top.remove(lastTopIndex);
        lastTopIndex--;
        min.remove(lastMinIndex);
        lastMinIndex--;
    }

    public int top() {
        return top.get(lastTopIndex);
    }

    public int getMin() {
        return min.get(lastMinIndex);
    }
}
