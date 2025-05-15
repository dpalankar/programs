package datastructure.programs;

public class MyHashMap1 implements MyHash {

    private static final int SIZE = 16;  // Initial size of the bucket array
    private Node[] buckets;

    public MyHashMap1() {
        buckets = new Node[SIZE];
    }

    private static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int getBucketIndex(int key) {
        return Integer.hashCode(key) % SIZE;
    }

    @Override
    public int get(int key) {
        int index = getBucketIndex(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return -1; // not found
    }

    @Override
    public void remove(int key) {
        int index = getBucketIndex(key);
        Node current = buckets[index];
        Node prev = null;

        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    @Override
    public int put(int key, int value) {
        int index = getBucketIndex(key);
        Node current = buckets[index];

        // Update value if key already exists
        while (current != null) {
            if (current.key == key) {
                int oldValue = current.value;
                current.value = value;
                return oldValue;
            }
            current = current.next;
        }

        // Insert new node
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;

        return -1; // key did not exist before
    }
    public static void main(String[] args) {
        MyHash map = new MyHashMap1();
        map.put(1, 10);
        map.put(2, 20);
        System.out.println(map.get(1));  // Output: 10
        map.remove(1);
        System.out.println(map.get(1));  // Output: -1
    }

}
