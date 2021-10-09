package com.ashkansoltanieh;

public class Main {

    public static void main(String[] args) {
	    var array = new Array(2);
        array.add(1);
        array.add(2);
        array.add(3);
        var deletedItem = array.remove(2);
        System.out.println(array);
        System.out.println(deletedItem);
    }
}
