package com.malmike.InterviewPrep.TestRangeSumQuery2DImmutable;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.malmike.InterviewPrep.RangeSumQuery2DImmutable.RangeSumQuery2DImmutable;

import org.junit.jupiter.api.Test;

public class TestRangeSumQuery2DImmutable {
    private RangeSumQuery2DImmutable rangeSumQuery2DImmutable;

    public TestRangeSumQuery2DImmutable() {
        int[][] matrix = { { 3, 0, 1, 4, 2 }, { 5, 6, 3, 2, 1 }, { 1, 2, 0, 1, 5 }, { 4, 1, 0, 1, 7 },
                { 1, 0, 3, 0, 5 } };
        rangeSumQuery2DImmutable = new RangeSumQuery2DImmutable(matrix);
    }

    @Test
    public void testCase1() {
        int expected = 3;
        int actual = this.rangeSumQuery2DImmutable.sumRegion(0, 0, 0, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        int expected = 8;
        int actual = this.rangeSumQuery2DImmutable.sumRegion(2, 1, 4, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase3() {
        int expected = 11;
        int actual = this.rangeSumQuery2DImmutable.sumRegion(1, 1, 2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase4() {
        int expected = 12;
        int actual = this.rangeSumQuery2DImmutable.sumRegion(1, 2, 2, 4);
        assertEquals(expected, actual);
    }
}
