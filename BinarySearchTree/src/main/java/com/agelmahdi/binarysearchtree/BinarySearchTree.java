package com.agelmahdi.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    private Node insert(Node current, int value) {
        if (current == null) {
            Node node = new Node();
            node.value = value;
            return node;
        } else if (value <= current.value) {
            current.left = insert(current.left, value);//------------>O(n/2)
            return current;
        } else {
            current.right = insert(current.right, value);//------------>O(n/2)
            return insert(current.right, value);
        }
        // It takes half of its operation left or right
        // Time complexity O(log(n))
        // Space complexity O(log(n))

    }

    public void insert(int value) {
       root = insert(root, value);
    }

    public void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);

    }

    public void inOrderTraversal(Node node) {

        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.value + " ");
        inOrderTraversal(node.right);

    }

    public void postOrderTraversal(Node node) {

        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + " ");

    }

    public void levelTraversal() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) { // ------> Time complexity O(n)
            Node node = queue.remove();
            System.out.print(node.value + " ");
            if (node.left != null) {
                ((LinkedList<Node>) queue).add(node.left);
            }
            if (node.right != null) {
                ((LinkedList<Node>) queue).add(node.right);
            }

        }

        // Time complexity O(n)
        // Space complexity O(n)

    }

    public Node search(Node node, int value) {
       return node;

    }

    public void delete() {

    }

    public void deleteBST() {

    }
}
