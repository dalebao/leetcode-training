package No121MaxProfit;

public class MaxProfitSolution {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;

        for (int price : prices) {
            minValue = Math.min(minValue, price);
            maxProfit = Math.max(price - minValue, maxProfit);
        }

        return maxProfit;
    }
}
