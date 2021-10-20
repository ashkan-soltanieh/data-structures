package com.ashkansoltanieh;

import com.ashkansoltanieh.queue.ArrayQueue;
import com.ashkansoltanieh.queue.LinkedListQueue;
import com.ashkansoltanieh.queue.QueueReverser;
import com.ashkansoltanieh.stack.Stack;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        var queue = new LinkedListQueue<Integer>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue);
        }
    }

