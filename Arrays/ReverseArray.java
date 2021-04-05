
/*
 	Given an Array, we need to print the elements of Array in reverse order
 	Input: {2, 5, 1, 99, 45, 23, 36, 0}
 	Output: 0 36 23 45 99 1 5 2
 */

public class ReverseArray{
	static void reverseArray(int[] arr){
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
	}
 public static void main(String[] args) {
	 int[] arr = {2, 5, 1, 99, 45, 23, 36, 0};
	 reverseArray(arr);
	}
}
