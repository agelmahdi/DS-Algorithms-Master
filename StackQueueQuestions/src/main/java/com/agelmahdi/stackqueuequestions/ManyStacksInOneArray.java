package com.agelmahdi.stackqueuequestions;

public class ManyStacksInOneArray {
    private final int numberOfStacks;
    private final int stackCapacity;
    public int[] values;
    private final int[] sizes;

    public ManyStacksInOneArray(int numberOfStacks, int stackCapacity) {
        this.numberOfStacks = numberOfStacks;
        this.stackCapacity = stackCapacity;
        values = new int[stackCapacity * numberOfStacks];
        sizes = new int[numberOfStacks];


    }

    public void push(int stackPosition, int value) {
        if (isFull(stackPosition)) {
            throw new IndexOutOfBoundsException("Stack is full");
        }
        sizes[stackPosition]++;
        values[indexOfTop(stackPosition)] = value;
    }

    public int poll(int stackPosition) {
        if (isEmpty(stackPosition)) {
            throw new NullPointerException("Stack is empty");
        }
        int value = values[indexOfTop(stackPosition)];
        values[indexOfTop(stackPosition)] = Integer.MIN_VALUE;

        sizes[stackPosition]--;
        return value;
    }

    public int peek(int stackPosition) {
        if (isEmpty(stackPosition)) {
            throw new NullPointerException("Stack is empty");
        }

        return values[indexOfTop(stackPosition)];
    }

    private int indexOfTop(int stackPosition) {
        int offset = stackPosition * stackCapacity;
        int size = sizes[stackPosition];
        return offset + size - 1;
    }

    public void traverse() {
        int pointerIndex = 1;
        int firstStackIndex = 0;
        for (int index = 0; index < values.length; index++) {
          //  int stackLastIndex = (pointerIndex * values.length / numberOfStacks) - 1;
            int nextStackFirstIndex = pointerIndex * values.length / numberOfStacks;

            if (firstStackIndex == 0){
                System.out.println("Stack: "+pointerIndex);
                firstStackIndex = nextStackFirstIndex;

            }

            if (index / nextStackFirstIndex == 1) {
                pointerIndex++;
                System.out.println("\n");

                System.out.println("Stack: "+pointerIndex);
            }

            if (index % nextStackFirstIndex != 0) {
                System.out.print(" -> ");

            }
            System.out.print(values[index]);


        }
        System.out.println("\n");


    }

    private boolean isEmpty(int stackPosition) {
        return sizes[stackPosition] == 0;
    }

    private boolean isFull(int stackPosition) {
        return sizes[stackPosition] == stackCapacity;
    }

    public int[] getSizes() {
        return sizes;
    }
}
