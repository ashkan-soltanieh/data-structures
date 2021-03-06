package com.ashkansoltanieh.binarytrees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        var node = findNodeOrParent(value);
        if (node.value == value) return;
        if (value > node.value)
            node.rightChild = new Node(value);
        else
            node.leftChild = new Node(value);
    }

    public boolean find(int value) {
        return findNodeOrParent(value).value == value;
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node node) {
        //base condition
        if (node == null) return;

        System.out.println(node.value);
        traversePreOrder(node.leftChild);
        traversePreOrder(node.rightChild);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node node) {
        if (node == null) return;
        traverseInOrder(node.leftChild);
        System.out.println(node.value);
        traverseInOrder(node.rightChild);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node node) {
        if (node == null) return;
        traversePostOrder(node.leftChild);
        traversePostOrder(node.rightChild);
        System.out.println(node.value);
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) return -1;
        if (node.leftChild == null && node.rightChild == null) return 0;
        int left = height(node.leftChild);
        int right = height(node.rightChild);
        return Math.max(left, right) + 1;
    }

    public boolean equals(BinaryTree other) {
        if (other == null) throw new IllegalStateException();
        return equals(this.root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null) return true;
        if (first != null && second != null) {
            var isValuesEqual  = first.value == second.value;
            var isLeftEqual = equals(first.leftChild, second.leftChild);
            var isRightEqual = equals(first.rightChild, second.rightChild);
            return isLeftEqual && isRightEqual && isValuesEqual;
        }
        return false;
    }

    public int minimum() {
        return minimum(root);
    }

    private int minimum(Node node) {
        if(node.leftChild == null && node.rightChild == null) return node.value;
        var left = minimum(node.leftChild);
        var right = minimum(node.rightChild);
        return Math.min(Math.min(left, right), node.value);
    }

    private Node findNodeOrParent(int value) {
        var current = root;
        while (current != null) {
            if (value < current.value){
                if (current.leftChild == null)
                    return current;
                current = current.leftChild;
            }
            else if (value > current.value){
                if (current.rightChild == null)
                    return current;
                current = current.rightChild;
            }
            else
                return current;
        }
        return null;
    }

    public void swapRoot() {
        var temp = root.leftChild;
        root.leftChild = root.rightChild;
        root.rightChild = temp;
    }

    public boolean isBinarySearchTree() {
        return isNodeInRange(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isNodeInRange(Node node, int min, int max) {
        if (node == null) return true;
        if (node.value < min || node.value > max) return false;
        var isRightInRange = isNodeInRange(node.rightChild, node.value + 1, max);
        var isLeftInRange = isNodeInRange(node.leftChild, min, node.value -1);
        return isRightInRange && isLeftInRange;
    }

    public List<Integer> getNodesAtDistance(int distance) {
        var list = new ArrayList<Integer>();
        getNodesAtDistance(root, distance, list);
        return list;
    }

    private void getNodesAtDistance(Node node, int distance, List<Integer> list) {
        if (node == null) return;
        if (distance-- == 0) {
            list.add(node.value);
            return;
        }
        getNodesAtDistance(node.leftChild, distance, list);
        getNodesAtDistance(node.rightChild, distance, list);
    }

    public int sum() {
        return sum(root);
    }

    private int sum(Node node) {
        if (node == null) return 0;
        var left = sum(node.leftChild);
        var right = sum(node.rightChild);
        return (left + right + node.value);
    }
}
