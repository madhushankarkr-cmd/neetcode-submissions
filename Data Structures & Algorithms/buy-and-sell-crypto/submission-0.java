class Solution {
    public int maxProfit(int[] prices) {
        int min_prices = prices[0];
        int profit = 0;
        int n = prices.length;
        for(int i = 1;i<n;i++){
            if(prices[i]<min_prices){
                min_prices = prices[i];
            }
            int current_profit = prices[i] - min_prices;
            
            if(current_profit > profit ){
                profit = current_profit;
            }
        }
        return profit;
    }
}
