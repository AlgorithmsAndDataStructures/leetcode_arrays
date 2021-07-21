package com.malmike.InterviewPrep.MinimumNumberOfOperationsToMoveAllBallsToEachBox;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestMinOperations {
    private MinOperations minOperations;

    public TestMinOperations() {
        minOperations = new MinOperations();
    }

    @Test
    public void minOperationsBruteForce() {
        String boxes = "110";
        int[] result = minOperations.minOperationsBruteForce(boxes);
        assertArrayEquals(result, new int[] { 1, 1, 3 });
    }

    @Test
    public void minOperationsBruteForce2() {
        String boxes = "001011";
        int[] result = minOperations.minOperationsBruteForce(boxes);
        assertArrayEquals(result, new int[] { 11, 8, 5, 4, 3, 4 });
    }

    @Test
    public void minOperationsOptimised() {
        String boxes = "110";
        int[] result = minOperations.minOperationsOptimised(boxes);
        assertArrayEquals(result, new int[] { 1, 1, 3 });
    }

    @Test
    public void minOperationsOptimised2() {
        String boxes = "001011";
        int[] result = minOperations.minOperationsOptimised(boxes);
        assertArrayEquals(result, new int[] { 11, 8, 5, 4, 3, 4 });
    }
}
