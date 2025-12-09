class 121_Best_Time_To_Buy_And_Sell_Stock {
    public int maxProfit(int[] prices) {
    
      int min = prices[0];
      int profit = 0;
      for(int p : prices){
        min = Math.min(min,p);
        profit = Math.max(profit, p - min);
      }
      return profit;
    }

}