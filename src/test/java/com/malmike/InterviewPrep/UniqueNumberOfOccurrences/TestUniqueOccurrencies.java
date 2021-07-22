package com.malmike.InterviewPrep.UniqueNumberOfOccurrences;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestUniqueOccurrencies {
    private UniqueOccurrences uniqueOccurrences;

    public TestUniqueOccurrencies() {
        uniqueOccurrences = new UniqueOccurrences();
    }

    @Test
    public void testUniqueOccurencies1() {
        int[] arr = new int[] { 1, 2, 2, 1, 1, 3 };
        boolean result = uniqueOccurrences.uniqueOccurrences(arr);
        assertTrue(result);
    }

    @Test
    public void testUniqueOccurencies2() {
        int[] arr = new int[] { 1, 2 };
        boolean result = uniqueOccurrences.uniqueOccurrences(arr);
        assertFalse(result);
    }

    @Test
    public void testUniqueOccurencies3() {
        int[] arr = new int[] { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
        boolean result = uniqueOccurrences.uniqueOccurrences(arr);
        assertTrue(result);
    }

    @Test
    public void testUniqueOccurencies4() {
        int[] arr = new int[] { 1 };
        boolean result = uniqueOccurrences.uniqueOccurrences(arr);
        assertTrue(result);
    }
}
