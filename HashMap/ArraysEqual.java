/*
Given two arrays of same size, check if they both are equal that is having same elements and same frequencies for that elements
Input :  long[] arr1  = {1,2,5,4,0};
		     long[] arr2 =  {2,4,5,0,1};
 Output: true
*/

import java.util.HashMap;

public class ArraysEqual{
	 public static boolean check(long arr1[],long arr2[],int n)
	    {
	        //Your code here
	        HashMap<Long,Integer> map1 = new HashMap<Long,Integer>();
			for(int i=0;i<n;i++) {
				if(!map1.containsKey(arr1[i])) {
					map1.put(arr1[i], 1);
				}
				else {
					int count = map1.get(arr1[i]);
					count += 1;
					map1.put(arr1[i], count);
				}
			}
			
			HashMap<Long,Integer> map2 = new HashMap<Long,Integer>();
			for(int i=0;i<n;i++) {
				if(!map2.containsKey(arr2[i])) {
					map2.put(arr2[i], 1);
				}
				else {
					int count = map2.get(arr2[i]);
					count += 1;
					map2.put(arr2[i], count);
				}
			}
			
			for(int i=0;i<n;i++) {
				if(map2.containsKey(arr1[i])) {
					int count = map2.get(arr1[i]);
					count -= 1;
					map2.put(arr1[i], count);
				}
				else {
					return false;
				}
			}
			
			for(int i=0;i<n;i++) {
				if(map2.get(arr2[i]) != 0) {
					return false;
				}
			}
			return true;
	    }
	 
	 public static void main(String[] args) {
		 long[] arr1  = {1,2,5,4,0};
		long[] arr2 =  {2,4,5,0,1};
		
		System.out.println(check(arr1,arr2,arr1.length));
	 }
}
