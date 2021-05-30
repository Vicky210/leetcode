package main.java.com.leetcode.learn.array;

/**
 * Given an array nums of non-negative integers, return an array consisting of all the even elements of nums, followed by all the odd elements of nums.
 * You may return any answer array that satisfies this condition.
 */

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        if(nums == null || nums.length <= 1)
            return nums;
        int left = 0, right = nums.length -1;
        while(left < right) {
            if(nums[left] % 2 != 0 && nums[right] % 2 == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            } else {
                if (nums[left] % 2 == 0)
                    left++;
                if (nums[right] % 2 != 0)
                    right--;
            }
        }
        return nums;
    }
}
