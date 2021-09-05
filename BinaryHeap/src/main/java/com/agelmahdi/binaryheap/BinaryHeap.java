package com.agelmahdi.binaryheap;

public class BinaryHeap {
    private int[] heap;
    private int lastVisitedIndex;
    private String heapType;
    protected static final String MAX_HEAP = "MAX";
    protected static final String MIN_HEAP = "MIN";

    public BinaryHeap(int size, String heapType) {
        heap = new int[size + 1];
        lastVisitedIndex = 0;
        this.heapType = heapType;
    }


    public void insert(int value) {
        if (isFull()) {
            System.out.println("Heap is full");
            return;
        }
        heap[lastVisitedIndex + 1] = value;
        lastVisitedIndex++;
        heapifyBottomTop(lastVisitedIndex);
    }

    private void heapifyBottomTop(int index) {
        int parent = index / 2;

        if (index <= 1) {
            return;
        }
        if (heapType.equals(MIN_HEAP)) {
            if (heap[index] < heap[parent]) {
                int temp = heap[parent];
                heap[parent] = heap[index];
                heap[index] = temp;
            }

        } else if (heapType.equals(MAX_HEAP)) {
            if (heap[index] > heap[parent]) {
                int temp = heap[parent];
                heap[parent] = heap[index];
                heap[index] = temp;
            }
        }

        heapifyBottomTop(parent);

    }


    public void levelOrderTraversal() {
        for (int i = 1; i <= lastVisitedIndex; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new NullPointerException("Heap is empty");
        }

        return heap[1];
    }

    private boolean isEmpty() {
        return lastVisitedIndex == 0;
    }

    private boolean isFull() {
        return lastVisitedIndex == heap.length - 1;
    }

    public int getSize() {
        return lastVisitedIndex;
    }


}
