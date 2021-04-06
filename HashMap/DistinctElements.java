/*
Given an N x N array,we need to print the element which are presented in every row
Input:  {{12, 1, 14, 3, 16},
			   {14, 2, 1, 3, 35},
			   {14, 1, 14, 3, 11},
			   {14, 5, 3, 2, 1},
			   {1, 18, 3, 21, 14}};
 
 Output: 1 3 14
 
 Logic: Sort every nested array, traverse every nested array add or update the unique element within the array.
 TimeComplexity: O(n^2)
 SpaceComplexity: O(n)
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class DistinctElements{
	static void distinctFrom2dArray(int[][] arr) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		//Sorting every array within the array
		for(int i=0;i<arr.length;i++) {
			Arrays.sort(arr[i]);
		}
		
		//Keeping a count of distinct elements row
		for(int i=0;i<arr.length;i++) {
			int j=0;
			while(j<arr.length) {
				if(j+1<arr.length && arr[i][j] == arr[i][j+1]) {
					j++;
					continue;
				}
				
				if(map.containsKey(arr[i][j])) {
					int count = map.get(arr[i][j]);
					count++;
					map.put(arr[i][j], count);
				}
				else {
					map.put(arr[i][j], 1);
				}
				j++;
			}
		}
		
		//Printing the Distinct Elements
		Set<Integer> key = map.keySet();
		for(int k : key) {
			int count = map.get(k);
			if(count==arr.length) {
				System.out.print(k + " ");
			}
		}
		
		
	}
	public static void main(String[] args) {
		int[][] arr = {{12, 1, 14, 3, 16},
			          {14, 2, 1, 3, 35},
			          {14, 1, 14, 3, 11},
			          {14, 5, 3, 2, 1},
			          {1, 18, 3, 21, 14}};
		
		distinctFrom2dArray(arr);
		
	}
}
