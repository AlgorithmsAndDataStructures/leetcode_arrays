package com.malmike.arrays.DeletingItemsFromAnArray;

import com.malmike.arrays.DeletingItemsFromAnArray.RemoveDuplicatesFromSortedArray.RemoveDuplicatesFromSortedArray;

import org.junit.jupiter.api.Test;

public class TestRemoveDuplicatesFromSortedArray {
    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    public TestRemoveDuplicatesFromSortedArray() {
        removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    public void testRemoveDuplicates() {
        int[] inputArray = new int[] { 0, 0, 1, 2, 2, 3, 3, 4 };
        int[] expectedResult = new int[] { 0, 1, 2, 3, 4 };

        int k = removeDuplicatesFromSortedArray.removeDuplicates(inputArray);

        assert k == expectedResult.length;
        for (int i = 0; i < k; i++) {
            assert inputArray[i] == expectedResult[i];
        }
    }

    @Test
    public void testRemoveDuplicates2() {
        int[] inputArray = new int[] { 1, 1, 1, 3, 3, 3, 4, 4, 4, 6, 6, 6, 7, 7, 7 };
        int[] expectedResult = new int[] { 1, 3, 4, 6, 7 };

        int k = removeDuplicatesFromSortedArray.removeDuplicates(inputArray);

        assert k == expectedResult.length;
        for (int i = 0; i < k; i++) {
            assert inputArray[i] == expectedResult[i];
        }
    }
}
