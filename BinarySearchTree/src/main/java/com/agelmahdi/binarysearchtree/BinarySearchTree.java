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
            return current;
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
        // Time complexity O(n)
        // Space complexity O(n)

    }

    public void inOrderTraversal(Node node) {

        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.value + " ");
        inOrderTraversal(node.right);
        // Time complexity O(n)
        // Space complexity O(n)

    }

    public void postOrderTraversal(Node node) {

        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + " ");
        // Time complexity O(n)
        // Space complexity O(n)

    }

    public void levelTraversal() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) { // ------> Time complexity O(n)
            Node node = queue.remove();
            System.out.print(node.value + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }

        }

        // Time complexity O(n)
        // Space complexity O(n)

    }

    public Node search(Node node, int value) {
        if (node == null) {
            return null;
        } else if (node.value == value) {
            return node;
        } else if (value < node.value) {
            return search(node.left, value);//------------>O(n/2)
        } else {
            return search(node.right, value);//------------>O(n/2)
        }

        // Time complexity O(log(n))
        // Space complexity O(log(n))
    }

    /*
     * Case 1: the node to be deleted is a leaf node
     * case 2: the node has one child
     * case 3: the node has two child find the successor which have the smallest in right half
     * */


    //the successor of a given node
    public static Node findMin(Node root) {
        if (root.left == null) {
            return root;
        } else {
            return findMin(root.left);
        }
    }

    public Node delete(Node root, int value) {
        if (root == null) {
            return null;
        }

        if (value < root.value) {
            root.left = delete(root.left, value);//------------>O(n/2)
        } else if (value > root.value) {
            root.right = delete(root.right, value);//------------>O(n/2)
        } else {
            if (root.left != null && root.right != null) { //the node has two child
                Node minRight = findMin(root.right); //------------>O(n/2)
                root.value = minRight.value;
                root.right = delete(root.right, minRight.value);//------------>O(n/2)

            } else if (root.left != null) { //the node has one child
                root = root.left;
            } else if (root.right != null) { //the node has one child
                root = root.right;
            } else {
                root = null; //the node to be deleted is a leaf node
            }

        }
        return root;

        // Time complexity O(log(n))
        // Space complexity O(log(n))
    }

    public void deleteBST() {
        root =null;
    }
}
