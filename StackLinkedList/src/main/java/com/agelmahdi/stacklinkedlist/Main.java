package com.agelmahdi.stacklinkedlist;

public class Main {
    public static void main(String[] args) {


        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.traverse();

        stack.poll();
        stack.peek();

        stack.traverse();

    }
}
