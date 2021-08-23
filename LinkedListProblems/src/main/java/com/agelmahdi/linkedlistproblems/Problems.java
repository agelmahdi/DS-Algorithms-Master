package com.agelmahdi.linkedlistproblems;

import java.util.HashSet;
import java.util.Set;

public class Problems {

    public void removeDup(LinkedList ll) {

        Set<Integer> set = new HashSet<>();
        Node current = ll.head;
        Node prev =null;
        for (int i = 0; i < ll.size; i++) {
            int curval = current.value;
            if (set.contains(curval)) {
                prev.next = current.next;
                ll.size--;
            } else {
                set.add(current.value);
                prev =current;

            }
            current = current.next;

        }
        System.out.println(((HashSet) set).clone());
    }

    public Node nthToLastNode(LinkedList linkedList, int n){
        Node p1 = linkedList.head;
        Node p2 = linkedList.head;
        for (int i =0; i<n;i++){
            if (p2 ==null) return null;
            p2 =p2.next;
        }
        while (p2 !=null ){
            p1 =p1.next;
            p2 =p2.next;
        }

        return p2;
    }
    public LinkedList partitionAroundX(LinkedList ll, int x){

        Node current = ll.head;
        //System.out.println(ll.tail.value);
        ll.tail = ll.head;
        //System.out.println(ll.tail.value);
        while (current !=null){
            Node next= current.next;
            if (current.value < x){
                current.next = ll.head;
                ll.head = current;
            }else {
                ll.tail.next=current;
                ll.tail=current;
            }
            current = next;
        }
        ll.tail.next=null;
        return ll;

    }
}
