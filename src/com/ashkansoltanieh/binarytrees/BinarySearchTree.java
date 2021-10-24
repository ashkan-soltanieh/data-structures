package com.ashkansoltanieh.binarytrees;

public class BinarySearchTree {
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
}
