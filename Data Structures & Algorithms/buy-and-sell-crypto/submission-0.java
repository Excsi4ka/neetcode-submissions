class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int sell = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if (price < sell)
                sell = price;
            if(price - sell > profit)
            profit = price - sell;
        }
        return profit;
    }
}
