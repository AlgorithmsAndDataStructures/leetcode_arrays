package com.malmike.InterviewPrep.ThreeSum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestThreeSum {
    private ThreeSum threeSum;

    public TestThreeSum() {
        this.threeSum = new ThreeSum();
    }

    @Test
    public void testCase1() {
        int[] input = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
        List<List<Integer>> output = this.threeSum.threeSum(input);
        assertEquals(expected, output);
    }

    @Test
    public void testCase2() {
        int[] input = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
        List<List<Integer>> output = this.threeSum.threeSumSortNums(input);
        assertEquals(expected, output);
    }
}
