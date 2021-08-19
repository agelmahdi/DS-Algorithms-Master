package com.agelmahdi.circularlinkedlist;

public class Main {
    public static void main(String[] arg){
        CircularSingleLinkedList sll = new CircularSingleLinkedList();
       // sll.createCSll(1);

        for (int i =0; i< 4; i++){
            sll.insertInCSLL(i,i);

        }
//        sll.insertInCSLL(55,2);
//        sll.insertInCSLL(66,12);

       // sll.deleteNodeCSLL(0);

       sll.deleteNodeCSLL(0);

       // sll.deleteNodeCSLL(5);

         System.out.println(sll.head.next.next.next.value);

       // sll.traverseCSLL();
        //  sll.insertInSLL(23,9);

        // sll.deleteItemSLL(11);
//        sll.deleteItemSLL(6);
//
//        sll.traverseSLL();
        // System.out.println(sll.searchSLL(29));


    }
}
