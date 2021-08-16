package com.malmike.DataStructures.BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    TreeNode binaryTree;

    public void createTreeNode(Integer[] values) {
        Queue<TreeNode> nodesQueue = new LinkedList<TreeNode>();
        binaryTree = new TreeNode(values[0]);
        nodesQueue.add(binaryTree);
        int i = 0;
        while (!nodesQueue.isEmpty()) {
            TreeNode currentNode = nodesQueue.poll();
            i++;
            if (i < values.length && values[i] != null) {
                TreeNode leftNode = new TreeNode(values[i]);
                currentNode.setLeft(leftNode);
                nodesQueue.add(leftNode);
            }
            i++;
            if (i < values.length && values[i] != null) {
                TreeNode rightNode = new TreeNode(values[i]);
                currentNode.setRight(rightNode);
                nodesQueue.add(rightNode);
            }
        }
    }

    public static List<Integer> bfs(TreeNode node) {
        List<Integer> result = new ArrayList<Integer>();
        Queue<TreeNode> nodesQueue = new LinkedList<TreeNode>();
        nodesQueue.add(node);
        while (!nodesQueue.isEmpty()) {
            TreeNode currentNode = nodesQueue.poll();
            result.add(currentNode.val);
            if (currentNode.left != null)
                nodesQueue.add(currentNode.left);
            if (currentNode.right != null)
                nodesQueue.add(currentNode.right);
        }
        return result;
    }

    public static List<Integer> dfsPreOrder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return result;
        }
        result.add(node.val);
        dfsPreOrder(node.left, result);
        dfsPreOrder(node.right, result);
        return result;
    }

    public static List<Integer> dfsPreOrderInterative(TreeNode node) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> nodesStack = new Stack<TreeNode>();
        nodesStack.add(node);
        while (!nodesStack.isEmpty()) {
            TreeNode currentNode = nodesStack.pop();
            result.add(currentNode.val);
            if (currentNode.right != null)
                nodesStack.add(currentNode.right);
            if (currentNode.left != null)
                nodesStack.add(currentNode.left);
        }
        return result;
    }

    public static List<Integer> dfsPostOrder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return result;
        }
        dfsPostOrder(node.left, result);
        dfsPostOrder(node.right, result);
        result.add(node.val);
        return result;
    }

    public static List<Integer> dfsPostOrderIterative(TreeNode node) {
        List<Integer> result = new ArrayList<Integer>();
        Map<TreeNode, Boolean> visited = new HashMap<TreeNode, Boolean>();
        Stack<TreeNode> nodesStack = new Stack<TreeNode>();
        nodesStack.add(node);
        while (!nodesStack.isEmpty()) {
            TreeNode currentNode = nodesStack.peek();

            if (currentNode.left != null && !visited.containsKey(currentNode.left)) {
                nodesStack.add(currentNode.left);
            } else if (currentNode.right != null && !visited.containsKey(currentNode.right)) {
                nodesStack.add(currentNode.right);
            } else {
                TreeNode actualNode = nodesStack.pop();
                visited.put(actualNode, true);
                result.add(actualNode.val);
            }
        }
        return result;
    }

    public static List<Integer> dfsInOrder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return result;
        }
        dfsInOrder(node.left, result);
        result.add(node.val);
        dfsInOrder(node.right, result);
        return result;
    }

    public static List<Integer> dfsInOrderIterative(TreeNode node) {
        List<Integer> result = new ArrayList<Integer>();
        Map<TreeNode, Boolean> visited = new HashMap<TreeNode, Boolean>();
        Stack<TreeNode> nodesStack = new Stack<TreeNode>();
        nodesStack.add(node);
        int i = 0;
        while (!nodesStack.isEmpty() && i < 100) {
            TreeNode currentNode = nodesStack.peek();

            if (currentNode.left != null && !visited.containsKey(currentNode.left)) {
                nodesStack.add(currentNode.left);
            } else {
                TreeNode actualNode = nodesStack.pop();
                visited.put(actualNode, true);
                result.add(actualNode.val);

                if (actualNode.right != null && !visited.containsKey(actualNode.right)) {
                    nodesStack.add(actualNode.right);
                }
            }
        }
        return result;
    }
}
