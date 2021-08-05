package com.malmike.InterviewPrep.FindAndReplaceInString;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestFindAndReplaceInString {
    private FindAndReplaceInString findAndReplaceInString;

    public TestFindAndReplaceInString() {
        findAndReplaceInString = new FindAndReplaceInString();
    }

    @Test
    public void testCase1() {
        String s = "abcd";
        int[] indices = { 0, 2 };
        String[] sources = { "a", "cd" };
        String[] targets = { "eee", "ffff" };
        String output = "eeebffff";
        String result = findAndReplaceInString.findReplaceString(s, indices, sources, targets);
        assertTrue(output.equals(result));
    }

    @Test
    public void testCase2() {
        String s = "abcd";
        int[] indices = { 0, 2 };
        String[] sources = { "ab", "ec" };
        String[] targets = { "eee", "ffff" };
        String output = "eeecd";
        String result = findAndReplaceInString.findReplaceString(s, indices, sources, targets);
        assertTrue(output.equals(result));
    }

    @Test
    public void testCase3() {
        // Basing on the question this test is not applicable, but if overlaping
        // elements were allowed then this would test for that
        String s = "abcd";
        int[] indices = { 2, 1, 0 };
        String[] sources = { "cd", "bc", "abc" };
        String[] targets = { "eee", "ffff", "rrrr" };
        String output = "abeee";
        String result = findAndReplaceInString.findReplaceString(s, indices, sources, targets);
        assertTrue(output.equals(result));
    }

    @Test
    public void testCase4() {
        // Basing on the question this test is not applicable, but if overlaping
        // elements were allowed then this would test for that
        String s = "abcd";
        int[] indices = { 1, 0, 3 };
        String[] sources = { "bc", "ab", "d" };
        String[] targets = { "eee", "ffff", "rrrr" };
        String output = "aeeerrrr";
        String result = findAndReplaceInString.findReplaceString(s, indices, sources, targets);
        assertTrue(output.equals(result));
    }

    @Test
    public void testCase5() {
        String s = "abcd";
        int[] indices = { 0, 2 };
        String[] sources = { "a", "cd" };
        String[] targets = { "eee", "ffff" };
        String output = "eeebffff";
        String result = findAndReplaceInString.findReplaceStringPriorityQueue(s, indices, sources, targets);
        assertTrue(output.equals(result));
    }

    @Test
    public void testCase6() {
        String s = "abcd";
        int[] indices = { 0, 2 };
        String[] sources = { "ab", "ec" };
        String[] targets = { "eee", "ffff" };
        String output = "eeecd";
        String result = findAndReplaceInString.findReplaceStringPriorityQueue(s, indices, sources, targets);
        assertTrue(output.equals(result));
    }

    @Test
    public void testCase7() {
        String s = "vmokgggqzp";
        int[] indices = { 3, 5, 1 };
        String[] sources = { "kg", "ggq", "mo" };
        String[] targets = { "s", "so", "bfr" };
        String output = "vbfrssozp";
        String result = findAndReplaceInString.findReplaceStringPriorityQueue(s, indices, sources, targets);
        assertTrue(output.equals(result));
    }

    @Test
    public void testCase8() {
        String s = "vmokgggqzp";
        int[] indices = { 3, 1, 5 };
        String[] sources = { "kg", "mo", "ggq" };
        String[] targets = { "s", "so", "bfr" };
        String output = "vsosbfrzp";
        String result = findAndReplaceInString.findReplaceStringPriorityQueue(s, indices, sources, targets);
        assertTrue(output.equals(result));
    }
}
