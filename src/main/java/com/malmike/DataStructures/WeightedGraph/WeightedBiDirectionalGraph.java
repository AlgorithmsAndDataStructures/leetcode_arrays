package com.malmike.DataStructures.WeightedGraph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WeightedBiDirectionalGraph<T> {
    public Map<T, List<Node<T>>> adjacencyList = new HashMap<T, List<Node<T>>>();

    public Set<T> getVertices() {
        return this.adjacencyList.keySet();
    }

    public int getVertexNumber() {
        return this.adjacencyList.size();
    }

    public List<Node<T>> getNeighbours(T vertex) {
        return this.adjacencyList.getOrDefault(vertex, new ArrayList<Node<T>>());
    }

    public void addVertex(T vertex, Node<T> neighbouringNode) {
        if (this.adjacencyList.containsKey(vertex)) {
            this.adjacencyList.get(vertex).add(neighbouringNode);
        } else {
            this.adjacencyList.put(vertex, new ArrayList<Node<T>>(Arrays.asList(neighbouringNode)));
        }
    }

    public void addEdge(T currentVertex, T neighbouringVertex, int weight) {
        Node<T> currentNode = new Node<T>(currentVertex, weight);
        Node<T> neighbouringNode = new Node<T>(neighbouringVertex, weight);
        this.addVertex(currentVertex, neighbouringNode);
        this.addVertex(neighbouringVertex, currentNode);
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
