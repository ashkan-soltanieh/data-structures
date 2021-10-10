package com.ashkansoltanieh;

import com.ashkansoltanieh.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {
	    var list = new LinkedList<Integer>();
        list.addLast(1);
        list.addLast(0);
        list.addFirst(-1);
        list.deleteLast();
        list.deleteFirst();
        list.print();
        System.out.println(list.indexOf(20));
        list.addLast(0);
        list.addFirst(-1);
        list.print();
        System.out.println(list.contains(0));
    }
}
