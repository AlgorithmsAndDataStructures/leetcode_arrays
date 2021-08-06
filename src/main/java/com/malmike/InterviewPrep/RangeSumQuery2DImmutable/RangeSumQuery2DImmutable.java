package com.malmike.InterviewPrep.RangeSumQuery2DImmutable;

import java.util.Arrays;

public class RangeSumQuery2DImmutable {
    int[][] matrix;

    public RangeSumQuery2DImmutable(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int total = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j];
                if (i > 0) {
                    matrix[i][j] = matrix[i - 1][j] + total;
                } else {
                    matrix[i][j] = total;
                }

            }
        }
        this.matrix = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int lowerColumn = col1 - 1 >= 0 ? this.matrix[row2][col1 - 1] : 0;
        int lowerRow = row1 - 1 >= 0 ? this.matrix[row1 - 1][col2] : 0;
        int lowerRowAndColumn = col1 - 1 >= 0 && row1 - 1 >= 0 ? this.matrix[row1 - 1][col1 - 1] : 0;
        return this.matrix[row2][col2] - (lowerColumn + lowerRow) + lowerRowAndColumn;
    }

    @Override
    public String toString() {
        String resp = "";
        for (int[] nums : this.matrix) {
            resp += Arrays.toString(nums) + "\n";
        }
        return resp;
    }
}
