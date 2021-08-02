package com.malmike.arrays.DeletingItemsFromAnArray.RemoveDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int skipDistance = 0;
        int currentValue = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (currentValue == nums[i]) {
                skipDistance++;
            } else {
                currentValue = nums[i];
                if (skipDistance > 0)
                    nums[i - skipDistance] = currentValue;
            }
        }
        return nums.length - skipDistance;
    }
}
