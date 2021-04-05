
/*
 Given an array we need to return the second largest element in the array
 Input: {10 7 2 10}
 Output: 7
 */

public class SecondLargest{
	static void secondLargest(int[] arr) {
		int first,second;
		first = second = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second = first;
				first = arr[i];
			}
			else if(arr[i]>second && arr[i]!=first) {
				second = arr[i];
			}
		}
		
		if(second==Integer.MIN_VALUE) {
			System.out.println("Second Element does not exist");
		}
		else {
			System.out.println("Second Largest Element in given array: " + second);
		}
	}
	public static void main(String[] args) {
		int[] arr = {10 ,7 ,2 ,10};
		secondLargest(arr);
		
	}
}
