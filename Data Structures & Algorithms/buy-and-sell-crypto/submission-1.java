class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = l + 1;

        if (prices.length == 1) {
            return 0;
        }
        int maxNum = 0;
        while (l < r && r < prices.length) {
            
            int profit = prices[r] - prices[l];

            if (profit < 0) {
                l = r;
                r += 1;
                continue;
            }
            maxNum = Math.max(profit, maxNum);
            r++;
            

        }
        return maxNum;
    }
}
//[10,1,5,6,7,1]
// l  r
//profit = -9
//we keep going

//[10,1,5,6,7,1]
//