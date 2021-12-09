package com.agelmahdi.linkedlist.MediumChallenge;

public class Linkedlist {

    ListNode head = null;
    ListNode tail = null;
    int size;

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
