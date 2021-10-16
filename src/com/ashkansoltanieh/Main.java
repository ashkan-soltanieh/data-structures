package com.ashkansoltanieh;

public class Main {

    public static void main(String[] args) {
	    var syntax = new Expression("((1 + (2))<>)");
        var result = syntax.isBalanced();
        System.out.println("Is Input Balanced? " + (result ? "Yes" : "No"));
    }
}
