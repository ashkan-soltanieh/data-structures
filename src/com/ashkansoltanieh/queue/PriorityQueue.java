package com.ashkansoltanieh.queue;

import java.util.Arrays;

public class PriorityQueue {
    int size = 5;
    int[] items = new int[size];
    int count = 0;

    public void add(int item) {
        if (isFull()) {
            resizeItemsArray();
        }
        int index = shiftItemsAndGetIndexToInsert(item);
        items[index] = item;
        count++;
    }

    private int shiftItemsAndGetIndexToInsert(int item) {
        int i;
        for(i = count - 1; i >= 0; i--) {
            if (items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }
        return i + 1;
    }

    public int removeHighestPriority() {
        if (isEmpty()) throw new IllegalStateException();
        return items[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }
    private void resizeItemsArray() {
        size *= 1.5;
        items = Arrays.copyOf(items, size);
    }


    @Override
    public String toString() {
        var array = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(array);
    }
}
