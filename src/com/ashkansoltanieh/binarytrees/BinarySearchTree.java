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
