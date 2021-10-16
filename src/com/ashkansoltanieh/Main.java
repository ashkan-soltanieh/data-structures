package com.ashkansoltanieh;

import com.ashkansoltanieh.stack.Stack;

public class Main {

    public static void main(String[] args) {
	    var stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack);
    }
}
