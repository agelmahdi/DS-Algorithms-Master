package com.agelmahdi.binarytree.TreeLinkedList;

import java.security.PublicKey;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public Node root;

    public BinaryTree() {
        root = null;
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


    //root -> left -> right

    public void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrderTraversal(node.left); //----->O(n/2) //left
        preOrderTraversal(node.right);//----->O(n/2) //right
        //Time Complexity O(n)
        //Space Complexity O(n)
    }

    // left -> root -> right
    public void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left); //----->O(n/2) // left
        System.out.print(node.value + " ");
        inOrderTraversal(node.right);//----->O(n/2) // right

        //Time Complexity O(n)
        //Space Complexity O(n)
    }

    // left -> right -> root
    public void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left); //----->O(n/2) // left
        postOrderTraversal(node.right);//----->O(n/2) // right
        System.out.print(node.value + " ");

        //Time Complexity O(n)
        //Space Complexity O(n)
    }

    public void levelTraversal() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) { // ------> Time complexity O(n)
            Node node = queue.remove();
            System.out.print(node.value + " ");//root
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

    public boolean searchBT(String value) {
        Queue<Node> queue = new LinkedList<>();
        ((LinkedList<Node>) queue).add(root);
        while (!queue.isEmpty()) { // ------> Time complexity O(n)
            Node node = queue.remove();
            if (node.value.equals(value)) {
                return true;
            } else {
                if (node.left != null) {
                    ((LinkedList<Node>) queue).add(node.left);
                }
                if (node.right != null) {
                    ((LinkedList<Node>) queue).add(node.right);
                }
            }


        }
        return false;

        // Time complexity O(n)
        // Space complexity O(n)
    }

    public boolean insert(String value) {
        Node newNode = new Node();
        newNode.value = value;

        if (root == null) {
            root = newNode;
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        ((LinkedList<Node>) queue).add(root);

        while (!queue.isEmpty()) {// ------> Time complexity O(n)
            Node node = queue.remove();
            if (node.left == null) {
                node.left = newNode;
                return true;

            } else if (node.right == null) {
                node.right = newNode;
                return true;

            } else {
                ((LinkedList<Node>) queue).add(node.left);
                ((LinkedList<Node>) queue).add(node.right);
            }


        }

        return false;
        // Time complexity O(n)
        // Space complexity O(n)
    }


}
