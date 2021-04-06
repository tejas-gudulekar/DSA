/*
Given an array of size n, and all the elements within the array are less than n, we need to print the frequency of all the elements from 0..n
Input: 2,4,3,3,3,3
Output: 0 1 4 1 0 0 
*/

import java.util.HashMap;

public class Frequency{
	void getFreqncy(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i],1);
			}
			else {
				int frequency = map.get(arr[i]);
				frequency++;
				map.put(arr[i], frequency);
			}
		}
		
		//Printing the frequency
		for(int i=1;i<=arr.length;i++) {
			if(!map.containsKey(i)) {
				System.out.print(0 + " ");
			}
			else {
				System.out.print(map.get(i) + " ");
			}
		}
	}
	public static void main(String[] args) {
		int[]arr = {3,3,3,3};
		Frequency f = new Frequency();
		f.getFreqncy(arr);
	}
}
