package No976LargestPerimeter;

import java.util.Arrays;

public class LargestPerimeterSolution {

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 1; i--) {
            // 三角形组成 两短边长相加大于第三边
            if (nums[i] < (nums[i - 1] + nums[i - 2])) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0;
    }
}
