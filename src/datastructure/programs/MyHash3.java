package datastructure.programs;

public interface MyHash3<K, V> {
    V get(K key);
    void remove(K key);
    V put(K key, V value);
}
