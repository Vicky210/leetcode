package main.java.com.leetcode.learn.array;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */

public class EvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int result = 0;
        int temp;
        int digits;
        for (int num : nums) {
            temp = num;
            digits = 0;
            if(temp == 0) {
                digits = 1;
            }
            while(temp != 0) {
                temp = temp/10;
                digits++;
            }
            if(digits % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
