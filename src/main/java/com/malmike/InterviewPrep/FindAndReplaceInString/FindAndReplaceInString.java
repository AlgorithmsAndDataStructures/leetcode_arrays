package com.malmike.InterviewPrep.FindAndReplaceInString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class FindAndReplaceInString {

    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            int startPos = indices[i];
            int endPos = indices[i] + sources[i].length();
            String substring = stringBuilder.substring(startPos, endPos);

            if (substring.equals(sources[i])) {
                stringBuilder.replace(startPos, endPos, targets[i]);
                int additionalLength = targets[i].length() - sources[i].length();
                for (int j = i + 1; j < indices.length; j++) {
                    if (indices[j] > indices[i]) {
                        indices[j] = indices[j] + additionalLength;
                    }
                }
            }
        }
        return stringBuilder.toString();
    }

    public String findReplaceStringPriorityQueue(String s, int[] indices, String[] sources, String[] targets) {
        PriorityQueue<Node> indicesPQ = this.generatePriorityQueue(indices);
        StringBuilder stringBuilder = new StringBuilder(s);
        int additionalLength = 0;

        while (!indicesPQ.isEmpty()) {
            Node node = indicesPQ.poll();
            int index = additionalLength + node.index;
            String source = sources[node.indicesPosition];
            String target = targets[node.indicesPosition];
            int sourceLength = source.length();
            int targetLength = target.length();
            String substring = stringBuilder.substring(index, index + sourceLength);
            if (substring.equals(source)) {
                stringBuilder.replace(index, index + sourceLength, target);
                additionalLength += targetLength - sourceLength;
            }
        }
        return stringBuilder.toString();
    }

    private PriorityQueue<Node> generatePriorityQueue(int[] indices) {
        PriorityQueue<Node> indicesPQ = new PriorityQueue<Node>(indices.length, new Compare());
        for (int i = 0; i < indices.length; i++) {
            Node node = new Node(indices[i], i);
            indicesPQ.add(node);
        }
        return indicesPQ;
    }

    private class Compare implements Comparator<Node> {
        @Override
        public int compare(Node node1, Node node2) {
            if (node1.index < node2.index)
                return -1;
            if (node1.index > node2.index)
                return 1;
            return 0;
        }
    }

    private class Node {
        int index;
        int indicesPosition;

        public Node(int index, int indicesPosition) {
            this.index = index;
            this.indicesPosition = indicesPosition;
        }

        @Override
        public String toString() {
            return String.format("Index: %d, IndicesPosition: %d", this.index, this.indicesPosition);
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, ArrayList<int[]>> sumMap = new HashMap<Integer, ArrayList<int[]>>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
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
                            public int compare(Integer o1, Integer o2) {
                                return o1 < o2 ? o1 : o2;
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
        return result;
    }
}
