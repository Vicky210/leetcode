package main.java.com.leetcode.learn.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, return the first non-repeating character in it and return its index. If it does not exist, return -1.
 */

public class UniqueCharInString {

    public static int firstUniqueChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< s.length(); i++) {
            char c= s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(int i = 0; i< s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1)
                return i;
        }
        return -1;
    }
}
