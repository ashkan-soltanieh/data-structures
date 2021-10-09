package com.ashkansoltanieh;

import java.util.Arrays;

public class Array {
    private Object[] array;
    private int length;
    private int currentIndex;

    public void add(Object obj) {
        if (currentIndex < length) {
            array[currentIndex] = obj;
            currentIndex ++;
        }
        else {
            var newArray = new Object[length + 1];
            for(var i = 0; i < length; i++) {
                newArray[i] = array[i];
            }
            newArray[length++] = obj;
            array = newArray;
        }
    }

    public Object get(int index) {
        if (index < 0 || index >= length) throw new IllegalArgumentException();
        return array[index];
    }

    @Override
    public String toString() {
        return "Array{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public Array(int length) {
        this.array = new Object[length];
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
