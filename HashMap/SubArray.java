/*
Given two Arrays we have to check if all the elements from Array 2 are present in Array 1
*/

import java.util.HashMap;

public class SubArray{
	static void isSubset(int[] arr1,int[] arr2,int n,int m) {
		if(m>n) {
			System.out.println("Not a subset");
			return;
		}
		
		HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
		for(int i=0;i<n;i++) {
			map.put(arr1[i], true);
		}
		
		for(int i=0;i<m;i++){
			if(!map.containsKey(arr2[i])) {
				System.out.println("Not a subset");
				return;
			}
		}
		
		System.out.println("It is a subset");
		
	}
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {1, 4, 5};
		isSubset(arr1,arr2,arr1.length,arr2.length);
	}
}
