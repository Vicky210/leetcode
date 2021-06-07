package main.java.com.leetcode.learn.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * We can shift a string by shifting each of its letters to its successive letter.
 *
 * For example, "abc" can be shifted to be "bcd".
 * We can keep shifting the string to form a sequence.
 *
 * For example, we can keep shifting "abc" to form the sequence: "abc" -> "bcd" -> ... -> "xyz".
 * Given an array of strings strings, group all strings[i] that belong to the same shifting sequence. You may return the answer in any order.
 */

public class GroupShiftedStrings {

    public static List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strings) {
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i< s.length();i++) {
                int diff = s.charAt(i-1) - s.charAt(i);
                diff = diff > 0 ? diff: diff+26;
                sb.append(diff);
                sb.append(",");
            }
            String key = sb.toString();
            List<String> v = map.getOrDefault(key, new ArrayList<>());
            v.add(s);
            map.put(key, v);
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<String>> e: map.entrySet()) {
            result.add(e.getValue());
        }
        return result;
    }
}
