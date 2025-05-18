package ds.programs;

import java.util.Arrays;

public class SlidingWindow {
    public static int slidingWindow(int[] nums,int size) {
        int length = nums.length;
        int max = 0;
        int windowsum =0;
        for (int i = 0; i < size; i++) {
            windowsum += nums[i];
        }

        int[] output = new int[length];
        output[size-1] = windowsum;
        for (int i = size; i < length; i++) {
            output[i] = output[i-1] + nums[i] - nums[i-size];
            if(output[i] >max)
                max =output[i];
        }
        System.out.println(Arrays.toString(output));
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8,4,9,5};
        System.out.println(slidingWindow(nums,1));
    }
}
