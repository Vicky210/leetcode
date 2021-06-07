package main.java.com.leetcode.learn.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Design a logger system that receives a stream of messages along with their timestamps.
 * Each unique message should only be printed at most every 10 seconds (i.e. a message printed at timestamp t will prevent other identical messages from being printed until timestamp t + 10).
 */

public class Logger {
    /** Initialize your data structure here. */
    Map<String, Integer> map ;
    public Logger() {
        map = new HashMap<>();
    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
     If this method returns false, the message will not be printed.
     The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(map.containsKey(message)) {
            int t = map.get(message);
            if(timestamp >= t) {
                map.put(message, timestamp);
                return true;
            } else
                return false;
        }
        map.put(message, timestamp);
        return true;
    }
}
