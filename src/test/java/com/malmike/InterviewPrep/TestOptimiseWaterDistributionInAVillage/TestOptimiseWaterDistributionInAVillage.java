package com.malmike.InterviewPrep.TestOptimiseWaterDistributionInAVillage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.malmike.InterviewPrep.OptimizeWaterDistributionInAVillage.OptimiseWaterDistributionInAVillage;

import org.junit.jupiter.api.Test;

public class TestOptimiseWaterDistributionInAVillage {
    private OptimiseWaterDistributionInAVillage waterDistribution;

    public TestOptimiseWaterDistributionInAVillage() {
        waterDistribution = new OptimiseWaterDistributionInAVillage();
    }

    @Test
    public void testCase1() {
        int n = 3;
        int[] wells = { 1, 2, 2 };
        int[][] pipes = { { 1, 2, 1 }, { 2, 3, 1 } };
        int expected = 3;
        int actual = waterDistribution.minCostToSupplyWater(n, wells, pipes);
        assertEquals(expected, actual);
    }
}
