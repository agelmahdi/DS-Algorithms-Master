package com.agelmahdi.doublylinkedlist;

public class MyClass {
    public static void main(String[] arg){
        DoublyLinkedList sll = new DoublyLinkedList();
       // sll.createDLL(6);
//        System.out.println(sll.head.value);


        for (int i =0; i< 5; i++){
            sll.insertInDLL(i,i);

        }

        sll.insertInDLL(55,3);
        System.out.println("value: " + sll.head.value);

        //sll.deleteItemFromDLL(3);
        sll.traverseDLL();
    }
}
