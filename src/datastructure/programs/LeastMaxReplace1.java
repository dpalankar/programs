package datastructure.programs;

import java.util.Arrays;

public class LeastMaxReplace1 {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 7, 5};
        int[] arr2 = {2, 4, 6, 8};

        int[] result = replaceWithLeastMax(arr1, arr2);

        System.out.println(Arrays.toString(result)); // Output: [3, 4, 7, 8]
    }

    private static int[] replaceWithLeastMax(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] >= arr2[i]) {
                result[i] = arr1[i];
            } else {
                result[i] = arr2[i];
            }
        }
        return result;
    }
}
