package main.java.com.leetcode.learn.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.
 * You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.
 */

public class MinIndexSumLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        for(int i = 0; i< list1.length; i++) {
            map.put(list1[i], i);
        }
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i< list2.length; i++) {
            if(map.containsKey(list2[i])) {
                int indexSum = i + map.get(list2[i]);
                if(indexSum < minSum) {
                    minSum = indexSum;
                    result.clear();
                    result.add(list2[i]);
                } else if(minSum == indexSum) {
                    result.add(list2[i]);
                }
            }
        }
        return result.toArray(new String[0]);
    }
}
