package com.malmike.arrays.introduction.MaxConsectiveOnes;

import junit.framework.TestCase;

public class MaxConsectiveOnesTest extends TestCase {
    private MaxConsectiveOnes maxConsectiveOnes;

    public MaxConsectiveOnesTest() {
        maxConsectiveOnes = new MaxConsectiveOnes();
    }

    public void testFindMaxConsectiveOnes() {
        int[] nums = new int[] { 1, 1, 0, 1, 1, 1 };
        int maxValue = maxConsectiveOnes.findMaxConsectiveOnes(nums);
        assertEquals(maxValue, 3);
    }

    public void testArrayContainsOnlyZeors() {
        int[] nums = new int[] { 0, 0, 0, 0, 0 };
        int maxValue = maxConsectiveOnes.findMaxConsectiveOnes(nums);
        assertEquals(maxValue, 0);
    }
}
