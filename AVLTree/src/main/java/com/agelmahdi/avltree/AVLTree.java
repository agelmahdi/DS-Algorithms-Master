package com.agelmahdi.avltree;


public class AVLTree {
    Node root;
    static final int COUNT = 5;

    public AVLTree() {
        root = null;
    }

    /*
     * Case 1: Rotation not required
     * Case 2: Rotation required
     *   * find the path of dis-balanced node to its grand-child if more than one we choose one which height is more
     *
     *  1 - Left Left condition "LL"
     *    -> Right rotation for dis-balanced node
     *
     *  2 - Left Right condition "LR"
     *    -> Left rotation for left child of dis-balanced node
     *    -> Right rotation for dis-balanced node
     *
     *  3 - Right Right condition "RR"
     *    -> Left rotation for dis-balanced node
     *
     *  4 - Right Left condition "RL"
     *    -> Right rotation for left child of dis-balanced node
     *   -> Left rotation for dis-balanced node
     * */

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node root, int value) {


        if (root == null) {
            Node newNode = new Node();
            newNode.value = value;
            newNode.height = 1;
            return newNode;

        } else if (value < root.value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);


        }

        root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));

        int isBalanced = isBalanced(root);

        if (isBalanced > 1 && value < root.left.value) { // Left Left condition
            return rotateRight(root);
        }

        if (isBalanced > 1 && value > root.left.value) { // left Right condition
            root.left = rotateLeft(root.left); // left child
            return rotateRight(root);

        }

        if (isBalanced < -1 && value > root.right.value) { // Right Right condition
            return rotateLeft(root);
        }

        if (isBalanced < -1 && value < root.right.value) { // Right Left condition
            root.right = rotateRight(root.right); // Right child
            return rotateLeft(root);

        }


        return root;

    }

    private Node rotateLeft(Node disbalancedNode) {
        Node newRoot = disbalancedNode.right;
        disbalancedNode.right = disbalancedNode.right.left;
        newRoot.left = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;

    }

    private Node rotateRight(Node disbalancedNode) {
        Node newRoot = disbalancedNode.left;
        disbalancedNode.left = disbalancedNode.left.right;
        newRoot.right = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }

        return node.height;

    }

    private int isBalanced(Node node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }



}
