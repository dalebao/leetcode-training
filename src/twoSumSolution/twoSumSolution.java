package twoSumSolution;

import java.util.Arrays;

public class twoSumSolution {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int one = 0;
        for (; one < nums.length; one++) {
            int tmp = target - nums[one];
            for (int j = one + 1; j < nums.length; j++) {
                if (tmp == nums[j]) {
                    return new int[]{one, j};
                }
            }
        }
        return new int[2];
    }
}
