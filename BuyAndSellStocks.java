/*
Given an array of stocks, we can buy multiple stocks we need to buy and sell stocks such that we obtain maximum profit
*/

public class BuyAndSellStocks{
	static void maxProfit(int[] arr,int n) {
		int buy = 0;
		int sell = 0;
		int maxProfit = 0;
		
		for(int i=0;i<n;i++) {
			if((arr[i]-arr[buy]) > maxProfit) {
				
				maxProfit = arr[i]-arr[buy];
				sell++;
			
				continue;
			}
			
			if((arr[i]-arr[buy]) <= maxProfit) {
				if(buy!=sell) {
					System.out.println("Buy :" + buy + " Sell:" + sell);
				}
				buy = i;
				sell = i;
				maxProfit = 0;
			}
			
		}
		if(buy!=sell) {
			System.out.println("Buy :" + buy + " Sell:" + sell);
		}
		
		
	}
	public static void main(String[] args) {
		//int[] arr = {6764, 3645, 5181 ,5893 ,4542 ,6753 ,3996 ,5483,585 ,9895 ,2657 ,777 ,1343 ,4605 ,261 ,2225 ,959 ,9884 ,563 ,4131 ,6687 ,7528 ,6224, 436 ,3333, 110, 2037 ,7007 ,4710, 2310 ,7596 ,7827, 2307 ,9129, 72 ,3202, 2234 ,4069 ,5037 ,2819 ,3964, 7694 ,9948, 5307 ,8652 ,6561, 7532 ,9611 ,6445, 8095, 94, 9484, 1975, 6319 ,9920 ,5308 ,6429 ,1958, 8668, 7491, 620, 6264, 5318, 2927, 1745, 5391, 6129, 3979, 5812 ,1167 ,3150 ,9776 ,8861 ,3098, 5083, 3865 ,9659 ,8968 ,3476 ,6104 ,3415 ,9923 ,1940 ,1743 ,6242 ,1861 ,3403 ,9023 ,3819};
		//int[] arr = {688, 7369 ,7917 ,9917 ,6996 ,3324 ,7743 ,9470 ,2183 ,8490 ,5499 ,9772 ,6725 ,5644 ,5590 ,7505 ,8139 ,2954 ,9786 ,7669 ,8082 ,8542,8464 ,197 ,9507 ,9355 ,8804 ,6348 ,8611};
		int[] arr = {100, 180, 260, 310, 40, 535, 695};
		maxProfit(arr,arr.length);
	}
}
