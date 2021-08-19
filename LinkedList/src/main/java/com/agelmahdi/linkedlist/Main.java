package com.agelmahdi.linkedlist;

public class Main {

    public static void main(String[] arg){
        SingleLinkedList sll = new SingleLinkedList();
//        sll.createSLL(1);
//        System.out.println(sll.head.value);


        for (int i =0; i< 10; i++){
            sll.insertInSLL(i,i);

        }

      //  sll.insertInSLL(23,9);

       // sll.deleteItemSLL(11);
       sll.deleteItemSLL(6);

        sll.traverseSLL();
       // System.out.println(sll.searchSLL(29));


    }
}
