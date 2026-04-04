class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buying=prices[0];
        for(int i=1;i<prices.length;i++){
            int selling=prices[i];
            if(selling-buying>=0){
                profit=Math.max(profit,selling-buying);
            }
            buying=Math.min(buying,prices[i]);
        }
        return profit;
    }
}