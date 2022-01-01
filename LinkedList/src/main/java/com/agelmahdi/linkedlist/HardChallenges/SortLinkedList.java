package com.agelmahdi.linkedlist.HardChallenges;

import java.util.PriorityQueue;

class SortLinkedList {

    public static ListNode sortList(ListNode root) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        while (root != null) {
            priorityQueue.add(root.val);
            root = root.next;
        }
        
        ListNode head = null;
        ListNode tail = null;

        while (!priorityQueue.isEmpty()) {

            ListNode node = new ListNode();
            node.val = priorityQueue.poll();

            if (head == null) {
                node.next = null;
                head = node;
                tail = node;
            } else {
                node.next = null;
                tail.next = node;
                tail = node;
            }
        }

        return head;

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
