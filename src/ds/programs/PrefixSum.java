package ds.programs;

import java.util.Arrays;

public class PrefixSum {

    public static int[] computePrefixSum(int[] nums) {
//        int[] prefix = new int[nums.length];
//        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
//            prefix[i] = prefix[i - 1] + nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8};
        System.out.println(Arrays.toString(computePrefixSum(nums)));
    }

}
