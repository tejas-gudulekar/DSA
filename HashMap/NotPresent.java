/*
Given two arrays and their length n and m, we need to print the element which is present in first array but not the second one
*/
import java.util.*;

public class NotPresent{
	static void notPresent(int[] arr1,int[] arr2,int n,int m) {
		HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
		for(int i=0;i<m;i++) {
			map.put(arr2[i],true);
		}
		
		for(int i=0;i<n;i++) {
			if(!map.containsKey(arr1[i])) {
				System.out.print(arr1[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 10};
		int[] arr2 = {2, 3, 1, 0, 5};
		notPresent(arr1,arr2,arr1.length,arr2.length);
	}
}
