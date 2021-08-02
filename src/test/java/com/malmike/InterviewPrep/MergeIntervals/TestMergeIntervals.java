package com.malmike.InterviewPrep.MergeIntervals;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestMergeIntervals {
    private MergeIntervals mergeIntervals;

    public TestMergeIntervals() {
        mergeIntervals = new MergeIntervals();
    }

    @Test
    public void testMergeIntervals() {
        int[][] intervals = { { 1, 4 }, { 4, 5 } };
        int[][] expected = { { 1, 5 } };
        int[][] result = mergeIntervals.merge(intervals);
        assertArrayEquals(result, expected);
    }

    @Test
    public void testMergeIntervals2() {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] expected = { { 1, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] result = mergeIntervals.merge(intervals);
        assertArrayEquals(result, expected);
    }

    @Test
    public void testMergeIntervals3() {
        int[][] intervals = { { 8, 10 }, { 2, 6 }, { 1, 3 }, { 15, 18 } };
        int[][] expected = { { 1, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] result = mergeIntervals.merge(intervals);
        assertArrayEquals(result, expected);
    }

    @Test
    public void testMergeIntervals4() {
        int[][] intervals = { { 1, 4 }, { 2, 3 } };
        int[][] expected = { { 1, 4 } };
        int[][] result = mergeIntervals.merge(intervals);
        assertArrayEquals(result, expected);
    }

    @Test
    public void testMergeIntervals5() {
        int[][] intervals = { { 2, 3 }, { 4, 5 }, { 6, 7 }, { 8, 9 }, { 1, 10 } };
        int[][] expected = { { 1, 10 } };
        int[][] result = mergeIntervals.merge(intervals);
        assertArrayEquals(result, expected);
    }

    @Test
    public void testMergeIntervals6() {
        int[][] intervals = { { 4, 5 }, { 2, 4 }, { 4, 6 }, { 3, 4 }, { 0, 0 }, { 1, 1 }, { 3, 5 }, { 2, 2 } };
        int[][] expected = { { 0, 0 }, { 1, 1 }, { 2, 6 } };
        int[][] result = mergeIntervals.merge(intervals);
        assertArrayEquals(result, expected);
    }

    @Test
    public void testMergeIntervals7() {
        int[][] intervals = { { 1, 3 }, { 0, 2 }, { 2, 3 }, { 4, 6 }, { 4, 5 }, { 5, 5 }, { 0, 2 }, { 3, 3 } };
        int[][] expected = { { 0, 3 }, { 4, 6 } };
        int[][] result = mergeIntervals.merge(intervals);
        assertArrayEquals(result, expected);
    }

    @Test
    public void testMergeIntervals_2() {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] expected = { { 1, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] result = mergeIntervals.merge2(intervals);
        assertArrayEquals(result, expected);
    }

    @Test
    public void testMergeIntervals2_2() {
        int[][] intervals = { { 8, 10 }, { 2, 6 }, { 1, 3 }, { 15, 18 } };
        int[][] expected = { { 1, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] result = mergeIntervals.merge2(intervals);
        assertArrayEquals(result, expected);
    }

    @Test
    public void testMergeIntervals3_2() {
        int[][] intervals = { { 1, 4 }, { 2, 3 } };
        int[][] expected = { { 1, 4 } };
        int[][] result = mergeIntervals.merge2(intervals);
        assertArrayEquals(result, expected);
    }

    @Test
    public void testMergeIntervals4_2() {
        int[][] intervals = { { 2, 3 }, { 4, 5 }, { 6, 7 }, { 8, 9 }, { 1, 10 } };
        int[][] expected = { { 1, 10 } };
        int[][] result = mergeIntervals.merge2(intervals);
        assertArrayEquals(result, expected);
    }

    @Test
    public void testMergeIntervals5_2() {
        int[][] intervals = { { 4, 5 }, { 2, 4 }, { 4, 6 }, { 3, 4 }, { 0, 0 }, { 1, 1 }, { 3, 5 }, { 2, 2 } };
        int[][] expected = { { 0, 0 }, { 1, 1 }, { 2, 6 } };
        int[][] result = mergeIntervals.merge2(intervals);
        assertArrayEquals(result, expected);
    }

    @Test
    public void testMergeIntervals6_2() {
        int[][] intervals = { { 1, 3 }, { 0, 2 }, { 2, 3 }, { 4, 6 }, { 4, 5 }, { 5, 5 }, { 0, 2 }, { 3, 3 } };
        int[][] expected = { { 0, 3 }, { 4, 6 } };
        int[][] result = mergeIntervals.merge2(intervals);
        assertArrayEquals(result, expected);
    }

    @Test
    public void testMergeIntervals7_2() {
        int[][] intervals = { { 1, 4 }, { 4, 5 } };
        int[][] expected = { { 1, 5 } };
        int[][] result = mergeIntervals.merge2(intervals);
        assertArrayEquals(result, expected);
    }

}
