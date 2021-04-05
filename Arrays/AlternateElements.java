
/*
 	Given a array we need to print alternate numbers, starting from index 0;
 	Input: { 1, 2, 3, 4, 5, 6, 7}
 	Output: 1 3 5 7
 */

public class AlternateElements{
	static void alternate(int[] arr) {
		for(int i=0;i<arr.length;i+=2) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7};
		alternate(arr);
	}
}
