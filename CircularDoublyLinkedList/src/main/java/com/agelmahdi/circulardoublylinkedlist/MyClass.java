package com.agelmahdi.circulardoublylinkedlist;

public class MyClass {
    public static void main(String[] arg){
        CircularDoublySingleList sll = new CircularDoublySingleList();
        // sll.createCDLL(6);
//        System.out.println(sll.head.value);


        for (int i =1; i< 5; i++){
            sll.insertInCDLL(i,i);

        }


        sll.insertInCDLL(55,2);

        sll.deleteItemFromCDLL(5);
        System.out.println("value: " + sll.head.next.next.next.next.value);

        sll.traverseCDLL();
    }
}
