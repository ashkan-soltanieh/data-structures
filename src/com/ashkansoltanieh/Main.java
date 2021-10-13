package com.ashkansoltanieh;

import com.ashkansoltanieh.linkedlist.LinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    var list = new LinkedList<Integer>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
//        list.reverse();
        var reversed = list.toArray();
        System.out.println(Arrays.toString(reversed));
        System.out.println(list.getKth(4));
    }
}
