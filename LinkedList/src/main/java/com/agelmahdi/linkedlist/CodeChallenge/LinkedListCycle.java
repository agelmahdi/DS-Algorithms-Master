package com.agelmahdi.linkedlist.CodeChallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }

        return false;
    }

    public boolean hasCycle2(ListNode head) {
        if (head == null) return false;

        Set<ListNode> set = new HashSet<>();
        ListNode curr = head;

        while (true) {
            if (curr.next == null) return false;
            if (!set.contains(curr)) {
                set.add(curr);
                curr = curr.next;
            } else {
                return true;
            }
        }
    }

}
