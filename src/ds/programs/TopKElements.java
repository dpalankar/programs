package ds.programs;

import java.util.*;

public class TopKElements {


    public static List<Integer> topKLargest(int[] nums, int k) {
        if (k <= 0) {
            return Collections.emptyList();
        }
        
        // Min‑heap to keep track of the top k largest
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        
        for (int num : nums) {
            if (minHeap.size() < k) {
                // fill up the heap first
                minHeap.offer(num);
            } else if (num > minHeap.peek()) {
                // if current num is bigger than the smallest in heap,
                // pop the smallest and add the current
                minHeap.poll();
                minHeap.offer(num);
            }
        }
        
        // Extract results into a list
        return new ArrayList<>(minHeap);
    }
    
    public static void main(String[] args) {
        int[] nums = {4, 1, 7, 3, 8, 5, 2, 6};
        int k = 3;
        
        List<Integer> top3 = topKLargest(nums, k);
        System.out.println("Top " + k + " largest elements: " + top3);
        // Possible output: [6, 7, 8] (order not guaranteed)
    }
}
