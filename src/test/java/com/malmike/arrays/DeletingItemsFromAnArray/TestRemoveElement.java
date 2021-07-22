package com.malmike.arrays.DeletingItemsFromAnArray;

import com.malmike.arrays.DeletingItemsFromAnArray.RemoveElement.RemoveElement;

import org.junit.jupiter.api.Test;

public class TestRemoveElement {
    private RemoveElement removeElement;

    public TestRemoveElement() {
        removeElement = new RemoveElement();
    }

    @Test
    public void testDuplicateZeros() {
        int[] inputArray = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int[] expectedResult = new int[] { 0, 1, 3, 0, 4 };

        int k = removeElement.removeElement(inputArray, val);

        assert k == expectedResult.length;
        for (int i = 0; i < k; i++) {
            assert inputArray[i] == expectedResult[i];
        }
    }

    @Test
    public void testDuplicateZeros2() {
        int[] inputArray = new int[] { 3, 2, 2, 3 };
        int val = 2;
        int[] expectedResult = new int[] { 3, 3 };

        int k = removeElement.removeElement(inputArray, val);

        assert k == expectedResult.length;
        for (int i = 0; i < k; i++) {
            assert inputArray[i] == expectedResult[i];
        }
    }
}
