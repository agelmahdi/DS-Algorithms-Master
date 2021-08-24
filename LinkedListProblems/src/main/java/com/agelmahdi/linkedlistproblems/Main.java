package com.agelmahdi.linkedlistproblems;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(7);
        linkedList.insert(1);
        linkedList.insert(6);


        LinkedList linkedList2 = new LinkedList();
        linkedList2.insert(5);
        linkedList2.insert(9);
        linkedList2.insert(2);


        Problems p = new Problems();
       // p.removeDup(linkedList);
       // linkedList.traverse();
        LinkedList node= p.sumLists(linkedList,linkedList2);
        //System.out.println(node);
        node.traverse();



    }
}
