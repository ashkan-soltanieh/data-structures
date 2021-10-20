package com.ashkansoltanieh;

import com.ashkansoltanieh.queue.ArrayQueue;
import com.ashkansoltanieh.queue.QueueReverser;
import com.ashkansoltanieh.stack.Stack;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedList<Integer>();
        list.add(5);
        list.add(6);
        for (var item: list) {
            System.out.println(item);
        }
    }
}
