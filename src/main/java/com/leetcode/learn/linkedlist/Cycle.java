package main.java.com.leetcode.learn.linkedlist;

public class Cycle {

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
                return true;
        }
        return false;
    }

    public static ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                slow = head;
                while(slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
