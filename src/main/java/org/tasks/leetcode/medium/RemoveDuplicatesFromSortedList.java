package org.tasks.leetcode.medium;

/**
 * Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list. Return the linked list sorted as well.
 * Input: head = [1,2,3,3,4,4,5]
 * Output: [1,2,5]
 *
 * Input: head = [1,1,1,2,3]
 * Output: [2,3]
 */

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode curr = fake;
        while (curr.next != null && curr.next.next != null) {
            if (curr.next.val == curr.next.next.val) {
                int duplicate = curr.next.val;
                while (curr.next != null && curr.next.val == duplicate) {
                    curr.next = curr.next.next;
                }
            } else {
                curr = curr.next;
            }
        }
        return fake.next;
    }

    public class ListNode {
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
