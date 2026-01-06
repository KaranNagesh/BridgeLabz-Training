package hashmapandhashfunction;


import java.util.LinkedList;

class CustomHashMap {

    // Node to store key-value pairs
    private static class Entry {
        int key;
        int value;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private LinkedList<Entry>[] table;

    // Constructor
    @SuppressWarnings("unchecked")
    public CustomHashMap(int capacity) {
        this.capacity = capacity;
        table = new LinkedList[capacity];

        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int hash(int key) {
        return key % capacity;
    }

    // Insert or update key-value pair
    public void put(int key, int value) {
        int index = hash(key);
        LinkedList<Entry> bucket = table[index];

        for (Entry entry : bucket) {
            if (entry.key == key) {
                entry.value = value;   // Update existing value
                return;
            }
        }

        bucket.add(new Entry(key, value)); // Insert new entry
    }

    // Retrieve value by key
    public Integer get(int key) {
        int index = hash(key);
        LinkedList<Entry> bucket = table[index];

        for (Entry entry : bucket) {
            if (entry.key == key) {
                return entry.value;
            }
        }

        return null; // Key not found
    }

    // Remove key-value pair
    public void remove(int key) {
        int index = hash(key);
        LinkedList<Entry> bucket = table[index];

        for (Entry entry : bucket) {
            if (entry.key == key) {
                bucket.remove(entry);
                return;
            }
        }
    }
}