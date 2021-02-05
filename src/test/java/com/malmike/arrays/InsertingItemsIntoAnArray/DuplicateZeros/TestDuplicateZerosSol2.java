package com.malmike.arrays.InsertingItemsIntoAnArray.DuplicateZeros;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestDuplicateZerosSol2 {
    private DuplicateZerosSol2 duplicateZerosSol2;

    public TestDuplicateZerosSol2() {
        duplicateZerosSol2 = new DuplicateZerosSol2();
    }

    @Test
    public void testDuplicateZeros() {
        int[] arr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
        int[] sol = new int[] { 1, 0, 0, 2, 3, 0, 0, 4 };
        duplicateZerosSol2.duplicateZeros(arr);
        assertArrayEquals(arr, sol);
    }

    @Test
    public void testArrayContainZeros() {
        int[] arr = new int[] { 0, 0, 1, 0, 0, 0, 1 };
        int[] sol = new int[] { 0, 0, 0, 0, 1, 0, 0 };
        duplicateZerosSol2.duplicateZeros(arr);
        assertArrayEquals(arr, sol);
    }

    @Test
    public void testLastZeroNotDuplicated() {
        int[] arr = new int[] { 1, 0, 2, 3, 0, 0, 4, 5 };
        int[] sol = new int[] { 1, 0, 0, 2, 3, 0, 0, 0 };
        duplicateZerosSol2.duplicateZeros(arr);
        assertArrayEquals(arr, sol);
    }
}
