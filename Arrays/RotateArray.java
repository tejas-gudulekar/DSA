
/*
 Given an array and integer d, rotate the array clockwise for d times;
 Input: {27, 2, 43, 78, 1, 10, 99, 5, 108} d = 3;
 Output: 78 1 10 99 5 108 27 2 43 
 */

public class RotateArray{
	static int[] rotateArray(int[] arr,int n,int d) {
		int[] tempArr = new int[d];
		
		//Coping elements till d index into tempArray;
		for(int i=0;i<d;i++) {
			tempArr[i] = arr[i];
		}
		
		//Shifting the Array to the left
		for(int i=d;i<n;i++) {
			arr[i-d] = arr[i];
		}
		
		//Adding the elements from tempArray to the original array
		for(int i=0;i<d;i++) {
			arr[n-d+i] = tempArr[i];
		}
		
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {27, 2, 43, 78, 1, 10, 99, 5, 108, 102};
		int d = 2;
		arr = rotateArray(arr,arr.length,d);
		for(int e: arr) {
			System.out.print(e + " ");
		}
	}
}
