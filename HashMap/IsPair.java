/*
Given an array and int k, we need to check if any two elements sum is equal to k. If yes return true else false
*/
import java.util.*;
public class IsPair{
	static Boolean pair(int[] arr,int n,int k) {
		boolean isPair=false;
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			int x = (k-arr[i]);
			if(map.containsKey(x)) {
				isPair=true;
			}
			map.put(arr[i], i);
		}
		
		 return isPair;
	}
	public static void main(String[] args) {
		int[] arr = {1,4,45,6,8,6,10};
		int k=16;
		System.out.println(pair(arr,arr.length,k));
	}
}
