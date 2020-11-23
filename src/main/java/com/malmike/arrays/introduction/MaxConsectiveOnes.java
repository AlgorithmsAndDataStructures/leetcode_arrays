/*
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 * Example 1:
 *
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 *     The maximum number of consecutive 1s is 3.
 *
 * Note:
 *
 *     The input array will only contain 0 and 1.
 *     The length of input array is a positive integer and will not exceed 10,000
 */

/*
 * Sudo code
 * initialise maxConsectiveOnes to zero
 * initialise counter to zero
 * iterate through the array nums
 *     if the number at the array position is one increase counter by one
 *     if the number at the array position is zero and the counter is greater than zero
 *         set maxConsectiveOnes to the maximum of maxConsectiveOnes and counter
 *         set counter to zero
 * if counter is greater than zero
 *     set maxConsectiveOnes to the maximum of maxConsectiveOnes and counter
 * return maxConsectiveOnes
 */

package com.malmike.arrays.introduction;

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
