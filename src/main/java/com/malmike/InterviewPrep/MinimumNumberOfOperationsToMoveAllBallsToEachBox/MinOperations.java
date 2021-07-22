package com.malmike.InterviewPrep.MinimumNumberOfOperationsToMoveAllBallsToEachBox;

public class MinOperations {
    public int[] minOperationsBruteForce(String boxes) {
        int[] result = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                for (int x = 0; x < boxes.length(); x++) {
                    if (i != x) {
                        result[x] += Math.abs(x - i);
                    }
                }
            }
        }
        return result;
    }

    public int[] minOperationsOptimised(String boxes) {
        int ballsSeen = 0;
        int previousOperations = 0;
        int[] result = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            int operations = ballsSeen + previousOperations;
            result[i] = operations;
            if (boxes.charAt(i) == '1') {
                ballsSeen++;
            }
            previousOperations = operations;
        }

        ballsSeen = 0;
        previousOperations = 0;
        for (int i = boxes.length() - 1; i >= 0; i--) {
            int operations = ballsSeen + previousOperations;
            result[i] += operations;
            if (boxes.charAt(i) == '1') {
                ballsSeen++;
            }
            previousOperations = operations;
        }
        return result;
    }
}
