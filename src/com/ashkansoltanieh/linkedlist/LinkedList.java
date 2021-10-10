package com.ashkansoltanieh;

import javax.management.OperationsException;
import javax.management.RuntimeOperationsException;
import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public class LinkedList<T> {
    private Node<T> first; //head
    private Node<T> last; //tail
    private List<T> list;

    public void addFirst(T value) {
        var node = new Node<T>(value);
        if(list.size() == 0) {
            list.add(value);
            first = node;
            last = node;
            return;
        }
        node.setNext(first);
        first = node;
        list.add(value);
    }

    public void addLast(T value) {
        var node = new Node<T>(value);
        if(list.size() == 0) {
            list.add(value);
            first = node;
            last = node;
            return;
        }
        list.add(value);
        last.setNext(node);
        last = node;
    }

    public void deleteFirst() {
        if(list.size() == 0) throw new NullPointerException();
        Node<T> current = first;
        first = first.getNext();
        current.setNext(null);
    }

    public void deleteLast() {
        if(list.size() == 0) throw new NullPointerException();
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
        if (list.size() == 0) throw new NullPointerException();
        Node<T> current = first;
        while (current.getNext() != null) {
            System.out.println(current);
            current = current.getNext();
        }
        System.out.println(last);
    }

    public LinkedList() {
        this.list = new ArrayList<>();
    }
}
