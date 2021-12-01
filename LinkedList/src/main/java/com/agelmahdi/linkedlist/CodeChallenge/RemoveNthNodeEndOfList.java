package com.agelmahdi.linkedlist.CodeChallenge;

import com.agelmahdi.linkedlist.Node;

public class RemoveNthNodeEndOfList {


    /*
     * Given the head of a linked list, remove the nth node from the end of the list and return its head.
     * Constraints:
     * The number of nodes in the list is sz.
     * 1 <= sz <= 30
     * 0 <= Node.val <= 100
     * 1 <= n <= sz
     * */


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode p1 = start, p2 = start;
        p1.next = head;

        //Move fast in front so that the gap between slow and fast becomes n
        for (int i = 1; i <= n + 1; i++) {
            p2 = p2.next;
        }
        //Move fast to the end, maintaining the gap
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        //Skip the desired node
        p1.next = p1.next.next;
        return start.next;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
