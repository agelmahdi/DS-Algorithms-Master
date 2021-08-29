package com.agelmahdi.stackqueuequestions;


import com.agelmahdi.stackqueuequestions.StackOfPlates.SetOfStacks;
import com.agelmahdi.stackqueuequestions.StackOfPlates.Stack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        ManyStacksInOneArray stack = new ManyStacksInOneArray(5,3);
//
//        stack.push(0,1);
//        stack.push(0,2);
//        stack.push(0,10);
//
//        stack.push(1,3);
//        stack.push(1,4);
//        stack.push(1,11);
//
//        stack.push(2,5);
//        stack.push(2,6);
//        stack.push(2,12);
//
//        stack.push(3,7);
//        stack.push(3,8);
//        stack.push(3,9);
//
//        stack.poll(3);
//        System.out.println(Arrays.toString(stack.getSizes()));
//
//        stack.traverse();
//
//        Stack stack = new Stack();
//        stack.push(2);
//        stack.push(2);
//        stack.push(3);
//        stack.push(7);
//        stack.push(5);
//        stack.push(1);
//        stack.poll();
//
//        System.out.println(stack.getMin());

//        QueueViaStack queueViaStack = new QueueViaStack();
//        queueViaStack.enqueue(1);
//        queueViaStack.enqueue(2);
//        queueViaStack.enqueue(3);
//        queueViaStack.enqueue(4);
//        queueViaStack.enqueue(5);
//        queueViaStack.enqueue(6);
//        System.out.println(queueViaStack.dequeue());

        SetOfStacks stack = new SetOfStacks(2);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        System.out.println(stack.popAt(0));



    }
}
