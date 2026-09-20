class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 0;
        int total = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[buy] > prices[i] && (prices[i] - prices[buy] > prices[sell] - prices[buy])) {
                buy = i;
                sell = i;
            }
            int profit = prices[i] - prices[buy];
            if (profit > prices[sell] - prices[buy]) {
                sell = i;
            } else {
                total += prices[sell] - prices[buy];
                buy = i;
                sell = i;
            }
        }
        return total + prices[sell] - prices[buy];
    }
}