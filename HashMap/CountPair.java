/*
Given an Array, we need to return distinct pair whose difference is equal to given k

Input: {1, 5, 4, 1, 2}, k = 0
Output: 1

Input: {12, 9 ,10 ,13 ,1 ,8 ,11}
Output: 1
*/
import java.util.*;
public class CountPair{
	static int count(int[] arr,int n,int k) {
		int count = 0;
		
		if(k==0) {
			//Return the count of the elements which are duplicates
			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			for(int i=0;i<n;i++) {
				if(map.containsKey(arr[i])) {
					int frequency = map.get(arr[i]);
					frequency++;
					map.put(arr[i], frequency);
				}
				else {
					map.put(arr[i], 1);
				}
			}
			
			Set<Integer> keys = map.keySet();
			for(int key:keys) {
				if(map.get(key)>=2) {
					count++;
				}
			}
			return count;
		}
		
		HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
		for(int i=0;i<n;i++) {
			map.put(arr[i], true);
		}
		

		for(int i=0;i<n;i++) {
			int x = arr[i];
			System.out.println("x "+ x);
			if(map.containsKey(x) && map.containsKey(x+k)) {
				System.out.println("Count incrementing for " + x + " " + k);
				count++;
			}
			
			if(map.containsKey(x) && map.containsKey(x-k)) {
				System.out.println("Count incrementing for " + x + " " + k);
				count++;
			}
			
			map.remove(x);
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {12, 9 ,10 ,13 ,1 ,8 ,11};
		int k=7;
		System.out.println(count(arr,arr.length,k));
		}
	}
