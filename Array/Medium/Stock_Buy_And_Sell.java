package Array.Medium;

public class Stock_Buy_And_Sell {
    public int maxProfit(int[] prices) {
        int BuyingPrice = prices[0];
        int Profit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i] < BuyingPrice){
                BuyingPrice = prices[i];
            }else if(prices[i] - BuyingPrice > Profit){
                Profit = prices[i] - BuyingPrice;
            }
        }

        return Profit;
    }
}
