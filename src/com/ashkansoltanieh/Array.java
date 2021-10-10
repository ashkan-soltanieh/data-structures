package com.ashkansoltanieh;

import java.util.Arrays;

public class Array {
    private Object[] array;
    private int length;
    private int currentIndex;

    public void add(Object obj) {
        if (currentIndex < length) {
            array[currentIndex] = obj;
            currentIndex++;
        }
        else {
            var newArray = new Object[length + 1];
            for(var i = 0; i < length; i++) {
                newArray[i] = array[i];
            }
            newArray[currentIndex++] = obj;
            length++;
            array = newArray;
        }
    }

    public Object get(int index) {
        if (index < 0 || index >= length) throw new IllegalArgumentException();
        return array[index];
    }

    public Object remove(int index) {
        var deletedItem = array[index];
        if (index < 0 || index >= length) throw new IllegalArgumentException();
        var newArray = new Object[length - 1];
        for(var i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for(var i = index; i < length - 1; i++) {
            newArray[i] = array[i + 1];
        }
        length--;
        array = newArray;
        return deletedItem;
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
