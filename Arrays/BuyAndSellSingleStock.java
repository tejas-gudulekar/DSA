/*
Given an array of stocks price, we need to find a perfect day for buying a single stock and selling it for maximum profit
*/
public class BuyAndSellSingleStock{
	static void getMaxProfit(int[] arr,int n) {
		int min_buy_price = Integer.MAX_VALUE;
		int profit = 0;
		int sell_on = 0;
		int buy_on = 0;
		int min_index = 0;
		
		for(int i=0;i<n;i++) {
			if(arr[i] < min_buy_price) {
				min_buy_price = arr[i];
				min_index = i;
			}
			
			if(arr[i]- min_buy_price > profit) {
				profit = (arr[i]- min_buy_price);
				sell_on = i;
				buy_on = min_index;
			}
		}
		
		System.out.println("Buy on: " + buy_on + " Sell on: " + sell_on + " for maximum profit of " + profit);
	}
	public static void main(String[] args) {
		int[] arr = {0,5,2,198,1,7,4,9,5};
		getMaxProfit(arr,arr.length);
		
	}
}}
