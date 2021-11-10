package No26RemoveDuplicates;

import java.util.Arrays;

public class RemoveDuplicatesSolution {

    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length - 1 - j; ) {
            if (nums[i] == nums[i + 1]) {
                // duplicates
                int n = i + 1;
                while (n < nums.length - j - 1) {
                    nums[n] = nums[n + 1];
                    n++;
                }
                j++;
            } else {
                i++;
            }
        }

        return nums.length - j;
    }

    public static void main(String[] args) {
        RemoveDuplicatesSolution removeDuplicatesSolution = new RemoveDuplicatesSolution();
        int[] nums = new int[6];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 1;
        nums[3] = 1;
        nums[4] = 3;
        nums[5] = 3;

        System.out.println(removeDuplicatesSolution.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));


    }
}
