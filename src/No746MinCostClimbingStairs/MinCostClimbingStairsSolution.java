package No746MinCostClimbingStairs;

public class MinCostClimbingStairsSolution {

    public int minCostClimbingStairs(int[] cost) {
        // dp[i] 表达为爬上 i 阶梯需要花费的最小代价
        // dp[i] = min(dp[i-1],dp[i-2])+cost[i]
        if (cost.length == 0) {
            return 0;
        }
        if (cost.length == 1) {
            return 0;
        }
        if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }

        int[] dp = new int[cost.length];

        dp[0] = 0;
        dp[1] = Math.min(cost[0], cost[1]);

        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(cost[i] + dp[i - 1], cost[i] + dp[i - 2]);
        }

        return dp[cost.length - 1];
    }
}
