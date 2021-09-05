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

        // Time Complexity O(log(n))
        // Space Complexity O(log(n))
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

        heapifyBottomTop(parent); //------ O(log(n))

        // Time Complexity O(log(n))
        // Space Complexity O(log(n))

    }



    // only extract a root node
    public int extractHeapRoot(){
        if (isEmpty()){
            throw new NullPointerException();
        }

        int extracted = heap[1];
        heap[1] = heap[lastVisitedIndex];
        lastVisitedIndex--;
        heapifyTopBottom(1);//------ O(log(n)
        return extracted;

        // Time Complexity O(log(n))
        // Space Complexity O(log(n))

    }
    private void heapifyTopBottom(int root) {
        int left = 2 * root;
        int right = 2 * root + 1;
        int swapChild = 0;
        if (lastVisitedIndex < left) {
            return;
        }
        if (heapType.equals(MIN_HEAP)) {
            if (lastVisitedIndex == left) { // has only one child
                if (heap[root] > heap[left]) {
                    int temp = heap[root];
                    heap[root] = heap[left];
                    heap[left] = temp;
                }
                return;
            } else { // has two children take the smallest child
                if (heap[left] < heap[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }

                if (heap[root] > heap[swapChild]) {
                    int temp = heap[root];
                    heap[root] = heap[swapChild];
                    heap[swapChild] = temp;
                }
                return;
            }

        } else if (heapType.equals(MAX_HEAP)) {
            if (lastVisitedIndex == left) { // has only one child
                if (heap[left] > heap[root]) {
                    int temp = heap[root];
                    heap[root] = heap[left];
                    heap[left] = temp;
                }
            } else {
                if (heap[right] > heap[left]) { // has two children take the biggest child
                    swapChild = right;
                } else {
                    swapChild = left;
                }

                if (heap[swapChild] > heap[root]) {
                    int temp = heap[root];
                    heap[root] = heap[swapChild];
                    heap[swapChild] = temp;
                }
            }
        }
        heapifyTopBottom(swapChild); //------ O(log(n))

        // Time Complexity O(log(n))
        // Space Complexity O(log(n))

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
