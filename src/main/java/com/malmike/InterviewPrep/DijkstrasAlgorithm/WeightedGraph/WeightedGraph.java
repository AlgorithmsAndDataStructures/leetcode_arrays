package com.malmike.InterviewPrep.DijkstrasAlgorithm.WeightedGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WeightedGraph<T> {
    private Map<T, List<Node<T>>> adjacencyList = new HashMap<T, List<Node<T>>>();

    public Set<T> getVertices() {
        return this.adjacencyList.keySet();
    }

    public int getVertexNumber() {
        return this.adjacencyList.size();
    }

    public List<Node<T>> getNeighbours(T vertex) {
        return this.adjacencyList.getOrDefault(vertex, new ArrayList<Node<T>>());
    }

    public void addVertex(T vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            adjacencyList.put(vertex, new ArrayList<Node<T>>());
        }
    }

    public void addEdge(T vertex, T neighbourVertex, int edgeWeight) {
        if (!adjacencyList.containsKey(vertex)) {
            this.addVertex(vertex);
        }
        if (!adjacencyList.containsKey(neighbourVertex)) {
            this.addVertex(neighbourVertex);
        }
        Node<T> neighbouringNode = new Node<T>(neighbourVertex, edgeWeight);
        adjacencyList.get(vertex).add(neighbouringNode);
    }

    public void printGraph() {
        System.out.println("{");
        for (T key : this.getVertices()) {
            List<Node<T>> next = this.adjacencyList.get(key);
            System.out.print("\t" + key + ": { ");
            for (int i = 0; i < next.size(); i++) {
                if (i == next.size() - 1) {
                    System.out.print("[" + next.get(i).getVertex() + ", " + next.get(i).getEdgeWeight() + "] ");
                } else {
                    System.out.print("[" + next.get(i).getVertex() + ", " + next.get(i).getEdgeWeight() + "], ");
                }
            }
            System.out.print("}\n");
        }
        System.out.println("}");
    }
}
