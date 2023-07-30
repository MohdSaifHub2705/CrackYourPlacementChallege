class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int currentDay = 1; currentDay < prices.length; currentDay++) {
           if(prices[currentDay] > prices[currentDay-1]) {
              profit += prices[currentDay]-prices[currentDay-1];
           }
        }
        return profit;
    }
}
