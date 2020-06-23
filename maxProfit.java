/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction 
(i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.
Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
*/

class Solution {
    // public int maxProfit(int[] prices) {
    //     int min = Integer.MAX_VALUE;
    //     int max = 0;
        
    //     for(int i = 0; i < prices.length; i++){
    //         min = Math.min(min, prices[i]);
    //         max = Math.max(max, prices[i] - min);
    //     }
        
    //     return max;
    // }

    public int maxProfit(int[] prices){
        int n =prices.length, maxProfitSoFar = 0;
        int[] maxIncDiffSum = new int[n];

        for(int i = 1; i < n; i++){
            maxIncDiffSum[i] =Math.max(0, maxIncDiffSum[i-1] + prices[i] - prices[i-1]);
            maxProfitSoFar = Math.max(maxProfitSoFar, maxIncDiffSum[i]);
        }

        return maxProfitSoFar
    }
}

