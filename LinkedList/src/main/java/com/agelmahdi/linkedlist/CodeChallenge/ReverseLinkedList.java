package com.agelmahdi.linkedlist.CodeChallenge;


import java.util.Arrays;
import java.util.Stack;

public class ReverseLinkedList {
    ListNode head = null;
    ListNode tail = null;
    int size;

    public static void main(String[] args) {

        ReverseLinkedList rll = new ReverseLinkedList();
        rll.insert(1);
        rll.insert(2);
        rll.insert(3);
        rll.insert(4);
        rll.insert(5);


        ListNode ss = rll.reverseListS(rll.head);
        while (ss != null) {
            System.out.print(ss.val);
            System.out.print(" -> ");
            ss = ss.next;
        }


    }

    public ListNode reverseListS(ListNode head) {
        if (head == null) return null;
        Stack<ListNode> stack = new Stack<>();

        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        ListNode tail = new ListNode(stack.pop().val, null);

        head = tail;

        while (!stack.isEmpty()) {

            ListNode node = new ListNode();

            node.val = stack.pop().val;

            node.next = null;

            tail.next = node;

            tail = node;

        }

        return head;
    }

    public void linkedList(int value) {
        ListNode node = new ListNode();
        node.val = value;
        node.next = null;

        head = node;
        tail = node;
        size = 1;

    }

    public void insert(int value) {
        if (head == null) {
            linkedList(value);
            return;
        }
        ListNode node = new ListNode();
        node.val = value;

        node.next = null;

        tail.next = node;
        tail = node;
        size++;
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
