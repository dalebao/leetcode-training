package No122maxProfit2;

public class MaxProfitSolution {

    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        // dp[i][0] 第i天 手上没有股票的最大利润
        // dp[i][1] 第i天 手上持有一直股票的最大利润

        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[prices.length - 1][0];
    }
}
