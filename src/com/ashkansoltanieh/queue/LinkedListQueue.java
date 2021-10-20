package com.ashkansoltanieh.queue;


import java.util.LinkedList;

public class LinkedListQueue<T> {
    LinkedList<T> list = new LinkedList<>();

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        var front = list.removeFirst();
        return front;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
