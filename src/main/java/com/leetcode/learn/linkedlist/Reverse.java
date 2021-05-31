package main.java.com.leetcode.learn.linkedlist;

public class Reverse {

    public static ListNode reverseLst(ListNode head) {
        if(head == null)
            return head;
        ListNode prev = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
