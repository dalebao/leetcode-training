package No215FindKthLargest;

import java.util.Arrays;

public class FindKthLargestSolution {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 0; i--) {
            if (k == 0) {
                return nums[i];
            }
            k--;
        }
        return 0;
    }
}
