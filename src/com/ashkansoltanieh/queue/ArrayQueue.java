package com.ashkansoltanieh.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayQueue<T> {
    private T[] array;
    private int front;
    private int end;
    private int count;

    public ArrayQueue(int size) {
        array = (T[]) new Object[size];
    }

    public void enqueue(T item) {
        if(count == array.length) throw new IllegalStateException();
        array[end] = item;
        end = (end + 1) % array.length;
        count++;
    }

    public T dequeue() {
        if(count == 0) throw new IllegalStateException();
        var dequeued = array[front];
        array[front] = null;
        front = (front + 1) % array.length;
        count--;
        return dequeued;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == array.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
