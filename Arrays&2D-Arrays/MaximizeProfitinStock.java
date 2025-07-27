//In this program i have use the logic of calculating the maximum profit while buying and selling the stock..
//profit = selling price - buy price , for profit selling price should be high and buyind price should be high


public class MaximizeProfitinStock {
    public static int MaxProfitofStock(int price[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for( int i = 0 ; i < price.length ; i++){
            if(buyprice < price[i] ){
                int profit = price[i] - buyprice;
                maxprofit = Math.max(maxprofit,profit);
            } else {
                buyprice = price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[]args){
        int prices[]={7,1,5,3,6,4};
        System.out.println("The maximum Profit is " + MaxProfitofStock(prices));
    }
    
}
