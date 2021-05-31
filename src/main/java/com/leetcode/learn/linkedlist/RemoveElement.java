package main.java.com.leetcode.learn.linkedlist;

/**
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 */

public class RemoveElement {
    public static ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val)
            head = head.next;
        if(head == null)
            return head;
        ListNode prev = new ListNode(0);;
        prev.next = head;
        ListNode current = head;
        while(current != null) {
            if(current.val == val){
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
        return head;
    }
}
