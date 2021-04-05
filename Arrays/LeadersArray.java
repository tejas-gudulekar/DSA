
/*
Given an Array return all the element which is greater than all the elements at their right;
Input: {16,17,4,3,5,2}
Output: 2 5 17
 */

public class LeadersArray{
	static void leader(int[] arr) {
		int n = arr.length;
	
		int max = Integer.MIN_VALUE;
		for(int i=n-1;i>=0;i--) {
			if(arr[i] > max) {
				max = arr[i];
				System.out.print(max+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {16,17,4,3,5,2};
		leader(arr);
	}
}
