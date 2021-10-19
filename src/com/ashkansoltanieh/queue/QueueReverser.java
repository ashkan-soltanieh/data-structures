package com.ashkansoltanieh.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueReverser<T> extends ArrayDeque<T> {
    private Queue<T> queue;
    private Stack<T> stack = new Stack<>();

    public void reverse() {
        while(!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.empty())
            queue.add(stack.pop());
    }

    public QueueReverser(Queue<T> queue) {
        this.queue = queue;
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
