package com.malmike.arrays.introduction.SquaresOfSortedArrays;

public class SquaresOfSortedArrays {
    public int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int i1 = 0, i2 = 0, i3 = 0;
        while (i1 < array1.length && i2 < array2.length) {
            if (array1[i1] <= array2[i2]) {
                mergedArray[i3] = array1[i1];
                i1++;
            } else {
                mergedArray[i3] = array2[i2];
                i2++;
            }
            i3++;
        }
        if (i1 < array1.length) {
            while (i1 < array1.length) {
                mergedArray[i3] = array1[i1];
                i1++;
                i3++;
            }
        }
        if (i2 < array2.length) {
            while (i2 < array2.length) {
                mergedArray[i3] = array2[i2];
                i2++;
                i3++;
            }
        }
        return mergedArray;
    }

    public int[] mergeSort(int[] array, int start, int end) {
        if (start == end) {
            if (start == array.length)
                return new int[0];
            return new int[] { array[start] * array[start] };
        }
        int mid = (start + end) / 2;
        int[] leftValues = this.mergeSort(array, start, mid);
        int[] rightValues = this.mergeSort(array, mid + 1, end);
        return this.mergeArrays(leftValues, rightValues);
    }

    public int[] sortedSquares(int[] A) {
        //Check whether the first value is a negative
        if (A[0] < 0) {
            return this.mergeSort(A, 0, A.length);
        } else {
            for (int i = 0; i < A.length; i++) {
                A[i] = A[i] * A[i];
            }
            return A;
        }
    }
}
