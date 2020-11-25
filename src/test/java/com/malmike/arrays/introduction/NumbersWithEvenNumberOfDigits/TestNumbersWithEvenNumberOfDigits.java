package com.malmike.arrays.introduction.NumbersWithEvenNumberOfDigits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestNumbersWithEvenNumberOfDigits{
    private NumbersWithEvenNumberOfDigits numbersWithEvenNumberOfDigits;

    public TestNumbersWithEvenNumberOfDigits(){
        numbersWithEvenNumberOfDigits = new NumbersWithEvenNumberOfDigits();
    }

    @Test
    public void testFindNumbers() {
        int[] nums = new int[] { 555, 901, 482, 1771 };
        int evenCount = numbersWithEvenNumberOfDigits.findNumbers(nums);
        assertEquals(evenCount, 1);
    }

    @Test
    public void testNegativeValues() {
        int[] nums = new int[] { 932, -12, 252, -12314 };
        int evenCount = numbersWithEvenNumberOfDigits.findNumbers(nums);
        assertEquals(evenCount, 1);
    }

    @Test
    public void testNoEvenNumbers() {
        int[] nums = new int[] { 1, 2, 3, 5 };
        int evenCount = numbersWithEvenNumberOfDigits.findNumbers(nums);
        assertEquals(evenCount, 0);
    }

    @Test
    public void testEmptyArray() {
        int[] nums = new int[4];
        int evenCount = numbersWithEvenNumberOfDigits.findNumbers(nums);
        assertEquals(evenCount, 0);
    }
}
