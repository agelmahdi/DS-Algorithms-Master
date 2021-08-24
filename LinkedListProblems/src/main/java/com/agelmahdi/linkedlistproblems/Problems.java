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

    public LinkedList sumLists(LinkedList llA,LinkedList llB){

        Node n1 = llA.head;
        Node n2 = llB.head;
        int carry = 0;
        LinkedList resultLL = new LinkedList();
        while (n1 != null || n2 != null) {
            int result = carry;
            if (n1 != null) {
                result += n1.value;
                n1 = n1.next;
            }
            if (n2 != null) {
                result += n2.value;
                n2 = n2.next;
            }
            resultLL.insert(result % 10);
            carry = result / 10;
        }
        return resultLL;

    }

    // intersection

    private Node getKthNode(Node head, int k){
        Node current = head;
        while (k>0 && current !=null){
            current = current.next;
            k--;
        }
        return current;
    }

   public Node findIntersection(LinkedList list1,LinkedList list2){
        if (list1.head == null || list2.head ==null) return null;
        if (list1.tail != list2.tail) return null;

        Node shorter =new Node();
       Node longer =new Node();

        if (list1.size > list2.size){
            longer = list1.head;
            shorter =list2.head;
        }
        else {
            longer =list2.head;
            shorter = list1.head;
        }

        longer = getKthNode(longer, Math.abs(list1.size-list2.size));

        while (shorter != longer){
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;

    }
    void addSameNode(LinkedList list1,LinkedList list2, int value){
        Node node = new Node();
        node.value = value;

        list1.tail.next= node;
        list1.tail=node;
        list2.tail.next = node;
        list2.tail = node;

    }

}
