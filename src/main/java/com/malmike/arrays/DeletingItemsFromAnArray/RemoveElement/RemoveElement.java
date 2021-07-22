package com.malmike.arrays.DeletingItemsFromAnArray.RemoveElement;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int skip = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                skip += 1;
                continue;
            }
            if (skip > 0) {
                nums[i - skip] = nums[i];
            }
        }
        return nums.length - skip;
    }
}
