package datastructure.programs;

import java.util.*;

public class TransactionalHashMap<K, V> {
    private final Map<K, V> dataStore = new HashMap<>();
    private final Deque<Map<K, Optional<V>>> transactionStack = new ArrayDeque<>();

    // Start a new transaction
    public void begin() {
        transactionStack.push(new HashMap<>());
    }

    // Put value in current transaction or base map
    public void put(K key, V value) {
        if (!transactionStack.isEmpty()) {
            transactionStack.peek().put(key, Optional.ofNullable(value));
        } else {
            dataStore.put(key, value);
        }
    }

    // Delete a key
    public void delete(K key) {
        if (!transactionStack.isEmpty()) {
            transactionStack.peek().put(key, Optional.empty()); // Mark as deleted
        } else {
            dataStore.remove(key);
        }
    }

    // Get value, checking transaction stack first
    public V get(K key) {
        for (Map<K, Optional<V>> transaction : transactionStack) {
            if (transaction.containsKey(key)) {
                return transaction.get(key).orElse(null); // null if deleted
            }
        }
        return dataStore.get(key);
    }

    // Commit top transaction to the next level or base
    public boolean commit() {
        if (transactionStack.isEmpty()) {
            System.out.println("No transaction to commit.");
            return false;
        }

        Map<K, Optional<V>> current = transactionStack.pop();

        if (transactionStack.isEmpty()) {
            // Apply to base map
            for (Map.Entry<K, Optional<V>> entry : current.entrySet()) {
                if (entry.getValue().isPresent()) {
                    dataStore.put(entry.getKey(), entry.getValue().get());
                } else {
                    dataStore.remove(entry.getKey());
                }
            }
        } else {
            // Merge with next transaction
            transactionStack.peek().putAll(current);
        }

        return true;
    }

    // Discard current transaction
    public boolean rollback() {
        if (transactionStack.isEmpty()) {
            System.out.println("No transaction to rollback.");
            return false;
        }
        transactionStack.pop();
        return true;
    }

    // Print current state for debugging
    public void print() {
        System.out.println("Committed Data: " + dataStore);
        System.out.println("Transaction Stack:");
        for (Map<K, Optional<V>> tx : transactionStack) {
            System.out.println(tx);
        }
    }

    // Demo
    public static void main(String[] args) {
        TransactionalHashMap<String, String> map = new TransactionalHashMap<>();

        map.put("a", "1");
        map.put("b", "2");
        System.out.println("a = " + map.get("a")); // 1
        map.print();
        System.out.println("------------------------------------------");

        map.begin();
        map.put("a", "3");
        map.delete("b");
        System.out.println("a = " + map.get("a")); // 3
        System.out.println("b = " + map.get("b")); // null
        map.print();
        System.out.println("------------------------------------------");

        map.rollback();
        System.out.println("a = " + map.get("a")); // 1
        System.out.println("b = " + map.get("b")); // 2
        map.print();
        System.out.println("------------------------------------------");

        map.begin();
        map.delete("a");
        map.put("c","4");
        map.print();
        map.commit();
        System.out.println("a = " + map.get("a")); // null
        map.print();
        System.out.println("------------------------------------------");
    }
}
