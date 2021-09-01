package com.agelmahdi.binarytree.BinaryTreeArray;

public class BinaryTree {
    String arr[];
    int lastVisitedIndex;

    // Time complexity O(1)
    // Space complexity O(n)
    public BinaryTree(int size) {
        arr = new String[size + 1];
        lastVisitedIndex = 0;
    }

    // Time complexity O(1)
    // Space complexity O(1)

    public boolean insert(String value) {
        if (!isFull()) {
            arr[lastVisitedIndex + 1] = value;
            lastVisitedIndex++;
            return true;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /*
     * binary tree search
     *
     * 1.Depth first search
     * - Pre order traversal
     * - In order traversal
     * - Post order traversal
     *
     * 2.Breadth first search
     * - Level order traversal
     */


    // Time complexity O(n)
    // Space complexity O(n)

    //root -> left -> right
    public void preOrderTraversal(int index) {
        if (index > lastVisitedIndex) {
            return;
        }
        System.out.print(arr[index] + " ");
        preOrderTraversal(2 * index);//----->O(n/2) // left
        preOrderTraversal(2 * index + 1);//----->O(n/2) // right


    }

    // Time complexity O(n)
    // Space complexity O(n)

    // left -> root -> right
    public void inOrderTraversal(int index) {
        if (index > lastVisitedIndex) {
            return;
        }
        inOrderTraversal(index * 2);//----->O(n/2) // left
        System.out.print(arr[index] + " ");
        inOrderTraversal(index * 2 + 1);//----->O(n/2) // right
    }

    // Time complexity O(n)
    // Space complexity O(n)

    // left -> right -> root
    public void postOrderTraversal(int index) {
        if (index > lastVisitedIndex) {
            return;
        }
        postOrderTraversal(2 * index); //----->O(n/2) // left
        postOrderTraversal(2 * index + 1); //----->O(n/2) // right
        System.out.print(arr[index] + " ");

    }
    // Time complexity O(n)
    // Space complexity O(1)
    public void levelOrderTraversal() {
        for (int i = 1; i < lastVisitedIndex; i++) {
            System.out.print(arr[1] + " ");
        }
    }
    // Time complexity O(n)
    // Space complexity O(1)
    public int search(String value) {
        for (int i = 1; i < lastVisitedIndex; i++) {
            if (arr[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    // Time complexity O(n)
    // Space complexity O(1)
    public void delete(String value) {
        int location = search(value); //------>O(n)
        if (location == -1) {
            return;
        }
        arr[location] = arr[lastVisitedIndex];
        lastVisitedIndex--;
    }
    // Time complexity O(1)
    // Space complexity O(1)
    public void deleteBT() {
        try {
            arr = null;
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private boolean isFull() {
        return lastVisitedIndex == arr.length - 1;
    }
}
