package main.java.com.leetcode.learn.array;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int m=-1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                // Do nothing - i gets incremented in for loop
            } else {
                m++;
                nums[m] = nums[i];
            }
        }
        return m+1;
    }
}
