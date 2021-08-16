package com.malmike.DataStructures.BinaryTree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestBinaryTree {
    private BinaryTree binaryTree;

    public TestBinaryTree() {
        binaryTree = new BinaryTree();
    }

    @Test
    public void testDfsPreOrder() {
        Integer[] input = { 3, 5, 1, 6, 2, 0, 8, null, null, 7, 4 };
        this.binaryTree.createTreeNode(input);
        List<Integer> expected = Arrays.asList(3, 5, 6, 2, 7, 4, 1, 0, 8);
        List<Integer> output = new ArrayList<Integer>();
        BinaryTree.dfsPreOrder(this.binaryTree.binaryTree, output);
        assertEquals(expected, output);
    }

    @Test
    public void testDfsPreOrderIterative() {
        Integer[] input = { 3, 5, 1, 6, 2, 0, 8, null, null, 7, 4 };
        this.binaryTree.createTreeNode(input);
        List<Integer> expected = Arrays.asList(3, 5, 6, 2, 7, 4, 1, 0, 8);
        List<Integer> output = BinaryTree.dfsPreOrderInterative(this.binaryTree.binaryTree);
        assertEquals(expected, output);
    }

    @Test
    public void testDfsPostOrder() {
        Integer[] input = { 3, 5, 1, 6, 2, 0, 8, null, null, 7, 4 };
        this.binaryTree.createTreeNode(input);
        List<Integer> expected = Arrays.asList(6, 7, 4, 2, 5, 0, 8, 1, 3);
        List<Integer> output = new ArrayList<Integer>();
        BinaryTree.dfsPostOrder(this.binaryTree.binaryTree, output);
        assertEquals(expected, output);
    }

    @Test
    public void testDfsPostOrderIterative() {
        Integer[] input = { 3, 5, 1, 6, 2, 0, 8, null, null, 7, 4 };
        this.binaryTree.createTreeNode(input);
        List<Integer> expected = Arrays.asList(6, 7, 4, 2, 5, 0, 8, 1, 3);
        List<Integer> output = BinaryTree.dfsPostOrderIterative(this.binaryTree.binaryTree);
        assertEquals(expected, output);
    }

    @Test
    public void testDfsInOrder() {
        Integer[] input = { 3, 5, 1, 6, 2, 0, 8, null, null, 7, 4 };
        this.binaryTree.createTreeNode(input);
        List<Integer> expected = Arrays.asList(6, 5, 7, 2, 4, 3, 0, 1, 8);
        List<Integer> output = new ArrayList<Integer>();
        BinaryTree.dfsInOrder(this.binaryTree.binaryTree, output);
        assertEquals(expected, output);
    }

    @Test
    public void testDfsInOrderIterative() {
        Integer[] input = { 3, 5, 1, 6, 2, 0, 8, null, null, 7, 4 };
        this.binaryTree.createTreeNode(input);
        List<Integer> expected = Arrays.asList(6, 5, 7, 2, 4, 3, 0, 1, 8);
        List<Integer> output = BinaryTree.dfsInOrderIterative(this.binaryTree.binaryTree);
        assertEquals(expected, output);
    }

    @Test
    public void bfs() {
        Integer[] input = { 3, 5, 1, 6, 2, 0, 8, null, null, 7, 4 };
        this.binaryTree.createTreeNode(input);
        List<Integer> expected = Arrays.asList(3, 5, 1, 6, 2, 0, 8, 7, 4);
        List<Integer> output = BinaryTree.bfs(this.binaryTree.binaryTree);
        assertEquals(expected, output);
    }
}
