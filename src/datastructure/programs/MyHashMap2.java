package datastructure.programs;

public class MyHashMap2 implements MyHash {

    private static final float LOAD_FACTOR = 0.75f;
    private int capacity = 16;
    private int size = 0;
    private Node[] buckets;

    public MyHashMap2() {
        buckets = new Node[capacity];
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
        return Integer.hashCode(key) % capacity;
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
        return -1;
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
                size--;
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

        while (current != null) {
            if (current.key == key) {
                int oldValue = current.value;
                current.value = value;
                return oldValue;
            }
            current = current.next;
        }

        // Insert at head
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;

        // Resize if needed
        if ((float) size / capacity > LOAD_FACTOR) {
            resize();
        }

        return -1;
    }

    private void resize() {
        capacity *= 2;
        Node[] oldBuckets = buckets;
        buckets = new Node[capacity];
        size = 0;

        for (Node head : oldBuckets) {
            while (head != null) {
                put(head.key, head.value);  // rehash
                head = head.next;
            }
        }
    }

    public static void main(String[] args) {
        MyHash map = new MyHashMap2();

        for (int i = 0; i < 20; i++) {
            map.put(i, i * 100);
        }

        System.out.println("Value at key 5: " + map.get(5));
        System.out.println("Value at key 15: " + map.get(15));
        map.remove(5);
        System.out.println("Value at key 5 after removal: " + map.get(5));
    }
}
