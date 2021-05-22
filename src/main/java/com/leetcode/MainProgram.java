package main.java.com.leetcode;

import main.java.com.leetcode.learn.array.MergeSortedArray;
import main.java.com.leetcode.learn.array.SquaresOfSortedArray;

public class MainProgram {

    /**
     * Application entry point
     * Use this class to execute solutions by providing test cases
     */

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,0,0,0,0,0};
        int[] nums2 = new int[]{1,2,3,5,6};
        MergeSortedArray.merge(nums1, nums2, 1, 5);

    }
}
