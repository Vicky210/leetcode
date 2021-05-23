package main.java.com.leetcode.learn.array;


import java.util.HashSet;
import java.util.Set;

/**
 * Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M)
 */

public class CheckIfDoubleExist {

    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i< arr.length ; i++) {
            if(set.contains(arr[i] * 2) || ((arr[i] % 2 == 0) && (set.contains(arr[i] / 2))))
                return true;
            set.add(arr[i]);
        }
        return false;
    }

}
