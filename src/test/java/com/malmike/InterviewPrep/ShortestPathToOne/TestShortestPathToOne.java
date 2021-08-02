package com.malmike.InterviewPrep.ShortestPathToOne;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestShortestPathToOne {
    private ShortestPathToOne shortestPathToOne;

    public TestShortestPathToOne() {
        shortestPathToOne = new ShortestPathToOne();
    }

    @Test
    public void testResolveToOne() {
        int result = shortestPathToOne.resolveToOne(10);
        assertEquals(result, 3);
    }

    @Test
    public void testResolveToOneUsingArrayForMemo() {
        int result = shortestPathToOne.resolveToOneUsingArrayForMemo(10);
        assertEquals(result, 3);
    }

    @Test
    public void testResolveToOneTabulation() {
        int result = shortestPathToOne.resolveToOneTabulation(10);
        assertEquals(result, 3);
    }
}
