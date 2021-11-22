package com.agelmahdi.avltree;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();

        avlTree.insert(1);
        avlTree.insert(2);
        avlTree.insert(3);
        avlTree.insert(4);
        avlTree.insert(5);
        avlTree.insert(6);
        avlTree.insert(7);
        avlTree.insert(8);
        avlTree.insert(9);

        AVLTree.print2D(avlTree.root);
        avlTree.delete(avlTree.root,4);
        System.out.print("------------|-------------");
        AVLTree.print2D(avlTree.root);


    }
}
