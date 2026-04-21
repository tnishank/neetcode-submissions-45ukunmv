class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0], maxP = 0;

        for(int sell: prices) {
            if(sell < buy){
                buy = sell;
                continue;
            }

            maxP = Integer.max(maxP, sell-buy);
        }

        return maxP;
    }
}
