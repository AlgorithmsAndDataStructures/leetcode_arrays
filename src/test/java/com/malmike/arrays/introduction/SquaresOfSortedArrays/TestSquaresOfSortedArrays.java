package com.malmike.arrays.introduction.SquaresOfSortedArrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestSquaresOfSortedArrays {
    private SquaresOfSortedArrays squaresOfSortedArrays;

    public TestSquaresOfSortedArrays() {
        squaresOfSortedArrays = new SquaresOfSortedArrays();
    }

    @Test
    public void testMergeArrays() {
        int[] array1 = new int[] { 1, 3, 5 };
        int[] array2 = new int[] { 2, 4, 6 };
        int[] expectedResult = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] result = squaresOfSortedArrays.mergeArrays(array1, array2);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testSortedSquares() {
        int[] array = new int[] { 0, 1, 3, 4, 5 };
        int[] expectedResult = new int[] { 0, 1, 9, 16, 25 };
        int[] result = squaresOfSortedArrays.sortedSquares(array);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMergeSort() {
        int[] array = new int[] { -3, -2, 0, 2, 4, 6 };
        int[] expectedResult = new int[] { 0, 4, 4, 9, 16, 36 };
        int[] result = squaresOfSortedArrays.sortedSquares(array);
        assertArrayEquals(expectedResult, result);
    }

}
