package com.malmike.arrays.InsertingItemsIntoAnArray.MergeSortedArrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestMergeSortedArrays {
    private MergeSortedArrays mergeSortedArrays;

    public TestMergeSortedArrays() {
        mergeSortedArrays = new MergeSortedArrays();
    }

    @Test
    public void testMergeSortedArrays() {
        int[] arr1 = new int[] { 1, 2, 3, 4, 0, 0, 0 };
        int[] arr2 = new int[] { 5, 6, 7 };
        int m = 4;
        int n = arr2.length;
        int[] sol = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        mergeSortedArrays.merge(arr1, m, arr2, n);
        assertArrayEquals(arr1, sol);
    }

    @Test
    public void testMergeSortedArrays2() {
        int[] arr1 = new int[] { 1, 1, 3, 4, 0, 0, 0 };
        int[] arr2 = new int[] { 2, 2, 3 };
        int m = 4;
        int n = arr2.length;
        int[] sol = new int[] { 1, 1, 2, 2, 3, 3, 4 };
        mergeSortedArrays.merge(arr1, m, arr2, n);
        assertArrayEquals(arr1, sol);
    }

    @Test
    public void testMergeSortedArrays3() {
        int[] arr1 = new int[] { 6, 8, 9, 10, 0, 0, 0 };
        int[] arr2 = new int[] { 1, 2, 7 };
        int m = 4;
        int n = arr2.length;
        int[] sol = new int[] { 1, 2, 6, 7, 8, 9, 10 };
        mergeSortedArrays.merge(arr1, m, arr2, n);
        assertArrayEquals(arr1, sol);
    }

    @Test
    public void testMergeSortedArraysOptimized() {
        int[] arr1 = new int[] { 1, 2, 3, 4, 0, 0, 0 };
        int[] arr2 = new int[] { 5, 6, 7 };
        int m = 4;
        int n = arr2.length;
        int[] sol = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        mergeSortedArrays.mergeOptimized(arr1, m, arr2, n);
        assertArrayEquals(arr1, sol);
    }

    @Test
    public void testMergeSortedArraysOptimized2() {
        int[] arr1 = new int[] { 1, 1, 3, 4, 0, 0, 0 };
        int[] arr2 = new int[] { 2, 2, 3 };
        int m = 4;
        int n = arr2.length;
        int[] sol = new int[] { 1, 1, 2, 2, 3, 3, 4 };
        mergeSortedArrays.mergeOptimized(arr1, m, arr2, n);
        assertArrayEquals(arr1, sol);
    }

    @Test
    public void testMergeSortedArraysOptimized3() {
        int[] arr1 = new int[] { 6, 8, 9, 10, 0, 0, 0 };
        int[] arr2 = new int[] { 1, 2, 7 };
        int m = 4;
        int n = arr2.length;
        int[] sol = new int[] { 1, 2, 6, 7, 8, 9, 10 };
        mergeSortedArrays.mergeOptimized(arr1, m, arr2, n);
        assertArrayEquals(arr1, sol);
    }
}
