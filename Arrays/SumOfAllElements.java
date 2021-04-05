
/*
 	Given an Array of size n, we need to print the sum of all the elements in the array
 	Input: {2, 4, 1, 5}
 	Output: 12
 */

public class SumOfAllElements{
	static int sumOfElements(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
 public static void main(String[] args) {
	 int[] arr = {2, 5, 1, 99, 45, 23, 36, 0};
	 int sum = sumOfElements(arr);
	 System.out.println(sum);
	}
}
