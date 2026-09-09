class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyRate = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i] > buyRate){
                maxProfit = Math.max(maxProfit,prices[i] - buyRate);
            }
            buyRate = Math.min(buyRate,prices[i]);
        }
        return maxProfit;
    }
}