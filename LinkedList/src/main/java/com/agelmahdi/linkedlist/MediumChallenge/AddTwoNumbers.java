package com.agelmahdi.linkedlist.MediumChallenge;

class AddTwoNumbers {

    public static void main(String[] args) {
        AddTwoNumbers ll1 = new AddTwoNumbers();
        AddTwoNumbers ll2 = new AddTwoNumbers();
        ll1.insert(9);
        ll1.insert(9);
        ll1.insert(9);
        ll1.insert(9);
        ll1.insert(9);
        ll1.insert(9);
        ll1.insert(9);

        ll2.insert(9);
        ll2.insert(9);
        ll2.insert(9);
        ll2.insert(9);

        ListNode ss = ll1.addTwoNumbers(ll1.head, ll2.head);
        while (ss != null) {
            System.out.print(ss.val);
            System.out.print(" -> ");
            ss = ss.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode head = result;

        int sum = 0, carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (carry > 0) {
                sum += carry;
                carry = 0;
            }

            if (sum > 9) {
                carry = 1;
                sum %= 10;
            }

            result.next = new ListNode(sum);
            result = result.next;
            sum = 0;
        }

        return head.next;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode headI = l1;
        ListNode headII = l2;
        ListNode result = new ListNode(0);
        ListNode resHead = result;

        int size1 = 0;
        int size2 = 0;
        int carry = 0, sum = 0;

        while (l1.next != null) {
            size1++;
            l1 = l1.next;
        }

        while (l2.next != null) {
            size2++;
            l2 = l2.next;
        }

        int size = Math.abs(size1 - size2);

        for (int i = 0; i < size; i++) {
            if (size1 > size2) {
                ListNode node = new ListNode(0, null);
                l2.next = node;
                l2 = node;
            } else {
                ListNode node = new ListNode(0, null);
                l1.next = node;
                l1 = node;
            }
        }

        while (headI != null && headII != null) {
            sum = headI.val + headII.val + carry;
            ListNode node = new ListNode(sum % 10, null);

            resHead.next = node;
            resHead = node;
            carry = sum / 10;

            headI = headI.next;
            headII = headII.next;

        }

        if (carry > 0)
            resHead.next = new ListNode(carry, null);

        return result.next;

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
