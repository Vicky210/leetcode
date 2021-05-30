package main.java.com.leetcode.learn.array;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 */

public class MoveZeros {

    public static void moveZeros(int[] nums) {
        if(nums == null || nums.length == 0)
            return ;
        int wp = 0;
        for(int i = 0 ; i< nums.length; i++) {
            if(nums[i] != 0) {
                nums[wp] = nums[i];
                wp++;
            }
        }
        while(wp < nums.length) {
            nums[wp] = 0;
            wp++;
        }
    }
}
