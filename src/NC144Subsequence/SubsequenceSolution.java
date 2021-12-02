package NC144Subsequence;

public class SubsequenceSolution {

    public long subsequence(int n, int[] array) {
        // write code here
        if (n < 1) {
            return 0;
        }
        // dp[i] 表示 前i个中 和最大的值
        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = Math.max(0,array[0]);

        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + array[i-1]);
        }
        return dp[n];
    }
}
