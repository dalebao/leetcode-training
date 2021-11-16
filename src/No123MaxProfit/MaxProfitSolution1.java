package No123MaxProfit;

public class MaxProfitSolution1 {

    public int maxProfit(int[] prices) {
        int allMaxProfit = maxProfit(prices, 0, prices.length);
        for (int i = 2; i < prices.length; i++) {
            int maxProfit = maxProfit(prices, 0, i) + maxProfit(prices, i, prices.length);
            allMaxProfit = Math.max(maxProfit, allMaxProfit);
        }
        return allMaxProfit;
    }

    public int maxProfit(int[] prices, int start, int end) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = start; i < end; i++) {
            minPrice = Math.min(prices[i], minPrice);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }

}
