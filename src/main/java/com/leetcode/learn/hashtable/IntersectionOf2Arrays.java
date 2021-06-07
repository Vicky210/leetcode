package main.java.com.leetcode.learn.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 */

public class IntersectionOf2Arrays {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int num: nums1) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num : nums2) {
            if(map.containsKey(num)) {
                result.add(num);
                if(map.get(num) == 1)
                    map.remove(num);
                else
                    map.put(num, map.get(num)-1);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

}
