package com.malmike.DataStructures.WeightedGraph;

public class Node<T> {
    private int edgeWeight;
    private T vertex;

    public Node(T vertex) {
        this.vertex = vertex;
    }

    public Node(T vertex, int edgeWeight) {
        this.edgeWeight = edgeWeight;
        this.vertex = vertex;
    }

    public int getEdgeWeight() {
        return this.edgeWeight;
    }

    public T getVertex() {
        return this.vertex;
    }
}
