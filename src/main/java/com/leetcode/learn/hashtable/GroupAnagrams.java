package main.java.com.leetcode.learn.hashtable;

import jdk.internal.util.xml.impl.Pair;

import java.util.*;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            int[] count = new int[26];
            for(int c: count)
                c = 0;
            for(int i =0; i< str.length(); i++) {
                char ch = str.charAt(i);
                int index = ch - 'a';
                count[index] += 1;
            }
            StringBuilder sb = new StringBuilder();
            for(int c: count) {
                sb.append(c);
                sb.append('#');
            }
            String s = sb.toString();
            List<String> k = map.getOrDefault(s, new ArrayList<String>());
            k.add(str);
            map.put(s, k);
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<String>> e: map.entrySet()) {
            result.add(e.getValue());
        }
        return result;
    }
}
