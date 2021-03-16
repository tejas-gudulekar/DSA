import java.util.*;

public class RemoveDuplicates{
	public static void main(String[] args) {
		int[] arr = {2,4,7,8,9,4,3,2,16};
		
		removeDuplicates(arr);
	}

	 static void removeDuplicates(int[] arr) {
		 HashMap<Integer,Boolean> tempHash = new HashMap<Integer,Boolean>();
		 ArrayList<Integer> tempArray = new ArrayList<Integer>();
		 
		 for(int i=0;i<arr.length;i++) {
			 if(!tempHash.containsKey(arr[i])) {
				 tempHash.put(arr[i],true);
				 tempArray.add(arr[i]);
			 }
		 }
		 
		 for(int i=0;i<tempArray.size();i++) {
			 System.out.print(tempArray.get(i) + " ");
		 }
		
	}
}
	
