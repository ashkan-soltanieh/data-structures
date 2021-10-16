package com.ashkansoltanieh.stack;


import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> items = new LinkedList<>();

    public void push(T item) {
        items.addLast(item);
    }

    public T pop() {
        return items.removeLast();
    }

    public T peek() {
        return items.getLast();
    }

    public boolean isEmpty() {
       return items.isEmpty();
    }

    @Override
    public String toString() {
        return "Stack{" +
                "items=" + items +
                '}';
    }
}