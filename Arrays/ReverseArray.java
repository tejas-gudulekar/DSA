/*
Problem: Printing the array elements in reverse order
Input : {1,2,3,4,5}
Output: {5,4,3,2,1}
*/

public class ReverseArray{
	static void reverseArray(int[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34, 1};
		reverseArray(arr);
		
		}
}
