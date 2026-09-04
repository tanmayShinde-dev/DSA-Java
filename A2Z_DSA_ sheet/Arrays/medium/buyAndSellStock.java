public class buyAndSellStock {
    
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            int profit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit, profit);

            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }

}



// Interview explanation

// “In the optimal approach, I maintain the minimum stock price seen so far. For every day,
//  I calculate the profit by selling the stock at the current price and buying it at the
//   minimum price seen before. I update the maximum profit whenever I find a better profit,
//    and then update the minimum price. This allows me to find the maximum profit in a single traversal.”

// TC & SC
// TC: O(n) — we traverse the array only once.
// SC: O(1) — we use only minPrice, profit, and maxProfit.