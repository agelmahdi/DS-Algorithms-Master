package com.agelmahdi.linkedlistproblems;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(6);
        linkedList.insert(7);
        linkedList.insert(8);

        Problems p = new Problems();
       // p.removeDup(linkedList);
       // linkedList.traverse();
        LinkedList node= p.partitionAroundX(linkedList,4);
        //System.out.println(node);
        linkedList.traverse(node);



    }
}
