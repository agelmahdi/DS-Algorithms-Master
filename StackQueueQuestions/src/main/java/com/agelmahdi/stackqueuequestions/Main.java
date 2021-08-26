package com.agelmahdi.stackqueuequestions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ManyStacksInOneArray stack = new ManyStacksInOneArray(5,3);

        stack.push(0,1);
        stack.push(0,2);
        stack.push(0,10);

        stack.push(1,3);
        stack.push(1,4);
        stack.push(1,11);

        stack.push(2,5);
        stack.push(2,6);
        stack.push(2,12);

        stack.push(3,7);
        stack.push(3,8);
        stack.push(3,9);

        stack.poll(3);
        System.out.println(Arrays.toString(stack.getSizes()));

        stack.traverse();

    }
}
