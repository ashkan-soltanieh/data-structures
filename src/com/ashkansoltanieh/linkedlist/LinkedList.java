package com.ashkansoltanieh.linkedlist;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedList<T> {
    private Node<T> first; //head
    private Node<T> last; //tail
    private int size;

    public void addFirst(T value) {
        var node = new Node<T>(value);
        if(first == null)
            first = last = node;
        else {
            node.setNext(first);
            first = node;
        }
        size++;
    }

    public void addLast(T value) {
        var node = new Node<T>(value);
        if(first == null)
            first = last = node;
        else {
            last.setNext(node);
            last = node;
        }
        size++;
    }

    public void deleteFirst() {
        if(first == null) throw new NoSuchElementException();
        if(first.getNext() == null)
            first = last = null;
        else {
            Node<T> current = first;
            first = first.getNext();
            current.setNext(null);
        }
        size--;
    }

    public void deleteLast() {
        if(first == null) throw new NoSuchElementException();
        if(first.getNext() == null)
            first = last = null;
        else {
            Node<T> oneBeforeLastNode = getOneBeforeLastNode();
            last = oneBeforeLastNode;
            last.setNext(null);
        }
        size--;
    }

    private Node<T> getOneBeforeLastNode() {
        Node<T> node = first;
        while (node.getNext() != last) {
            node = node.getNext();
        }
        return node;
    }

    public boolean contains(T value) {
        return indexOf(value) != -1;
    }

    public int indexOf(T value) {
        int index = 0;
        Node<T> current = first;
        while (current != null) {
            if (current.getValue() == value) return index;
            current = current.getNext();
            index++;
        }
        return -1;
    }

    public void print() {
        if (first == null) System.out.println("List is empty!");;
        Node<T> current = first;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

    public int size() {
        return size;
    }

    public Object[] toArray() {
        Node<T> current = first;
        var array = new Object[size];
        var index = 0;
        while (current != null) {
            array[index++] = (current.getValue());
            current = current.getNext();
        }
        return array;
    }
}
