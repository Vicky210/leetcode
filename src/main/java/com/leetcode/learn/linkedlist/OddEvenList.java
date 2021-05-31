package main.java.com.leetcode.learn.linkedlist;

/**
 * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
 * Note that the relative order inside both the even and odd groups should remain as it was in the input.
 */

public class OddEvenList {

    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode oddHead = new ListNode(0);
        ListNode evenHead = new ListNode(0);
        ListNode runner ;
        ListNode oddRunner = oddHead;
        ListNode evenRunner = evenHead;
        runner = head;
        int i = 1;
        while(runner != null) {
            if(i % 2 != 0) {
                oddRunner.next = runner;
                oddRunner = oddRunner.next;
            } else {
                evenRunner.next = runner;
                evenRunner = evenRunner.next;
            }
            i++;
            runner = runner.next;
        }
        evenRunner.next = null;
        oddRunner.next = evenHead.next;
        return oddHead.next;
    }
}
