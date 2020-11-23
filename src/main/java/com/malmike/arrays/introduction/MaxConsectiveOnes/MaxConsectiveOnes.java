package com.malmike.arrays.introduction.MaxConsectiveOnes;

public class MaxConsectiveOnes {
    public int findMaxConsectiveOnes(int[] nums) {
        int maxConsectiveOnes = 0;
        int counter = 0;
        for (int num : nums) {
            if (num == 1)
                counter++;
            else if (num == 0 && counter > 0) {
                maxConsectiveOnes = Math.max(counter, maxConsectiveOnes);
                counter = 0;
            }
        }
        maxConsectiveOnes = Math.max(counter, maxConsectiveOnes);
        return maxConsectiveOnes;
    }
}
