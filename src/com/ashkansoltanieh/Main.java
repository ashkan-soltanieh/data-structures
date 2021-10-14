package com.ashkansoltanieh;

import com.ashkansoltanieh.linkedlist.LinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    var reverser = new StringReverser();
        var reversed = reverser.reverse("abcd");
        System.out.println(reversed);
    }
}
