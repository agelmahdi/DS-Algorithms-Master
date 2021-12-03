package com.agelmahdi.linkedlist.CodeChallenge;

public class MergeTwoSortedLists {
    public static void main(String[] args) {

        MergeTwoSortedLists rllist1 = new MergeTwoSortedLists();
        MergeTwoSortedLists rllist2 = new MergeTwoSortedLists();
        rllist1.insert(1);
        rllist1.insert(2);
        rllist1.insert(4);

        rllist2.insert(1);
        rllist2.insert(3);
        rllist2.insert(4);

        ListNode ss = mergeTwoLists(rllist1.head, rllist2.head);
        while (ss != null) {
            System.out.print(ss.val);
            System.out.print(" -> ");
            ss = ss.next;
        }


    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        else if (list2 == null) return list1;
        ListNode head = new ListNode(0);
        ListNode curr = head;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        curr.next = list1 == null ? list2 : list1;

        return head.next;
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
}
