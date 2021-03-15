
import java.util.*;

public class Intersection{
	static void getIntersection(int[] arr1,int[] arr2) {
		ArrayList<Integer> tempArr = new ArrayList<Integer>();
		for(int i = 0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					tempArr.add(arr2[j]);
				}
			}
		}
		
		for(int i=0;i<tempArr.size();i++) {
			System.out.print(tempArr.get(i)+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr1 = {23,4,5,22};
		int[] arr2 = {2,22,4,36,23};
	
		getIntersection(arr1,arr2);
		
	}
}
