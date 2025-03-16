class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int maxprofit=0;
        int minSofar=prices[0];
        
        for(int i=1;i<prices.length;i++){
            minSofar=Math.min(minSofar,prices[i]);
            profit=prices[i]-minSofar;
            maxprofit=Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minSofar=prices[0];

        for(int i=0;i<prices.length;i++){
            minSofar=Math.min(minSofar,prices[i]);
            int profit=prices[i]-minSofar;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
