package main.java.com.leetcode.learn.array;

public class MergeSortedArray {

    public static void merge(int[] nums1, int[] nums2, int m, int n) {
        int p1 = m-1, p2 = n-2, p = nums1.length-1;
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
