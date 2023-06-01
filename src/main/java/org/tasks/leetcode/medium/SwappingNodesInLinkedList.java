package org.tasks.leetcode.medium;

/**
 * You are given the head of a linked list, and an integer k.
 *
 * Return the head of the linked list after swapping the values
 * of the kth node from the beginning and the kth node from the end (the list is 1-indexed).
 *
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [1,4,3,2,5]
 * Example 2:
 *
 * Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
 * Output: [7,9,6,6,8,7,3,0,9,5]
 */


public class SwappingNodesInLinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        ListNode node1 = fast;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        ListNode node2 = slow.next;

        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;

        return dummy.next;
    }



    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
