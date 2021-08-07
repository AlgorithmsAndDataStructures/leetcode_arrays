package com.malmike.InterviewPrep.FindAndReplaceInString;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public int[] sortWithPriorityQueue(int[] nums) {
        int[] result = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(nums.length, new Comparator<Integer>() {

            @Override
            public int compare(Integer num1, Integer num2) {
                if (num1 < num2)
                    return -1;
                if (num1 > num2)
                    return 1;
                return 0;
            }

        });
        for (int num : nums) {
            pq.add(num);
        }
        int i = 0;
        while (!pq.isEmpty()) {
            result[i] = pq.poll();
            i++;
        }
        return result;
    }
}
