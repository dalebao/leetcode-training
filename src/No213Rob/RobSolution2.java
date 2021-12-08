package No213Rob;

public class RobSolution2 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        // 不偷第一间 范围是 1~ n-1
        // 偷 第一间 范围是 0 ~ n -2

        return Math.max(robRange(nums, 0, nums.length - 2), robRange(nums, 1, nums.length - 1));
    }

    public int robRange(int[] nums, int start, int end) {

        // dp[i] = max(dp[i-1],nums[i] + dp[i-2])
        // dp[]
        int first = nums[start];
        int second = Math.max(nums[start], nums[start + 1]);

        for (int i = start + 2; i < end; i++) {
            int tmp = second;
            second = Math.max(second, nums[i] + first);
            first = tmp;
        }
        return second;
    }
}
