/*
In insertion sort, the array is divided in two parts left sorted array and right unsorted array
In left sorted array, every time a new element is added it is compare with the rightmost element of sorted array
If it is bigger than the new element and the current comparing index of sorted array is bigger than equal to )
The left sorted element is shift one to right;
and when the while loop stop the index j pointing in sorted array is changed to the key
*/

public class InsertionSort{
	public static int[] sort(int[] arr) {
		int n = arr.length;
		for(int i=1;i<n;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = key;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,10,9};
		arr = sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
