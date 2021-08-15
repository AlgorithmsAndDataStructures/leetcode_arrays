package com.malmike.InterviewPrep.NetworkDelayTime;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import com.malmike.DataStructures.WeightedGraph.WeightedGraph;
import com.malmike.DataStructures.WeightedGraph.Node;

public class NetworkDelayTime {

    public int networkDelayTime(int[][] mappingtimes, int n, int k) {
        WeightedGraph<Integer> weightedGraph = new WeightedGraph<Integer>();
        for (int[] mapping : mappingtimes) {
            weightedGraph.addEdge(mapping[0], mapping[1], mapping[2]);
        }

        if (weightedGraph.getVertexNumber() != n)
            return -1;

        Map<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
        Map<Integer, Integer> minimumPathMap = new HashMap<Integer, Integer>();
        Map<Integer, Integer> previousVertex = new HashMap<Integer, Integer>();
        PriorityQueue<Node<Integer>> minimumPathPQ = new PriorityQueue<Node<Integer>>(n,
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
        for (int key : weightedGraph.getVertices()) {
            minimumPathMap.put(key, Integer.MAX_VALUE);
            previousVertex.put(key, null);
            if (key == k) {
                minimumPathMap.put(key, 0);
            }
        }

        minimumPathPQ.add(new Node<Integer>(k, 0));

        while (!minimumPathPQ.isEmpty()) {
            Node<Integer> currentNode = minimumPathPQ.poll();
            visited.put(currentNode.getVertex(), true);
            for (Node<Integer> neighbour : weightedGraph.getNeighbours(currentNode.getVertex())) {
                int heldDistance = minimumPathMap.get(neighbour.getVertex());
                int currentDistance = currentNode.getEdgeWeight() + neighbour.getEdgeWeight();
                if (currentDistance < heldDistance) {
                    Node<Integer> newNode = new Node<Integer>(neighbour.getVertex(), currentDistance);
                    minimumPathPQ.add(newNode);
                    previousVertex.put(neighbour.getVertex(), currentNode.getVertex());
                    minimumPathMap.put(neighbour.getVertex(), currentDistance);
                }
            }
        }

        int maxDistance = 0;
        for (int key : weightedGraph.getVertices()) {
            if (key != k && previousVertex.get(key) == null) {
                return -1;
            }
            maxDistance = Math.max(maxDistance, minimumPathMap.get(key));
        }
        return maxDistance;
    }
}
