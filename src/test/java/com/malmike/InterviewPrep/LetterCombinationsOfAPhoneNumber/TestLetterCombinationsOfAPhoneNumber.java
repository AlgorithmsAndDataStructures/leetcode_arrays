package com.malmike.InterviewPrep.LetterCombinationsOfAPhoneNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TestLetterCombinationsOfAPhoneNumber {
    private LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber;

    public TestLetterCombinationsOfAPhoneNumber() {
        letterCombinationsOfAPhoneNumber = new LetterCombinationsOfAPhoneNumber();
    }

    @Test
    public void testCase1() {
        String input = "23";
        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        List<String> output = letterCombinationsOfAPhoneNumber.letterCombinations(input);
        assertEquals(expected, output);
    }

    @Test
    public void testCase2() {
        String input = "";
        List<String> expected = Arrays.asList();
        List<String> output = letterCombinationsOfAPhoneNumber.letterCombinations(input);
        assertEquals(expected, output);
    }

    @Test
    public void testCase3() {
        String input = "2";
        List<String> expected = Arrays.asList("a", "b", "c");
        List<String> output = letterCombinationsOfAPhoneNumber.letterCombinations(input);
        assertEquals(expected, output);
    }

    @Test
    public void testCase4() {
        String input = "23";
        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        List<String> output = letterCombinationsOfAPhoneNumber.letterCombinationsBackTracking(input);
        assertEquals(expected, output);
    }

    @Test
    public void testCase5() {
        String input = "";
        List<String> expected = new ArrayList<String>();
        List<String> output = letterCombinationsOfAPhoneNumber.letterCombinationsBackTracking(input);
        assertEquals(expected, output);
    }

    @Test
    public void testCase6() {
        String input = "2";
        List<String> expected = Arrays.asList("a", "b", "c");
        List<String> output = letterCombinationsOfAPhoneNumber.letterCombinationsBackTracking(input);
        assertEquals(expected, output);
    }
}
