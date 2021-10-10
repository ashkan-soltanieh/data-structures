package com.ashkansoltanieh;

public class Main {

    public static void main(String[] args) {
	    var array = new Array(2);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(9);
        array.add(20);
        System.out.println(array);
        var deletedItem = array.remove(2);
        array.remove(0);
        array.remove(0);
        System.out.println(array);
    }
}
