package main.java.com.leetcode.learn.hashtable;

import java.util.ArrayList;
import java.util.List;

/**
 * Design a HashSet without using any built-in hash table libraries.
 * 0 <= key <= 106
 * At most 104 calls will be made to add, remove, and contains.
 */

public class MyHashSet {

    Bucket[] bucket;
    int bucketSize;

    /** Initialize your data structure here. */
    public MyHashSet() {
        this.bucketSize = 769;
        bucket = new Bucket[769];
    }

    private int hash(int key) {
        return key % this.bucketSize;
    }

    public void add(int key) {
        int hash = hash(key);
        if(this.contains(key))
            return;
        if(bucket[hash] == null)
            bucket[hash] = new Bucket();

        this.bucket[hash(key)].add(key);
    }

    public void remove(int key) {
        int hash = hash(key);
        if(bucket[hash] == null)
            return;
        this.bucket[hash(key)].remove(key);
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int hash = hash(key);
        if(bucket[hash] == null)
            return false;
        return this.bucket[hash(key)].contains(key);
    }

    static class Bucket {

        List<Integer> arrayList;

        public Bucket() {
            this.arrayList = new ArrayList();
        }

        public void add(int key) {
            arrayList.add(key);
        }

        public void remove(int key) {
            int lastIndex = arrayList.size()-1;
            boolean found = false;
            for(int i = 0 ; i <= lastIndex; i++) {
                if(arrayList.get(i) == key) {
                    arrayList.set(i, arrayList.get(lastIndex));
                    found = true;;
                }
            }
            if(found)
                arrayList.remove(lastIndex);
        }

        public boolean contains(int key) {
            for(int a: arrayList) {
                if(a == key)
                    return true;
            }
            return false;
        }
    }
}
