package datastructure.programs;

public class ExampleMap1 implements MyHash{
    private int CAPACITY=16;

    Node[] buckets;
    public ExampleMap1() {
        buckets = new Node[CAPACITY];
    }

    private static class Node{
        int key;
        int value;

        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }




    private int getBucketIndex(int key) {
        return Integer.hashCode(key) % CAPACITY;
    }

    @Override
    public int put(int key, int value) {
        int index = getBucketIndex(key);
        Node current = buckets[index];

        // Update value if key already exists
        while(current !=null) {
            if (current.key == key) {
                current.value = value;
                return value;
            }
            current = current.next;
        }

        Node newNode = new Node(key,value);
        newNode.next = buckets[index];
        buckets[index] = newNode;

        return -1;
    }

    @Override
    public int get(int key) {
        int index = getBucketIndex(key);
        Node current = buckets[index];

        while(current!=null){
            if(current.key== key){
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
        Node prev =null;
        while(current !=null){
            if(current.key==key){
                if(prev == null){
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


    public static void main(String[] args) {
        MyHash map = new ExampleMap1();
        map.put(1,10);
        map.put(1,20);
        map.put(0,10);
        map.put(16,20);
        map.put(32,20);
        map.remove(16);
        System.out.println(map.get(16));

    }
}
