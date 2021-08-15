package com.malmike.InterviewPrep.DijkstrasAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

import com.malmike.InterviewPrep.DijkstrasAlgorithm.WeightedGraph.Node;
import com.malmike.InterviewPrep.DijkstrasAlgorithm.WeightedGraph.WeightedGraph;

public class DijkstrasAlgorithm {
    /**
     *
     * @param nodesMapping [['A', 'B', '1']] where A is the vertex, B is the
     *                     neighbouring vertex, 1 is the edge distance
     * @return
     */
    public char[] shortestPath(char[][] nodesMapping, char initialNode, char endNode) {
        // Generate weightedGraph
        WeightedGraph<Character> weightedGraph = new WeightedGraph<Character>();
        for (char[] nodeMapping : nodesMapping) {
            int edgeDistance = Integer.parseInt(String.valueOf(nodeMapping[2]));
            char vertex = nodeMapping[0];
            char neighbourVertex = nodeMapping[1];
            weightedGraph.addEdge(vertex, neighbourVertex, edgeDistance);
        }

        Map<Character, Integer> minimumDistanceMap = new HashMap<Character, Integer>();
        Map<Character, Character> previousVertex = new HashMap<Character, Character>();
        Map<Character, Boolean> visited = new HashMap<>();
        PriorityQueue<Node<Character>> minimumDistancePQ = new PriorityQueue<Node<Character>>(
                weightedGraph.getVertexNumber(), new Comparator<Node<Character>>() {

                    @Override
                    public int compare(Node<Character> node1, Node<Character> node2) {
                        if (node1.getEdgeWeight() < node2.getEdgeWeight())
                            return -1;
                        if (node1.getEdgeWeight() > node2.getEdgeWeight())
                            return 1;
                        return 0;
                    }

                });

        for (char vertex : weightedGraph.getVertices()) {
            minimumDistanceMap.put(vertex, Integer.MAX_VALUE);
            if (vertex == initialNode) {
                minimumDistanceMap.put(vertex, 0);
            }
            previousVertex.put(vertex, null);
        }

        // Create initial node and add it to the priority queue
        Node<Character> startNode = new Node<Character>(initialNode, 0);
        minimumDistancePQ.add(startNode);
        while (minimumDistancePQ.size() > 0) {
            Node<Character> currentNode = minimumDistancePQ.poll();
            visited.put(currentNode.getVertex(), true);
            for (Node<Character> neighbourNode : weightedGraph.getNeighbours(currentNode.getVertex())) {
                if (neighbourNode == null || visited.containsKey(neighbourNode.getVertex()))
                    continue;
                int minimumDistance = minimumDistanceMap.get(neighbourNode.getVertex());
                int currentDistance = currentNode.getEdgeWeight() + neighbourNode.getEdgeWeight();
                if (currentDistance < minimumDistance) {
                    Node<Character> node = new Node<>(neighbourNode.getVertex(), currentDistance);
                    minimumDistanceMap.put(neighbourNode.getVertex(), currentDistance);
                    previousVertex.put(neighbourNode.getVertex(), currentNode.getVertex());
                    minimumDistancePQ.add(node);
                }
            }
        }

        List<Character> pathToNode = new ArrayList<Character>();
        Character vertex = endNode;
        while (vertex != null) {
            pathToNode.add(vertex);
            vertex = previousVertex.get(vertex);
        }
        Collections.reverse(pathToNode);

        char[] result = pathToNode.stream().map(ch -> ch.toString()).collect(Collectors.joining()).toCharArray();
        return result;
    }
}
