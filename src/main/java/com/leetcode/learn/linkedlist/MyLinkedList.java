package main.java.com.leetcode.learn.linkedlist;

public class MyLinkedList {

    public SinglyLinkedListNode head;
    public int length;

    public MyLinkedList() {
        head = null;
        length = 0;
    }

    public void addAtHead(int val) {
        if(head == null) {
            head = new SinglyLinkedListNode(val);
        } else {
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(val);
            newNode.next = head;
            head  = newNode;
        }
        length++;
    }

    public int get(int index) {
        if(length < index+1)
            return -1;
        SinglyLinkedListNode runner = head;
        while(index != 0) {
            runner = runner.next;
            index--;
        }
        return runner.val;
    }

    public void addAtTail(int val) {
        if(length == 0) {
            addAtHead(val);
            return;
        }
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(val);
        SinglyLinkedListNode runner = head;
        while(runner.next != null)
            runner = runner.next;
        runner.next = newNode;
        length++;
    }

    public void addAtIndex(int index, int val) {
        if(length == index) {
            addAtTail(val);
            return;
        }
        if(index == 0) {
            addAtHead(val);
            return;
        }
        if(length < index)
            return;
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(val);
        SinglyLinkedListNode runner = head;
        SinglyLinkedListNode prev = null;
        while(index != 0) {
            prev = runner;
            runner = runner.next;
            index--;
        }
        newNode.next = runner;
        prev.next = newNode;
        length++;
    }

    public void deleteAtIndex(int index) {
        if(length <= index)
            return;
        if(index == 0) {
            head = head.next;
            length--;
            return;
        }
        SinglyLinkedListNode runner = head;
        SinglyLinkedListNode prev = null;
        while(index != 0) {
            prev = runner;
            runner = runner.next;
            index--;
        }
        prev.next = runner.next;
        length--;
    }
}
