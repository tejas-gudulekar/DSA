/*
Problem: To find the first recurring item in an array. That the element which is coming again
Input: {2,4,7,3,5,5}
Output: 5
*/

import java.util.HashMap;

public class GetReccuring{
  
	public static void main(String[] args) {
    //Declaring and initialzing an array
		int[] arr = {2,4,7,3,5,5};
		getFirstRecurrence(arr);
		
	}

	static void getFirstRecurrence(int[] arr) {
    //Declaring an HashMap of Integer => Boolean
		HashMap<Integer,Boolean> hashTable = new HashMap<Integer,Boolean>();
		
    //Iterating over input array
		for(int i=0; i<arr.length;i++) {
      //If the key already exists in HashMap return the value of the key
			if(hashTable.containsKey(arr[i])) {
				System.out.print(arr[i]);
				return;
			}
      //Else add the key(Value at index i) in the hashmap with true
			else {
				hashTable.put(arr[i], true);a
				
			}
		}
    //If there is no recurring element
		System.out.print("No recurring elements!!");
		
	}
}
	
