package com.malmike.InterviewPrep.FindAndReplaceInString;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestPriorityQueueExample {
    private PriorityQueueExample priorityQueueExample;

    public TestPriorityQueueExample() {
        priorityQueueExample = new PriorityQueueExample();
    }

    @Test
    public void testCase1() {
        int[] input = { 3, 1, 5, 0, 4, 7, 2, 9, 8, 6 };
        int[] output = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] result = priorityQueueExample.sortWithPriorityQueue(input);
        assertArrayEquals(output, result);
    }
}
