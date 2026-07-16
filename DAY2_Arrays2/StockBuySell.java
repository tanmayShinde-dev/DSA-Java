public class StockBuySell{

    public static int StockBuySell(int prices[]){
        int maxProfit=0;
        int buyingPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length; i++){
            if(buyingPrice < prices[i]){
                int profit = prices[i]-buyingPrice;
                    maxProfit=Math.max(profit, maxProfit);
            }else{
                buyingPrice=prices[i];
            }
        }
        return maxProfit;
    }
    
    public static void main(String args[]){
        int prices[]= {7,1,5,3,6,4};
        System.out.println("maximum profit through this fluctuations one can have is:"+ StockBuySell(prices));
    }
}