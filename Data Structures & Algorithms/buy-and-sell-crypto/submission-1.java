class Solution {
    public int maxProfit(int[] prices) {
        int smallest = prices[0];
        int ans = 0;
        for(int num : prices) {
            if (smallest > num)
                smallest = num;
            int profit = num - smallest;
            if(profit > ans)
              ans = profit;

        }
        return ans; 
    }
}
