package com.malmike.InterviewPrep.OptimizeWaterDistributionInAVillage;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

import com.malmike.DataStructures.WeightedGraph.Node;
import com.malmike.DataStructures.WeightedGraph.WeightedBiDirectionalGraph;

public class OptimiseWaterDistributionInAVillage {
    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        // Generate graph
        WeightedBiDirectionalGraph<Integer> allHouses = new WeightedBiDirectionalGraph<Integer>();
        for (int[] pipe : pipes) {
            allHouses.addEdge(pipe[0], pipe[1], pipe[2]);
        }

        // Generate minimumCostMap
        int indexLowestCostWell = 0;
        Map<Integer, Integer> minimumCostMap = new HashMap<Integer, Integer>();
        Map<Integer, Integer> pipesPath = new HashMap<Integer, Integer>();
        for (int i = 0; i < wells.length; i++) {
            if (i > 0)
                indexLowestCostWell = wells[i] < wells[indexLowestCostWell] ? i : indexLowestCostWell;
            minimumCostMap.put(i + 1, Integer.MAX_VALUE);
            pipesPath.put(i + 1, null);
        }

        int lowestCostWellBuild = indexLowestCostWell + 1;
        minimumCostMap.put(lowestCostWellBuild, wells[indexLowestCostWell]);

        // Initialiaze houses fitted
        Map<Integer, Boolean> housesFitted = new HashMap<Integer, Boolean>();

        // Start water distribution construction
        Queue<Node<Integer>> queueHouseFitting = new PriorityQueue<Node<Integer>>(wells.length,
                new Comparator<Node<Integer>>() {

                    @Override
                    public int compare(Node<Integer> node1, Node<Integer> node2) {
                        if (node1.getEdgeWeight() < node2.getEdgeWeight())
                            return -1;
                        if (node1.getEdgeWeight() > node2.getEdgeWeight())
                            return 1;
                        return 0;
                    }
                });
        Node<Integer> startHouse = new Node<Integer>(lowestCostWellBuild, minimumCostMap.get(lowestCostWellBuild));
        queueHouseFitting.add(startHouse);

        while (!queueHouseFitting.isEmpty()) {
            Node<Integer> currentHouse = queueHouseFitting.poll();
            housesFitted.put(currentHouse.getVertex(), true);
            for (Node<Integer> neighbouringHouse : allHouses.getNeighbours(currentHouse.getVertex())) {
                if (!housesFitted.containsKey(neighbouringHouse.getVertex())) {
                    int previousCost = minimumCostMap.get(neighbouringHouse.getVertex());
                    int constructionCost = minimumCostMap.get(currentHouse.getVertex())
                            + wells[neighbouringHouse.getVertex() - 1];
                    int currentCost = minimumCostMap.get(currentHouse.getVertex()) + neighbouringHouse.getEdgeWeight();
                    if (previousCost > constructionCost || previousCost > currentCost) {
                        if (currentCost < constructionCost) {
                            minimumCostMap.put(neighbouringHouse.getVertex(), currentCost);
                            pipesPath.put(neighbouringHouse.getVertex(), currentHouse.getVertex());
                            Node<Integer> constructedNeighbouringNode = new Node<Integer>(neighbouringHouse.getVertex(),
                                    currentCost);
                            queueHouseFitting.add(constructedNeighbouringNode);
                        } else {
                            Node<Integer> constructedNeighbouringNode = new Node<Integer>(neighbouringHouse.getVertex(),
                                    constructionCost);
                            queueHouseFitting.add(constructedNeighbouringNode);
                        }
                    }
                }
            }
        }

        int maxCost = 0;
        for (int key : minimumCostMap.keySet()) {
            maxCost = Math.max(minimumCostMap.get(key), maxCost);
        }

        return maxCost;
    }
}
