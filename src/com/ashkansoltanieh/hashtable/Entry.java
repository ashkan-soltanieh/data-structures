package com.ashkansoltanieh.hashtable;

class Entry {
    int key;
    String value;

    public Entry(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}
