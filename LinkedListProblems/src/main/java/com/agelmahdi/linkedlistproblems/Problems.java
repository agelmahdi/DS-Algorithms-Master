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
}
