package MianshiNo16MaxSubArray;

public class MaxSubArraySolution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // 前面的和 加上当前的数， 若 和 小于当前数 抛弃之前的和，取当前数
            sum = Math.max(sum + nums[i], nums[i]);
            // 当前数于最大值比较，取最大值
            maxValue = Math.max(sum, maxValue);
        }
        return maxValue;
    }

}
