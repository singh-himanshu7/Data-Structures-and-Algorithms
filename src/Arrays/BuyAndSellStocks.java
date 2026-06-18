package Arrays;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(min > prices[i]){
                min = prices[i];
            }
            else {
                int profit = prices[i]-min;

                if(profit>maxProfit){
                    maxProfit = profit;
                }
            }
        }
    return maxProfit;}
}
