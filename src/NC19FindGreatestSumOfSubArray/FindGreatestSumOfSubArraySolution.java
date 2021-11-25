package NC19FindGreatestSumOfSubArray;

public class FindGreatestSumOfSubArraySolution {

    public int FindGreatestSumOfSubArray(int[] array) {
        int max = Integer.MIN_VALUE;
        // i -> j 的值 == i -> (j-1) + (j) 的值
        int[][] dp = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            dp[i][i] = array[i];
            max = Math.max(dp[i][i], max);
            for (int j = i + 1; j < array.length; j++) {
                dp[i][j] = array[j] + dp[i][j - 1];

                max = Math.max(dp[i][j], max);
            }
        }
        return max;
    }


    public int FindGreatestSumOfSubArray1(int[] array) {
        int max = Integer.MIN_VALUE;
        // i -> j 的值 == i -> (j-1) + (j) 的值
        // i -> j 的值 等于 sum(j) - sum(i)
        if (array.length < 1) {
            return 0;
        }
        int[] dp = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            dp[i+1] = array[i] + dp[i];
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j <= array.length; j++) {
                max = Math.max(dp[j] - dp[i], max);
            }
        }

        return max;
    }
}
