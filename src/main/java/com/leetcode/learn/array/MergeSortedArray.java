package main.java.com.leetcode.learn.array;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has a size equal to
 * m + n such that it has enough space to hold additional elements from nums2.
 */

public class MergeSortedArray {

    public static void merge(int[] nums1, int[] nums2, int m, int n) {
        int p1 = m-1, p2 = n-1, p = nums1.length-1;
        while(p >= 0) {
            int x = p1 >= 0 ? nums1[p1] : Integer.MIN_VALUE;
            int y = p2 >= 0 ? nums2[p2] : Integer.MIN_VALUE;
            if( x > y) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
    }
}
