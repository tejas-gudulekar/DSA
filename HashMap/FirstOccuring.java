/*
Given an Array and k integer,we need to print the first element whicch occurs for K times
*/
import java.util.*;
public class FirstOccuring{
	static void firstOccuring(int[] arr,int k,int n) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else {
				int frequency = map.get(arr[i]);
				frequency++;
				map.put(arr[i], frequency);
			}
			
			if(map.get(arr[i]) == k){
				System.out.println(arr[i]);
				return;
			}
		}
		System.out.println("No elements occur for " + k + " times");
	}
	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 4, 5,2, 3, 7, 1};
		firstOccuring(arr,2,arr.length);
	}
}
