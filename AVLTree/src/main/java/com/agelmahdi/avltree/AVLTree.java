package com.agelmahdi.avltree;


import java.util.LinkedList;
import java.util.Queue;

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

    private int getLevel(int value) {

        return getLevelOfNode(root, value, 1);
    }

    public Node search(Node root, int value) {
        if (root == null) {
            return null;
        } else if (root.value == value) {
            return root;
        } else if (value < root.value) {
            return search(root.left, value);
        } else {
            return search(root.right, value);
        }

    }

    public static int getLevelOfNode(Node root, int value, int level) {
        if (root == null)
            return 0;
        if (root.value == value) {
            return level;
        }


        int result = getLevelOfNode(root.left, value, level + 1);
        if (result != 0) {
            // If found in left subtree , return
            return result;
        }
        result = getLevelOfNode(root.right, value, level + 1);

        return result;
    }

    public void levelOrderTraversal() {
        int level = 1;
        Queue<Node> queue = new LinkedList<>();
        ((LinkedList<Node>) queue).add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            System.out.print(node.value + "  ");

            if (node.left != null) {
                ((LinkedList<Node>) queue).add(node.left);

            }
            if (node.right != null) {
                ((LinkedList<Node>) queue).add(node.right);

            }
        }
    }

    static void print2DUtil(Node root, int space) {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        print2DUtil(root.right, space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.value + "\n");

        // Process left child
        print2DUtil(root.left, space);
    }

    // Wrapper over print2DUtil()
    static void print2D(Node root) {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }

}
