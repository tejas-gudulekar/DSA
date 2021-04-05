/*
 	Given an Sorted Array, n (size of Array) and x value. We need to return the count of all the elements
 	which are smaller or equal to x;
 	Input: {1, 2, 4, 5, 8, 10}, n = 6, x = 9;
 	Output: 5
 */

import java.util.Arrays;

public class Array{
	  static public int countOfElements(int arr[], int n, int x)
	    {
	        int count=0;
	        int i = 0;
	        //Gotcha: If we check the arr[i] condition first, then in some cases it can give out of bound error
	        while(i<n && arr[i]<=x){
	            i++;
	            count++;
	        }
	        return count;
	    }
	
 public static void main(String[] args) {
	 int[] arr = {2, 5, 1, 99, 45, 23, 36, 0};
	Arrays.sort(arr);
	int count = countOfElements(arr,arr.length,99);
	 System.out.println(count);
	}
}
