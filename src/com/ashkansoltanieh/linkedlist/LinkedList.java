package com.ashkansoltanieh.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedList<T> {
    private Node<T> first; //head
    private Node<T> last; //tail

    public void addFirst(T value) {
        var node = new Node<T>(value);
        if(first == null) {
            first = last = node;
            return;
        }
        node.setNext(first);
        first = node;
    }

    public void addLast(T value) {
        var node = new Node<T>(value);
        if(first == null) {
            first = node;
            last = node;
            return;
        }
        last.setNext(node);
        last = node;
    }

    public void deleteFirst() {
        if(first == null) throw new NullPointerException();
        Node<T> current = first;
        first = first.getNext();
        current.setNext(null);
    }

    public void deleteLast() {
        if(first == null) throw new NullPointerException();
        Node<T> current = first;
        while (current.getNext() != last) {
            current = current.getNext();
        }
        last = current;
        last.setNext(null);
    }

    public boolean contains(T value) {
        Node<T> current = first;
        if (first.getValue() == value || last.getValue() == value) return true;
        while (current.getNext() != null) {
            if (current.getValue() == value) return true;
            current = current.getNext();
        }
        return false;
    }

    public int indexOf(T value) {
        int index = 0;
        Node<T> current = first;
        while (current.getNext() != null) {
            if (current.getValue() == value) return index;
            current = current.getNext();
            index++;
        }
        if (last.getValue() == value) return index;
        return -1;
    }

    public void print() {
        if (first == null) throw new NullPointerException();
        Node<T> current = first;
        while (current.getNext() != null) {
            System.out.println(current);
            current = current.getNext();
        }
        System.out.println(last);
    }
}
