package com.agelmahdi.stackqueuequestions.StackOfPlates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Set;

public class SetOfStacks {
    ArrayList<Stack> stacks = new ArrayList<>();
    int capacity;

    public SetOfStacks(int capacity){
        this.capacity = capacity;
    }

    public Stack getLastStack(){

        if (stacks.size() ==0){
            return null;
        }
        return stacks.get(stacks.size()-1);
    }

    public void push(int value){
        Stack last = getLastStack();
        if (last!= null && !last.isFull()){
            last.push(value);
        }
        else {
            Stack stack = new Stack(capacity);
            stack.push(value);
            stacks.add(stack);

        }
    }

    public int pop(){
        Stack last = getLastStack();

        if (last ==null) throw new EmptyStackException();
        int value = last.pop();
        if (last.size ==0){
            stacks.remove(stacks.size()-1);
        }
        return value;
    }


    public int getStacks() {
        return stacks.size();
    }
}
