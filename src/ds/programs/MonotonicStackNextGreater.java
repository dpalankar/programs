package ds.programs;

import java.util.Arrays;
import java.util.Stack;

public class MonotonicStackNextGreater {
    public static int[] nextGreater(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = nums[i];
            }
            stack.push(i);
        }
        // Any indices left in stack have no greater element to their right → result already -1
        return result;
    }

    public static int[] nextSmaller(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[i] < nums[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = nums[i];
            }
            stack.push(i);
        }
        // Any indices left in stack have no greater element to their right → result already -1
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 3, 7, 1, 4};
//        int[] nge = nextGreater(nums);
//        System.out.println("nums: " + Arrays.toString(nums));
//        System.out.println("next greater: " + Arrays.toString(nge));
        // Output:
        // nums:         [2, 5, 3, 7, 1, 4]
        // next greater: [5, 7, 7, -1, 4, -1]
        // nums:         [2, 5, 3, 7, 1, 4]
        // next smaller: [1, 3, 1, 1, -1, -1]

        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("next greater: " + Arrays.toString(nextSmaller(nums)));
    }
}
