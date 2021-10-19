package com.ashkansoltanieh;

import com.ashkansoltanieh.queue.QueueReverser;
import com.ashkansoltanieh.stack.Stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue.peek());
        System.out.println(queue);
        var reversed = new QueueReverser<>(queue);
        reversed.reverse();
        System.out.println(reversed);
    }
}
