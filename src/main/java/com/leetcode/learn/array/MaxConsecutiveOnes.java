package main.java.com.leetcode.learn.array;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 */

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int temp = 0;
        int result = temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp++;
                result = Math.max(temp, result);
            } else {
                temp = 0;
            }
        }
        return result;
    }
}
