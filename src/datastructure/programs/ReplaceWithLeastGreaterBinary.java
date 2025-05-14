package datastructure.programs;

import java.util.Arrays;

public class ReplaceWithLeastGreaterBinary {

    public static int[] replace(int[] arr1, int[] arr2) {
        Arrays.sort(arr1); // Required for binary search
        int[] result = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            result[i] = findLeastGreater(arr1, arr2[i]);
        }
        return result;
    }

    // Binary search: Find the smallest element > target
    private static int findLeastGreater(int[] sortedArr, int target) {
        int low = 0, high = sortedArr.length - 1;
        int answer = target; // Default to original if not found
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedArr[mid] > target) {
                answer = sortedArr[mid];  // potential answer
                high = mid - 1;           // search on left for smaller valid value
            } else {
                low = mid + 1;            // discard left half
            }
        }
        return (answer > target) ? answer : target;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 7, 5};
        int[] arr2 = {2, 4, 6, 8};

        int[] output = replace(arr1, arr2);
        System.out.println(Arrays.toString(output)); // Output: [3, 5, 7, 8]
    }
}
