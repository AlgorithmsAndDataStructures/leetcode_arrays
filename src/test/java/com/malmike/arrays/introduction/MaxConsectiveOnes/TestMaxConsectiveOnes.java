package com.malmike.arrays.introduction.MaxConsectiveOnes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestMaxConsectiveOnes {
    @Test
    public void testFindMaxConsectiveOnes() {
        MaxConsectiveOnes maxConsectiveOnes = new MaxConsectiveOnes();
        int[] nums = new int[] { 1, 1, 0, 1, 1, 1 };
        int maxValue = maxConsectiveOnes.findMaxConsectiveOnes(nums);
        assertEquals(maxValue, 3);
    }

    @Test
    public void testArrayContainsOnlyZeors() {
        MaxConsectiveOnes maxConsectiveOnes = new MaxConsectiveOnes();
        int[] nums = new int[] { 0, 0, 0, 0, 0 };
        int maxValue = maxConsectiveOnes.findMaxConsectiveOnes(nums);
        assertEquals(maxValue, 0);
    }
}
