package com.malmike.InterviewPrep.LetterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {
    Map<Character, String[]> digitsMap = new HashMap<Character, String[]>() {
        {
            put('2', new String[] { "a", "b", "c" });
            put('3', new String[] { "d", "e", "f" });
            put('4', new String[] { "g", "h", "i" });
            put('5', new String[] { "j", "k", "l" });
            put('6', new String[] { "m", "n", "o" });
            put('7', new String[] { "p", "q", "r", "s" });
            put('8', new String[] { "t", "u", "v" });
            put('9', new String[] { "w", "x", "y", "z" });
        }
    };

    List<String> result2 = new ArrayList<String>();

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < digits.length(); i++) {
            char num = digits.charAt(i);
            if (i == 0) {
                result = Arrays.asList(digitsMap.get(num));
            } else {
                String[] values = digitsMap.get(num);
                List<String> resp = new ArrayList<String>();
                for (String x : result) {
                    for (String letter : values) {
                        resp.add(x + letter);
                    }
                }
                result = resp;
            }
        }
        return result;
    }

    public List<String> letterCombinationsBackTracking(String digits) {
        if (digits.length() > 0)
            this.letterCombinationsRecursive("", digits, 0);
        return this.result2;
    }

    private void letterCombinationsRecursive(String currentState, String digits, int position) {
        if (position >= digits.length()) {
            this.result2.add(currentState);
            return;
        }
        String[] charValues = digitsMap.get(digits.charAt(position));
        for (String value : charValues) {
            this.letterCombinationsRecursive(currentState + value, digits, position + 1);
        }
    }
}
