package datastructure.programs;

import java.util.Objects;

public class MyHashMap3<K, V> implements MyHash3<K, V> {
    
    private static final int SIZE = 16;  // Initial size of the bucket array
    private Node<K,V>[] buckets;

    public MyHashMap3() {
        buckets = new Node[SIZE];
    }

    private static class Node<K,V> {
        K key;
        V value;
        Node<K,V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int getBucketIndex(K key) {
        return Integer.hashCode(Objects.hashCode(key)) % SIZE;
    }

    @Override
    public V get(K key) {
        int index = getBucketIndex(key);
        Node<K,V> current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null; // not found
    }

    @Override
    public void remove(K key) {
        int index = getBucketIndex(key);
        Node<K,V> current = buckets[index];
        Node<K,V> prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
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
    public V put(K key, V value) {
        int index = getBucketIndex(key);
        Node<K,V> current = buckets[index];

        // Update value if key already exists
        while (current != null) {
            if (current.key.equals(key)) {
                V oldValue = current.value;
                current.value = value;
                return oldValue;
            }
            current = current.next;
        }

        // Insert new node
        Node<K,V> newNode = new Node<>(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;

        return null; // key did not exist before
    }

    public static void main(String[] args) {
        MyHash3 map = new MyHashMap3();
        map.put(0, 0);
        map.put(16, 16);
        map.put(32, 32);
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(4, 40);
        System.out.println(map.get(1));  // Output: 10
        map.remove(1);
        System.out.println(map.get(1));  // Output: -1

        MyHash3 map2 = new MyHashMap3();
        map2.put("abc","ABC");
        map2.put("pqr","PQR");
        map2.put("xyz","XYZ");

        System.out.println(map2.get("pqr"));  // Output: PQR
        map2.remove("pqr");
        System.out.println(map2.get(1));  // Output: null

    }
}
