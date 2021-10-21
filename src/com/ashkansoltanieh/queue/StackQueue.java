package com.ashkansoltanieh.queue;

import java.util.Stack;

public class StackQueue<T> {
    Stack<T> enqueueStack = new Stack<>();
    Stack<T> dequeueStack = new Stack<>();

    public void enqueue(T item) {
        enqueueStack.push(item);
    }

    public T dequeue() {
        if(dequeueStack.empty() && enqueueStack.empty()) throw new IllegalStateException();
        if(dequeueStack.empty()) {
            while(!enqueueStack.empty())
                dequeueStack.push(enqueueStack.pop());
        }
        return dequeueStack.pop();
    }

    @Override
    public String toString() {
        return dequeueStack.toString() + enqueueStack.toString();
    }
}
