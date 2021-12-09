package com.agelmahdi.linkedlist.MediumChallenge;

public class OddEvenLinkedList {

    public static void main(String[] args) {
        OddEvenLinkedList ll = new OddEvenLinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.insert(7);
        ll.insert(8);

        ListNode ss = oddEvenList(ll.head);
        while (ss != null) {
            System.out.print(ss.val);
            System.out.print(" -> ");
            ss = ss.next;
        }
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static ListNode oddEvenList1(ListNode head) {

        ListNode headI = head;
        ListNode tail = head;
        int size = 1;

        while (tail.next != null) {
            tail = tail.next;
            size++;
        }

        for (int i = 0; i < size / 2; i++) {

            ListNode target = headI.next;

            headI.next = headI.next.next;

            headI = headI.next;

            tail.next = target;

            target.next = null;

            tail = target;
        }


        return head;
    }

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
