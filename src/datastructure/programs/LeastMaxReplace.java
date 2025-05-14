package datastructure.programs;

import java.util.Arrays;

public class LeastMaxReplace {
    public static int[] replaceWithLeastMax(int[] arr1, int[] arr2) {
        Arrays.sort(arr1); // sort for predictable order
        int[] result = new int[arr2.length];

        for (int i = 0; i < arr2.length; i++) {
            result[i] = findLeastMax(arr1, arr2[i]);
        }

        return result;
    }

    private static int findLeastMax(int[] sortedArr, int target) {
        for (int j : sortedArr) {
            if (j > target) {
                return j; // return the first element ≥ target
            }
        }
        return target; // no element ≥ target, return original
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 7, 5};
        int[] arr2 = {2, 4, 6, 8};
        int[] output = replaceWithLeastMax(arr1, arr2);

        System.out.println(Arrays.toString(output)); // Output: [3, 5, 7, 8]
    }
}
