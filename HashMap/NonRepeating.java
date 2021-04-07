/*
 * Given an Array,we need to return the first element which is repeating only once
 */
import java.util.*;
public class NonRepeating{
	static int nonRepeating(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else {
				int frequncy = map.get(arr[i]);
				frequncy++;
				map.put(arr[i],frequncy);
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i])<2) {
				return arr[i];
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = {-1, 2, -1, 3, 2};
		System.out.println(nonRepeating(arr));
 }
}
