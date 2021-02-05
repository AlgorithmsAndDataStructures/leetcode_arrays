package com.malmike.arrays.InsertingItemsIntoAnArray.DuplicateZeros;

public class DuplicateZerosSol {
    public void duplicateZeros(int[] arr) {
        int i = 0;
        while(i < arr.length-1) {
            if (arr[i] == 0) {
                int position = i + 1;
                shiftArrayValues(arr, position);
                arr[i + 1] = 0;
                i++;
            }
            i++;
        }
    }

    private void shiftArrayValues(int[] arr, int position) {
        int currentValue = arr[position];
        while (position < arr.length - 1) {
            int nextValue = arr[position + 1];
            arr[position + 1] = currentValue;
            currentValue = nextValue;
            position++;
        }
    }
}
