package com.agelmahdi.stackqueuequestions.StackOfPlates;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class SetOfStacks {
    private ArrayList<Stack> stacks;
    private int capacity;

    public SetOfStacks(int capacity) {
        this.capacity = capacity;
        stacks = new ArrayList<>();
    }

    private Stack getLastStack() {

        if (stacks.size() == 0) {
            return null;
        }
        return stacks.get(stacks.size() - 1);
    }

    public void push(int value) {
        Stack last = getLastStack();
        if (last != null && !last.isFull()) {
            last.push(value);
        } else {
            Stack stack = new Stack(capacity);
            stack.push(value);
            stacks.add(stack);


        }
//        last.traverse();

    }

    public int pop() {
        Stack last = getLastStack();

        if (last == null) throw new EmptyStackException();
        int value = last.pop();
        if (last.size == 0) {
            stacks.remove(stacks.size() - 1);
        }
        last.traverse();

        return value;
    }

    //pop operation at specific sub stack

    public int popAt(int index) {
        return shift(index, true);
    }

    private int shift(int index, boolean popTop) {
        Stack stack = stacks.get(index);
        int removed;

        if (popTop) {
            removed = stack.pop();
        } else {
            removed = stack.removeLast();
        }

        if (stack.size == 0) {
            stacks.remove(index);
        } else if (stacks.size() > index + 1) {
            int value = shift(index + 1, false);
            stack.push(value);
        }

        return removed;
    }


    public int getStacks() {
        return stacks.size();
    }
}
