package com.agelmahdi.simpletree;

import java.util.ArrayList;
import java.io.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Node {
    String data;
    ArrayList<Node> children;

    public Node(String data){
        this.data=data;
        children = new ArrayList<>();
    }

    public void addChild(Node node){
        this.children.add(node);
    }

    public String print(int level){
        String tree;
        tree = " "+"level: "+level+" "+ data + "\n";

        for (Node node :this.children) {

            tree +=node.print(level+1);
        }

        return tree;
    }

}
