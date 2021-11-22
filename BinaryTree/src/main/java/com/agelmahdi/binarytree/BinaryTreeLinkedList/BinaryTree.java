package com.agelmahdi.binarytree.BinaryTreeLinkedList;

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
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }

        }

        // Time complexity O(n)
        // Space complexity O(n)

    }

    public boolean searchBT(String value) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) { // ------> Time complexity O(n)
            Node node = queue.remove();
            if (node.value.equals(value)) {
                return true;
            } else {
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
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
        queue.add(root);

        while (!queue.isEmpty()) {// ------> Time complexity O(n)
            Node node = queue.remove();
            if (node.left == null) {
                node.left = newNode;
                return true;

            } else if (node.right == null) {
                node.right = newNode;
                return true;

            } else {
                queue.add(node.left);
                queue.add(node.right);
            }


        }

        return false;
        // Time complexity O(n)
        // Space complexity O(n)
    }

    //Delete a node
    /* Level order traversal
     * Step 1: Find the Node
     * Step 2: Find the Deepest node is the one which should be visited last in the case of Level order traversal
     * Step 3: Set the Deepest node to the current node
     * Step 4: Delete Deepest node
     *  */

    public void deleteNode(String value) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) { //------------------------->O(n)
            Node current = queue.remove();
            if (current.value.equals(value)){
                current.value = getDeepestNode().value; //---->O(n) // it runs separately, nested loop not found so it takes O(N) not O(N^2)
                deleteDeepestNode(); //----------------------->O(n) // it runs separately, nested loop not found so it takes O(N) not O(N^2)
                return;
            }
            if (current.left!=null){
                queue.add(current.left);
            }
            if (current.right!=null){
                queue.add(current.right);
            }
        }
        // Time Complexity O(n)
        // Space Complexity O(n)
    }

    private Node getDeepestNode() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        Node node = null;
        while (!queue.isEmpty()) {
            node = queue.remove();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }

        }
        return node;
    }

    private void deleteDeepestNode() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node prev, current = null;
        while (!queue.isEmpty()) {
            prev = current;
            current = queue.remove();

            if (current.left == null) {
                prev.right = null;
                return;
            } else if (current.right == null) {
                current.left = null;
                return;
            }
            queue.add(current.left);
            queue.add(current.right);
        }
    }




}
