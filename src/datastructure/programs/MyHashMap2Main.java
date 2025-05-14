package datastructure.programs;

//Resizing is triggered when load factor exceeds 0.75 (typical for Java HashMap).
//Uses separate chaining to avoid collisions via linked list at each bucket.
//Performance remains decent even after scaling due to resizing.

public class MyHashMap2Main {
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
