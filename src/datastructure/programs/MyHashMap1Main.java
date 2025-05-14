package datastructure.programs;

public class MyHashMap1Main {
    public static void main(String[] args) {
        MyHash map = new MyHashMap1();
        map.put(1, 10);
        map.put(2, 20);
        System.out.println(map.get(1));  // Output: 10
        map.remove(1);
        System.out.println(map.get(1));  // Output: -1
    }
}
