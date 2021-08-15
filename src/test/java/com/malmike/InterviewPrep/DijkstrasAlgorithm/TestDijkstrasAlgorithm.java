package com.malmike.InterviewPrep.DijkstrasAlgorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestDijkstrasAlgorithm {
    private DijkstrasAlgorithm dijkstrasAlgorithm;

    public TestDijkstrasAlgorithm() {
        dijkstrasAlgorithm = new DijkstrasAlgorithm();
    }

    @Test
    public void testCase1() {
        char[][] input = { { 'A', 'B', '4' }, { 'A', 'C', '2' }, { 'C', 'D', '2' }, { 'C', 'F', '4' },
                { 'D', 'E', '3' }, { 'D', 'F', '1' }, { 'F', 'E', '1' }, { 'B', 'E', '3' } };
        char startVertex = 'A';
        char endVertex = 'E';
        char[] expected = { 'A', 'C', 'D', 'F', 'E' };
        char[] actual = dijkstrasAlgorithm.shortestPath(input, startVertex, endVertex);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        char[][] input = { { 'A', 'B', '2' }, { 'A', 'C', '2' }, { 'C', 'D', '2' }, { 'C', 'F', '4' },
                { 'D', 'E', '3' }, { 'D', 'F', '1' }, { 'F', 'E', '1' }, { 'B', 'E', '2' }, { 'E', 'F', '1' },
                { 'F', 'D', '1' } };
        char startVertex = 'A';
        char endVertex = 'F';
        char[] expected = { 'A', 'B', 'E', 'F' };
        char[] actual = dijkstrasAlgorithm.shortestPath(input, startVertex, endVertex);
        assertArrayEquals(expected, actual);
    }
}
