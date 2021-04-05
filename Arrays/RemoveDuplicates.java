
/*
 	Printing only distinct elements from an given array
 	Input: {10, 20, 10, 20, 30, 10, 40, 50, 70, 90}
 	Output: 10 20 30 40 50 70 90 
 */
//Following java code is not so efficient we can save up the time and little bit of spacecomplexity by using hashmap
import java.util.ArrayList;
public class RemoveDuplicates{
	static void removeDuplicate(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.print((list.get(i) + " "));
		}
	}

	public static void main(String[] args) {
		int[] arr= {10, 20, 10, 20, 30, 10, 40, 50, 70, 90};
		removeDuplicate(arr);
}
}
