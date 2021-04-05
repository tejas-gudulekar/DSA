
/*
 	Given an unsorted array we need to return the Max and Min Element from the array;
 	TimeComplexity should be of O(n);
 	Input: {2, 5, 1, 99, 45, 23, 36, 0};
 	Output: 0 99
 */
public class Arrays{
	static void MinMax(int[] arr){
		int min = arr[0];
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<min) {
				min = arr[i];
			}
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("Min: " + min + " Max: " + max);
	}
 public static void main(String[] args) {
	 int[] arr = {2, 5, 1, 99, 45, 23, 36, 0};
	 MinMax(arr);
 	}
}
