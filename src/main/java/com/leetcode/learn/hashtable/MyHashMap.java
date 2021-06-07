package main.java.com.leetcode.learn.hashtable;

/**
 * Design a HashMap without using any built-in hash table libraries.
 */

public class MyHashMap<I extends Number, I1 extends Number> {
    /** Initialize your data structure here. */
    Bucket[] bucket;
    int size;
    public MyHashMap() {
        this.size = 769;
        this.bucket = new Bucket[769];
    }

    private int hash(int key) {
        return key % this.size;
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int hash = hash(key);
        if(bucket[hash] == null)
            bucket[hash] = new Bucket();
        bucket[hash].add(key, value);
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int hash = hash(key);
        if(bucket[hash] == null)
            return -1;
        return bucket[hash].get(key);
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int hash = hash(key);
        if(bucket[hash] == null)
            return;
        bucket[hash].remove(key);
    }

    static class Bucket {
        ListNode head;
        static class ListNode {
            int key;
            int value;
            ListNode next;
            public ListNode() {
                key = -1;
                next = null;
            }
            public ListNode(int key, int value, ListNode next) {
                this.key = key;
                this.value = value;
                this.next = next;
            }
        }
        public Bucket() {
            head = new ListNode();
        }

        public void add(int key, int value) {
            ListNode runner = head;
            while(runner.next != null) {
                if(runner.key == key) {
                    runner.value = value;
                    break;
                }
                runner = runner.next;
            }
            runner.next = new ListNode(key, value, null);

        }

        public int get(int key) {
            ListNode runner = head;
            while(runner.next != null) {
                if(runner.key == key) {
                    return runner.value;
                }
            }
            return -1;
        }

        public void remove(int key) {
            ListNode runner = head;
            ListNode prev = null;
            while(runner.next != null) {
                if(runner.key == key) {
                    prev.next = runner.next;
                }
                prev = runner;
                runner = runner.next;
            }
        }
    }
}
