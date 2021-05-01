/*
Given a array of size n and window size of int k, we need to find with the given array the largest element in the current window of size k
The window will move in right by one
Input: 1 2 3 1 4 5 2 3 6 int k =3
Outpu:
  First window: 1 2 3 maximum: 3
  Next window:2 3 1 maximum: 3
  and so on..
  
  Ans array index will be arr[n-k+1]
  The problem to solve this within the O(n) knowing if we are within the window
*/
import java.util.*;

public class SlidingWindow{
	static int[] maximum(int[] arr, int n, int k) {
		int[] ans = new int[n-k+1];
		Deque<Integer> d = new LinkedList<Integer>();
		
		int i=0;
		//Adding the first k element indexes in the deque if they pass the condition
		//Every element should be greater than their right element
		for(;i<k;i++) {
			//Making sure the new element is smaller than the right element
			while(!d.isEmpty() && arr[i] >= arr[d.peekLast()]) {
				//If not remove the element
				d.removeLast();
			}
			//Adding the current element
			d.addLast(i);
		}
		
		//Now i = k
		for(;i<n;i++) {
			//Adding the first element from the deque to the ans
			//We will get the index from deque and access the actual element with the help of index
			ans[i-k] = arr[d.peek()];
			
			//Making sure the first element index i.ewithin the window 
			// i.e it is in current window (i-k) >
			while(!d.isEmpty() && d.peek() <= i-k) {
				d.removeFirst();
			}
			
			//Checking again if the new element is smaller than the last element index
			while(!d.isEmpty() && arr[i] >= arr[d.peekLast()]) {
				d.removeLast();
			}
			
			//Adding the current element
			d.addLast(i);
		}
		//adding the last value in the answer
		ans[i-k] = d.peekFirst();
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		int k = 3;
		int n = arr.length;
		
		arr = maximum(arr, n, k);
		
		for(int e: arr) {
			System.out.print(e + " ");
		}
	}
}
