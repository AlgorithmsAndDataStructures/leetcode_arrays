package com.malmike.InterviewPrep.UniqueNumberOfOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> number = new HashMap<Integer, Integer>();
        for (int x : arr) {
            if (number.containsKey(x)) {
                number.put(x, number.get(x) + 1);
            } else {
                number.put(x, 1);
            }
        }
        HashSet<Integer> occurences = new HashSet<Integer>();
        int i = 0;
        for (int value : number.values()) {
            occurences.add(value);
            i++;
        }
        if (i == occurences.size())
            return true;
        return false;
    }
}
