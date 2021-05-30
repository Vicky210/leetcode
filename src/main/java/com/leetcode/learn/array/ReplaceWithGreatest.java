package main.java.com.leetcode.learn.array;

/**
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
 */

public class ReplaceWithGreatest {

    public static int[] replaceElements(int[] arr) {
        int length = arr.length;
        int[] result = new int[length];
        int maxIndex = -1;
        for(int i = 0; i< length-1 ;i++) {
            if(maxIndex == -1 || maxIndex <= i) {
                findMaxIndex(arr, i+1, length);
            }
            result[i] = arr[maxIndex];
        }
        result[length-1] = -1;
        return result;
    }

    private static int findMaxIndex(int[] arr, int start, int end) {
        int max = Integer.MIN_VALUE;
        int maxIndex = start;
        for (int i = start ; i< end; i++) {
            if(max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
