package com.agelmahdi.binarytree;

import com.agelmahdi.binarytree.TreeLinkedList.BinaryTree;
import com.agelmahdi.binarytree.TreeLinkedList.Node;

public class Main {
    public static void main(String[] args) {



        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.insert("N7");
        binaryTree.insert("N8");
        binaryTree.insert("N9");


//        System.out.println("Pre Order Traversal");

//        binaryTree.preOrderTraversal(n1);
//        System.out.print("\n\n");
//
//        System.out.println("In Order Traversal ");
//
//        binaryTree.inOrderTraversal(n1);
//        System.out.print("\n\n");
//
//        System.out.println("Post Order Traversal");
//
//        binaryTree.postOrderTraversal(n1);
//        System.out.print("\n\n");

        System.out.println("Level Traversal");

        binaryTree.levelTraversal();
        System.out.print("\n\n");

        System.out.println("Search in BT");
        binaryTree.deleteNode("N2");
        binaryTree.deleteNode("N3");
        binaryTree.deleteNode("N5");
        System.out.println();
        binaryTree.levelTraversal();
        System.out.print("\n\n");

    }
}
