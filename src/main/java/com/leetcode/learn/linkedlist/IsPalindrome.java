package main.java.com.leetcode.learn.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the head of a singly linked list, return true if it is a palindrome.
 */

public class IsPalindrome {

    public static boolean isPalindrome(ListNode head) {
        List<Integer> array = new ArrayList<>();
        ListNode runner = head;
        while(runner != null) {
            array.add(runner.val);
            runner = runner.next;
        }
        runner = head;
        int i = array.size()-1;
        while(i >= i/2) {
            if(runner.val != array.get(i))
                return false;
            i--;
            runner = runner.next;
        }
        return true;
    }
}
