public class bestTimetoBuyandSellStocks {
    public static int maxProfit(int[] prices)
    {
        int bestBuy = prices[0];
        int maxProfit = 0;

        for(int i =0;i<prices.length;i++)
        {
            if(prices[i]<bestBuy)
            {
                bestBuy=prices[i];
            }
            //todays profit 
            int profit = prices[i]-bestBuy;

            if(profit>maxProfit)
            {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args)
    {
        int [] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println("Maximum profit is: " + result);
    }
    
}
