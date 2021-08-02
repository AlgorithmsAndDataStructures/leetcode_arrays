package com.malmike.InterviewPrep.MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        int[][] result = this.mergeSort(intervals, 0, intervals.length);
        this.printMultiDimentionalArray(result);
        return result;
    }

    public int[][] mergeSort(int[][] intervals, int start, int end) {
        if (end < start || start == intervals.length) {
            return new int[0][2];
        }
        if (end == start) {
            int[][] x = { intervals[start] };
            return x;
        }
        int mid = (int) Math.floor((start + end) / 2);
        int[][] right = this.mergeSort(intervals, start, mid);
        int[][] left = this.mergeSort(intervals, mid + 1, end);

        return this.mergeSorted(right, left);
    }

    public void printMultiDimentionalArray(int[][] arrays) {
        Stream result = Arrays.stream(arrays).map(array -> Arrays.toString(array));
        System.out.println(Arrays.toString(result.toArray()));
    }

    public int[][] mergeSorted(int[][] right, int[][] left) {
        ArrayList<int[]> result = new ArrayList<int[]>();
        int rightPos = 0;
        int leftPos = 0;
        while (rightPos < right.length && leftPos < left.length) {
            int[] value = new int[2];
            if (right[rightPos][0] <= left[leftPos][0]) {
                if (right[rightPos][1] >= left[leftPos][0]) {
                    value[0] = right[rightPos][0];
                    value[1] = Math.max(right[rightPos][1], left[leftPos][1]);
                    leftPos++;
                } else {
                    value = right[rightPos];
                }
                rightPos++;
            } else {
                if (left[leftPos][1] >= right[rightPos][0]) {
                    value[0] = left[leftPos][0];
                    value[1] = Math.max(right[rightPos][1], left[leftPos][1]);
                    rightPos++;
                } else {
                    value = left[leftPos];
                }
                leftPos++;
            }
            this.addElementToSortedList(result, value);
        }

        while (rightPos < right.length) {
            this.addElementToSortedList(result, right[rightPos]);
            rightPos++;
        }

        while (leftPos < left.length) {
            this.addElementToSortedList(result, left[leftPos]);
            leftPos++;
        }
        int[][] mal = new int[result.size()][2];
        Arrays.setAll(mal, result::get);
        return mal;
    }

    public void addElementToSortedList(ArrayList<int[]> result, int[] itemToInsert) {
        int previousItem = result.size() - 1;
        if (previousItem >= 0 && result.get(previousItem)[1] >= itemToInsert[0]) {
            int leftValue = Math.max(result.get(previousItem)[1], itemToInsert[1]);
            int[] x = { result.get(previousItem)[0], leftValue };
            result.set(previousItem, x);
        } else {
            result.add(itemToInsert);
        }
    }

    public int[][] merge2(int[][] intervals) {
        int[][] result = this.mergeSort2(intervals, 0, intervals.length);
        this.printMultiDimentionalArray(result);
        return result;
    }

    public int[][] mergeSort2(int[][] intervals, int start, int end) {
        if (end < start || start == intervals.length) {
            return new int[0][2];
        }
        if (end == start) {
            int[][] x = { intervals[start] };
            return x;
        }
        int mid = (int) Math.floor((start + end) / 2);
        int[][] right = this.mergeSort2(intervals, start, mid);
        int[][] left = this.mergeSort2(intervals, mid + 1, end);

        this.printMultiDimentionalArray(this.mergeSorted2(right, left));
        return this.mergeSorted2(right, left);
    }

    public int[][] mergeSorted2(int[][] right, int[][] left) {
        int[][] result = new int[right.length + left.length][2];
        int i = 0;
        int rightPos = 0;
        int leftPos = 0;
        while (rightPos < right.length && leftPos < left.length) {
            int[] value = new int[2];
            if (right[rightPos][0] <= left[leftPos][0]) {
                if (right[rightPos][1] >= left[leftPos][0]) {
                    value[0] = right[rightPos][0];
                    value[1] = Math.max(right[rightPos][1], left[leftPos][1]);
                    leftPos++;
                } else {
                    value = right[rightPos];
                }
                rightPos++;
            } else {
                if (left[leftPos][1] >= right[rightPos][0]) {
                    value[0] = left[leftPos][0];
                    value[1] = Math.max(right[rightPos][1], left[leftPos][1]);
                    rightPos++;
                } else {
                    value = left[leftPos];
                }
                leftPos++;
            }
            Response resp = this.addElementToSortedArray(result, value, i);
            i = resp.i;
            result = resp.result;
        }

        while (rightPos < right.length) {
            Response resp = this.addElementToSortedArray(result, right[rightPos], i);
            i = resp.i;
            result = resp.result;
            rightPos++;
        }

        while (leftPos < left.length) {
            Response resp = this.addElementToSortedArray(result, left[leftPos], i);
            i = resp.i;
            result = resp.result;
            leftPos++;
        }

        this.printMultiDimentionalArray(result);
        System.out.println(i);
        int[][] actualResult = new int[i][2];
        for (int j = 0; j < i; j++) {
            actualResult[j] = result[j];
        }
        this.printMultiDimentionalArray(actualResult);
        return actualResult;
    }

    public Response addElementToSortedArray(int[][] result, int[] itemToInsert, int i) {
        int previousItem = i - 1;
        if (previousItem >= 0 && result[previousItem][1] >= itemToInsert[0]) {
            int leftValue = Math.max(result[previousItem][1], itemToInsert[1]);
            int[] x = { result[previousItem][0], leftValue };
            result[previousItem] = x;
        } else {
            result[i] = itemToInsert;
            i = i + 1;
        }
        return new Response(i, result);
    }

    class Response {
        int i;
        int[][] result;

        public Response(int i, int[][] result) {
            this.i = i;
            this.result = result;
        }
    }
}
