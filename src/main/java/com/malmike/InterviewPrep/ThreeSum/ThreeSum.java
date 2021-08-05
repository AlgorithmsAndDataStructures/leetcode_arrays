package com.malmike.InterviewPrep.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, ArrayList<int[]>> sumMap = new HashMap<Integer, ArrayList<int[]>>();
        Set<List<Integer>> result = new HashSet<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            if (sumMap.containsKey(nums[i] * -1)) {
                ArrayList<int[]> test = sumMap.get(nums[i] * -1);
                for (int m = 0; m < test.size(); m++) {
                    if (i != test.get(m)[0] && i != test.get(m)[1]) {
                        List<Integer> resp = new ArrayList<Integer>();
                        resp.add(nums[i]);
                        resp.add(nums[test.get(m)[0]]);
                        resp.add(nums[test.get(m)[1]]);
                        resp.sort(new Comparator<Integer>() {
                            @Override
                            public int compare(Integer num1, Integer num2) {
                                if (num1 > num2)
                                    return 1;
                                if (num2 > num1)
                                    return -1;
                                return 0;
                            }
                        });
                        result.add(resp);
                    }
                }
            }
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                ArrayList<int[]> value = sumMap.getOrDefault(sum, new ArrayList<int[]>());
                int[] key = { i, j };
                value.add(key);
                sumMap.put(nums[i] + nums[j], value);
            }
        }
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        result.forEach(value -> {
            output.add(value);
        });
        return output;
    }

    public List<List<Integer>> threeSumSortNums(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int i = 0;
        while (i < nums.length - 2) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    j++;
                    continue;
                }
                if (k != nums.length - 1 && nums[k] == nums[k + 1]) {
                    k--;
                    continue;
                }
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
            i++;
        }
        return result;
    }
}
