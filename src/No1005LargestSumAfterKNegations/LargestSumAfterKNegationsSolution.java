package No1005LargestSumAfterKNegations;

import java.util.Arrays;

public class LargestSumAfterKNegationsSolution {

    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int min = Integer.MAX_VALUE;
        while (k > 0 && i < nums.length) {
            if (nums[i] <= 0) {
                nums[i] = -nums[i];
                min = Math.min(min, nums[i]);
                k--;
                i++;
            } else {
                min = Math.min(min, nums[i]);
                break;
            }
        }
        if (k % 2 == 1) {
            min = -2 * min;
        }
        int r = min;
        for (int j = 0; j < nums.length; j++) {
            r += nums[j];
        }

        return r;
    }

    public static void main(String[] args) {
        System.out.println(3%2);
    }
}
