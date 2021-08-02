package com.malmike.InterviewPrep.ShortestPathToOne;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShortestPathToOne {
    public int resolveToOne(int num) {
        return this.pathToOne(num, new HashMap<Integer, Integer>());
    }

    public int resolveToOneUsingArrayForMemo(int num) {
        int[] memo = new int[num + 1];
        Arrays.fill(memo, Integer.MIN_VALUE);
        return this.pathToOneWithArray(num, memo);
    }

    public int pathToOne(int num, Map<Integer, Integer> memo) {

        if (num == 1) {
            return 0;
        }
        if (memo.containsKey(num)) {
            return memo.get(num);
        }

        int div3 = Integer.MAX_VALUE;
        int div2 = Integer.MAX_VALUE;
        int sub = this.pathToOne(num - 1, memo);
        if (num % 2 == 0) {
            div2 = this.pathToOne(num / 2, memo);
        }
        if (num % 3 == 0) {
            div3 = this.pathToOne(num / 3, memo);
        }
        return 1 + Math.min(sub, Math.min(div2, div3));
    }

    public int pathToOneWithArray(int num, int[] memo) {

        if (num == 1) {
            return 0;
        }

        if (memo[num] != Integer.MIN_VALUE) {
            return memo[num];
        }

        int minPath = this.pathToOneWithArray(num - 1, memo);
        if (num % 2 == 0) {
            minPath = Math.min(minPath, this.pathToOneWithArray(num / 2, memo));
        }
        if (num % 3 == 0) {
            minPath = Math.min(minPath, this.pathToOneWithArray(num / 3, memo));
        }
        return 1 + minPath;
    }

    public int resolveToOneTabulation(int num) {
        int[] table = new int[num + 1];
        for (int i = 2; i <= num; i++) {
            if (!(i % 3 == 0) && i % 2 == 0) {
                table[i] = 1 + Math.min(table[i - 1], table[i / 2]);
            } else if (i % 3 == 0 && !(i % 2 == 0)) {
                table[i] = 1 + Math.min(table[i - 1], table[i / 3]);
            } else if (i % 3 == 0 && i % 2 == 0) {
                table[i] = 1 + Math.min(table[i - 1], Math.min(table[i / 2], table[i / 3]));
            } else {
                table[i] = 1 + table[i - 1];
            }
        }
        return table[num];
    }
}
