package com.agelmahdi.binaryheap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap binaryHeap = new BinaryHeap(5,BinaryHeap.MAX_HEAP);

        binaryHeap.insert(10);
        binaryHeap.insert(5);
        binaryHeap.insert(15);
        binaryHeap.insert(1);
        System.out.println(binaryHeap.extractHeapRoot());

        binaryHeap.levelOrderTraversal();
    }
}
