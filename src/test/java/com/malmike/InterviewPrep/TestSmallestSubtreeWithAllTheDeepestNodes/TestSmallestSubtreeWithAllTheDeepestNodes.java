package com.malmike.InterviewPrep.TestSmallestSubtreeWithAllTheDeepestNodes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import com.malmike.DataStructures.BinaryTree.BinaryTree;
import com.malmike.DataStructures.BinaryTree.TreeNode;
import com.malmike.InterviewPrep.SmallestSubtreeWithAllTheDeepestNodes.SmallestSubtreeWithAllTheDeepestNodes;

import org.junit.jupiter.api.Test;

public class TestSmallestSubtreeWithAllTheDeepestNodes {
    private SmallestSubtreeWithAllTheDeepestNodes smallestSubtreeWithAllTheDeepestNodes;

    public TestSmallestSubtreeWithAllTheDeepestNodes() {
        smallestSubtreeWithAllTheDeepestNodes = new SmallestSubtreeWithAllTheDeepestNodes();
    }

    @Test
    public void testCase1() {
        Integer[] input = { 3, 5, 1, 6, 2, 0, 8, null, null, 7, 4 };
        BinaryTree binaryTree = new BinaryTree(input);
        List<Integer> expected = Arrays.asList(2, 7, 4);
        TreeNode deepestNodeRoot = smallestSubtreeWithAllTheDeepestNodes
                .subtreeWithAllDeepest(binaryTree.getHeadNode());
        List<Integer> actual = BinaryTree.bfs(deepestNodeRoot);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        Integer[] input = { 1 };
        BinaryTree binaryTree = new BinaryTree(input);
        List<Integer> expected = Arrays.asList(1);
        TreeNode deepestNodeRoot = smallestSubtreeWithAllTheDeepestNodes
                .subtreeWithAllDeepest(binaryTree.getHeadNode());
        List<Integer> actual = BinaryTree.bfs(deepestNodeRoot);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase3() {
        Integer[] input = { 0, 1, 3, null, 2 };
        BinaryTree binaryTree = new BinaryTree(input);
        List<Integer> expected = Arrays.asList(2);
        TreeNode deepestNodeRoot = smallestSubtreeWithAllTheDeepestNodes
                .subtreeWithAllDeepest(binaryTree.getHeadNode());
        List<Integer> actual = BinaryTree.bfs(deepestNodeRoot);
        assertEquals(expected, actual);
    }
}
