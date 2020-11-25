package com.malmike.arrays.introduction.NumbersWithEvenNumberOfDigits;

public class NumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int evenCounter = 0;
        for (int num : nums) {
            if (numberLength(num) % 2 == 0) {
                evenCounter++;
            }
        }
        return evenCounter;
    }

    private int numberLength(int num) {
        return (int)Math.floor(Math.log10(Math.abs(num))) + 1 ;
    }
}
