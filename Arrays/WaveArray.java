
/*
 Given an sorted array we need to print a wave like structure i.e a[i]>a[i+1]<a[i+2]>a[i+3]
 Input: {1, 2, 3, 4, 5}
 Output: 2 1 4 3 5
 */

public class WaveArray{
	static int[] waveArray(int[] arr) {
		int i=0;
		int j=1;
		while(j<arr.length) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i+= 2;
			j += 2;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6};
		arr = waveArray(arr);
		for(int e: arr) {
			System.out.print(e+" ");
		}
	}
}
