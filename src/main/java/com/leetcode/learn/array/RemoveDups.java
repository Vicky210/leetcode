package main.java.com.leetcode.learn.array;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */

public class RemoveDups {
    public int removeDuplicates(int[] nums) {
        int m = -1;
        for(int i = 0; i < nums.length; i++) {
            if(m == -1 || nums[m] < nums[i]) {
                m++;
                nums[m] = nums[i];
            }
        }
        return m+1;
    }
}
