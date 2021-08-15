package com.malmike.InterviewPrep.NetworkDelayTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestNetworkDelayTime {
    private NetworkDelayTime networkDelayTime;

    public TestNetworkDelayTime() {
        networkDelayTime = new NetworkDelayTime();
    }

    @Test
    public void testCase1() {
        int[][] times = { { 2, 1, 1 }, { 2, 3, 1 }, { 3, 4, 1 } };
        int n = 4;
        int k = 2;
        int expected = 2;
        int output = this.networkDelayTime.networkDelayTime(times, n, k);
        assertEquals(expected, output);
    }

    @Test
    public void testCase2() {
        int[][] times = { { 1, 2, 1 } };
        int n = 2;
        int k = 1;
        int expected = 1;
        int output = this.networkDelayTime.networkDelayTime(times, n, k);
        assertEquals(expected, output);
    }

    @Test
    public void testCase3() {
        int[][] times = { { 1, 2, 1 } };
        int n = 2;
        int k = 2;
        int expected = -1;
        int output = this.networkDelayTime.networkDelayTime(times, n, k);
        assertEquals(expected, output);
    }

    @Test
    public void testCase4() {
        int[][] times = { { 1, 2, 1 }, { 2, 1, 3 } };
        int n = 2;
        int k = 2;
        int expected = 3;
        int output = this.networkDelayTime.networkDelayTime(times, n, k);
        assertEquals(expected, output);
    }

    @Test
    public void testCase5() {
        int[][] times = { { 3, 5, 78 }, { 2, 1, 1 }, { 1, 3, 0 }, { 4, 3, 59 }, { 5, 3, 85 }, { 5, 2, 22 },
                { 2, 4, 23 }, { 1, 4, 43 }, { 4, 5, 75 }, { 5, 1, 15 }, { 1, 5, 91 }, { 4, 1, 16 }, { 3, 2, 98 },
                { 3, 4, 22 }, { 5, 4, 31 }, { 1, 2, 0 }, { 2, 5, 4 }, { 4, 2, 51 }, { 3, 1, 36 }, { 2, 3, 59 } };
        int n = 5;
        int k = 5;
        int expected = 31;
        int output = this.networkDelayTime.networkDelayTime(times, n, k);
        assertEquals(expected, output);
    }

    @Test
    public void testCase6() {
        int[][] times = { { 1, 2, 1 }, { 2, 3, 7 }, { 1, 3, 4 }, { 2, 1, 2 } };
        int n = 4;
        int k = 1;
        int expected = -1;
        int output = this.networkDelayTime.networkDelayTime(times, n, k);
        assertEquals(expected, output);
    }
}
