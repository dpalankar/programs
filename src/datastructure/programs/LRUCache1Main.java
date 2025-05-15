package datastructure.programs;

public class LRUCache1Main {
    // -------- Main method to test LRUCache ----------
    public static void main(String[] args) {
        LRUCache1 cache = new LRUCache1(2); // Capacity = 2

        System.out.println("Put(1, 1)");
        cache.put(1, 1);

        System.out.println("Put(2, 2)");
        cache.put(2, 2);

        System.out.println("Get(1): " + cache.get(1)); // returns 1

        System.out.println("Put(3, 3)");
        cache.put(3, 3);    // evicts key 2

        System.out.println("Get(2): " + cache.get(2)); // returns -1 (not found)

        System.out.println("Put(4, 4)");
        cache.put(4, 4);    // evicts key 1

        System.out.println("Get(1): " + cache.get(1)); // returns -1 (not found)
        System.out.println("Get(3): " + cache.get(3)); // returns 3
        System.out.println("Get(4): " + cache.get(4)); // returns 4
    }
}
