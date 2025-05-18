package ds.programs;

import java.util.Arrays;

public class PrefixSufixMul {
    public static int[] getOutput(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;

        for (int i = 1; i < n; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        System.out.println(Arrays.toString(result));
        int right = 1;
        for (int i=n-1; i >=0; i--) {
            result[i] = result[i] * right;
            right = right * nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Input :"+Arrays.toString(nums));
//        Output: {24, 12, 8, 6}
        System.out.println("Output :"+Arrays.toString(getOutput(nums)));
    }
}
