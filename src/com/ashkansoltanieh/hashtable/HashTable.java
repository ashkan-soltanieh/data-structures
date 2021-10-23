package com.ashkansoltanieh.hashtable;



import java.util.LinkedList;

public class HashTable {
    private int size;
    private LinkedList<Entry>[] entries;

    public HashTable(int size) {
        this.size = size;
        entries = new LinkedList[size];
    }

    public void put(int key, String value) {
        var entry = getEntry(key);
        if (entry != null)
            entry.value = value;
        else {
            entry = new Entry(key, value);
            var bucket = getOrCreateBucket(key);
            bucket.addLast(entry);
        }
    }

    public String get(int key) {
        var entry = getEntry(key);
        return entry == null ? null : entry.value;
    }

    public void delete(int key) {
        var entry = getEntry(key);
        if (entry == null) throw new IllegalStateException();
        var bucket = getBucket(key);
        bucket.remove(entry);
    }

    private LinkedList<Entry> getOrCreateBucket(int key){
        var index = hash(key);
        if (entries[index] != null)
            return entries[index];
        entries[index] = new LinkedList<>();
        return entries[index];
    }

    private Entry getEntry(int key) {
        var bucket = getBucket(key);
        if (bucket != null) {
            for(var entry : bucket)
                if (entry.key == key)
                    return entry;
        }
        return null;
    }

    private LinkedList<Entry> getBucket(int key) {
        return entries[hash(key)];
    }

    private int hash(int key) {
        return key % size;
    }
}
