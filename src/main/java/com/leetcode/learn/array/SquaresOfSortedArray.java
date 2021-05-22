package main.java.com.leetcode.learn.array;

/**
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 */

public class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int length = nums.length;
        if(length == 0)
            return result;
        if(nums[0] >=0) {
            // Corner case - all positive array
            for(int i=0; i< length; i++) {
                result[i] = nums[i] * nums[i];
            }
            return result;
        } else if(nums[length-1] <= 0) {
            // Corner case - all negative array
            int j = 0;
            for(int i= length-1; i >= 0; i--) {
                result[j] = nums[i] * nums[i];
                j++;
            }
            return result;
        } else {
            // regular - use two pointer approach
            int m = 0, n = 0;
            for(int i = 0; i< length; i++) {
                if(nums[i] >= 0) {
                    m = i-1;
                    n = i;
                    break;
                }
            }
            int i =0;
            while(m >= 0 && n < length) {
                if (Math.abs(nums[m]) > Math.abs(nums[n])) {
                    result[i] = nums[n] * nums[n];
                    n++;
                    i++;
                } else {
                    result[i] = nums[m] * nums[m];
                    m--;
                    i++;
                }
            }
            while(m >= 0) {
                result[i] = nums[m] * nums[m];
                m--;
                i++;
            }
            while(n < length) {
                result[i] = nums[n] * nums[n];
                n++;
                i++;
            }

        }
        return result;
    }
}
