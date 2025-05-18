package datastructure.programs;

import java.util.HashMap;
import java.util.Map;

public class LRUCache1<K,V> {
    private final int capacity;
    private final Map<K, Node> map;
    private final Node head, tail;

    public LRUCache1(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();

        // Dummy head and tail nodes
        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    public V get(K key) {
        if (!map.containsKey(key)) {
            return null;
        }
        Node node = map.get(key);
        moveToFront(node);
        return (V) node.value;
    }

    public void put(K key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            moveToFront(node);
        } else {
            if (map.size() >= capacity) {
                Node lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addToFront(newNode);
        }
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Node class for doubly linked list
    private static class Node <K,V>{
        K key;
        V value;
        Node prev, next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private void addToFront(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    private void moveToFront(Node node) {
        remove(node);
        addToFront(node);
    }

    public void printCache() {
        System.out.println("----------------------------");
        for (Map.Entry<K, Node> entry : map.entrySet()) {
            K key = entry.getKey();
            Node node = entry.getValue();
            System.out.print("[" + node.key.toString() + "=" + node.value.toString() + "] ");
        }
        System.out.println("\n----------------------------");
    }

}
