package main.java.com.leetcode;

import main.java.com.leetcode.learn.linkedlist.IsPalindrome;
import main.java.com.leetcode.learn.linkedlist.MyLinkedList;
import main.java.com.leetcode.learn.linkedlist.RemoveElement;

public class MainProgram {

    /**
     * Application entry point
     * Use this class to execute solutions by providing test cases
     */

    public static void main(String[] args) {
        MyLinkedList h = new MyLinkedList();
        h.addAtTail(1);
        h.addAtTail(2);
        h.addAtTail(2);
        h.addAtTail(1);
        IsPalindrome.isPalindrome(h.head);
    }
}
