package com.malmike.InterviewPrep.SmallestSubtreeWithAllTheDeepestNodes;

import com.malmike.DataStructures.BinaryTree.TreeNode;

import javafx.util.Pair;

public class SmallestSubtreeWithAllTheDeepestNodes {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        Pair<TreeNode, Integer> test = this.subtree(root, 0);
        return test.getKey();
    }

    public Pair<TreeNode, Integer> subtree(TreeNode root, int depth) {
        if (root == null)
            return new Pair<>(null, Integer.MIN_VALUE);
        if (root.getLeft() == null && root.getRight() == null) {
            return new Pair<>(root, depth);
        }
        Pair<TreeNode, Integer> leftDepth = subtree(root.getLeft(), depth + 1);
        Pair<TreeNode, Integer> rightDepth = subtree(root.getRight(), depth + 1);
        if (leftDepth.getValue() > rightDepth.getValue()) {
            return leftDepth;
        }
        if (rightDepth != null && leftDepth.getValue() < rightDepth.getValue()) {
            return rightDepth;
        }
        return new Pair<>(root, rightDepth.getValue());
    }
}
