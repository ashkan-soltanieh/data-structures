package com.ashkansoltanieh.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<T> {
    private int arraySize = 5;
    private double arraySizeIncrementer = 1.5;
    private T[] items = (T[])(new Object[arraySize]);
    private int count = 0;

    public void push(T item) {
        if (item == null) throw new StackOverflowError();
        if(count == arraySize) {
            arraySize *= arraySizeIncrementer;
            items = Arrays.copyOfRange(items, 0, arraySize);
        }
        items[count++] = item;
    }

    public T pop() {
        if (count == 0) throw new EmptyStackException();
        var top = items[--count];
        return top;
    }

    public T peek() {
        if (count == 0) throw new EmptyStackException();
        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }
}