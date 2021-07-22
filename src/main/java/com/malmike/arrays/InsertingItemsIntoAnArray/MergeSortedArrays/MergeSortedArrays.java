package com.malmike.arrays.InsertingItemsIntoAnArray.MergeSortedArrays;

public class MergeSortedArrays {
    public void shiftArrayValues(int[] arr, int length, int position) {
        int currentValue = arr[position];
        while (position < length) {
            int nextValue = arr[position + 1];
            arr[position + 1] = currentValue;
            currentValue = nextValue;
            position++;
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        while (i < m && m < nums1.length) {
            if (nums1[i] <= nums2[j]) {
                i++;
            } else {
                int position = i;
                shiftArrayValues(nums1, m, position);
                nums1[i] = nums2[j];
                j++;
                i++;
                m++;
            }
        }
        if (j < n) {
            while (m < nums1.length) {
                nums1[m] = nums2[j];
                j++;
                m++;
            }
        }
    }

    public void mergeOptimized(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int position = nums1.length - 1;
        while (n >= 0) {
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[position] = nums1[m];
                position--;
                m--;
            } else {
                nums1[position] = nums2[n];
                position--;
                n--;
            }
        }
    }
}
