package datastructure.programs;

//Notes
//This is a basic implementation and does not handle resizing (rehashing) when the load factor increases.
//You can add this functionality by tracking the number of entries and expanding the bucket array when necessary.
//Uses separate chaining (linked list) for collision resolution.

public class MyHashMap3Main {
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
