package com.agelmahdi.binarytree;

import com.agelmahdi.binarytree.TreeLinkedList.BinaryTree;
import com.agelmahdi.binarytree.TreeLinkedList.Node;

public class Main {
    public static void main(String[] args) {
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();
        Node n6 = new Node();
        Node n7 = new Node();
        Node n8 = new Node();
        Node n9 = new Node();

        n1.value = "N1";
        n2.value = "N2";
        n3.value = "N3";
        n4.value = "N4";
        n5.value = "N5";
        n6.value = "N6";
        n7.value = "N7";
        n8.value = "N8";
        n9.value = "N9";

        BinaryTree binaryTree = new BinaryTree();
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n4.left = n8;
        n4.right = n9;

        binaryTree.root = n1;
        System.out.println("Pre Order Traversal");

        binaryTree.preOrderTraversal(n1);
        System.out.print("\n\n");

        System.out.println("In Order Traversal ");

        binaryTree.inOrderTraversal(n1);
        System.out.print("\n\n");

        System.out.println("Post Order Traversal");

        binaryTree.postOrderTraversal(n1);
        System.out.print("\n\n");

        System.out.println("Level Traversal");

        binaryTree.levelTraversal();
    }
}
