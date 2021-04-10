/*
Getting the maimum sum from a subarray and returning the max
A sub array is a array within the array which is contagious
*/

public class MaximumSubArray{
	static void bruteForceMethod(int[] arr,int n) {
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		int startIndex  =0;
		int endIndex = 0;
		
		for(int i=0;i<n;i++) {
			currentSum=0;
			for(int j=i;j<n;j++) {
				currentSum += arr[j];
				if(currentSum>=maxSum) {
					maxSum = currentSum;
					startIndex = i;
					endIndex = j;
				}
			}
		}
		System.out.println("MaxSum: " + maxSum);
		int sum=0;
		for(int i=startIndex;i<=endIndex;i++) {
			sum += arr[i];
			System.out.print(arr[i]+ " ");
			if(sum==maxSum) {
				break;
			}
		}
	}
	
	static void positiveMaximumSubArray(int[] arr,int n) {
		int max = Integer.MIN_VALUE;
		int currentSum  =0;
		int lastNegativeIndex = -1;
		int startIndex = 0;
		int lastIndex =0;
		
		for(int i=0;i<n;i++) {
			if(arr[i] < 0) {
				lastNegativeIndex = i;
				currentSum = 0;
				continue;
			}
			
			currentSum += arr[i];
			
			if(currentSum > max) {
				max = currentSum;
				startIndex = lastNegativeIndex + 1;
				lastIndex = i;
			}
			
			if(currentSum == max) {
				if((lastIndex-startIndex) < (i-(lastNegativeIndex+1)) ) {
					startIndex = lastNegativeIndex + 1;
					lastIndex = i;
				}
			}
		}
		if(max==Integer.MIN_VALUE) {
			System.out.print("No positive value");
		}
		else {
		System.out.println("Max: " + max);
		System.out.println("startIndex: " + startIndex + " lastIndex: " +lastIndex);
		}
	}
	
	static int kadanesAlgorithm(int[] arr,int n) {
		int max = Integer.MIN_VALUE;
		int current = 0;
		
		for(int i=0;i<n;i++) {
			current += arr[i];
			if(current>max) {
				max = current;
			}
			
			if(current<0) {
				current = 0;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		
		int[] arr = {-5 ,4 ,-11 ,-15 ,4 ,8 ,-3 ,-10 ,5 ,12 ,-19 ,-12 ,-2 ,10 ,6 ,-14 ,-4 ,8 ,13 ,5 ,-8 ,-18 ,4 ,-15 ,17 ,-12 ,-13 ,7 ,16 ,-14 ,-4 ,-15 ,7 ,2 ,2 ,20 ,3,-23};
		
		bruteForceMethod(arr,arr.length);
		positiveMaximumSubArray(arr,arr.length);
		
	}
}
