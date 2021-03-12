import java.util.Arrays;

/* 
Problem: To find the maximum and minimum element in array
Input: 2 3 35 76 102 1
Output Max: 102 and Min: 1
*/

public class MaxMin{
	
  //Method to get maximum element using naive method
	static int getMax(int arr[]) {
		int max = arr[0];
		int i = 0;
		
		while(i<arr.length) {
			if(arr[i]>max) {
				max = arr[i];
			}
			i++;
		}
		return max;
	}
  
  //Function to get minimum element using naive method
	static int getMin(int[] arr) {
		int min = arr[0], i=0;
		while(i<arr.length) {
			if(arr[i]<min) {
				min = arr[i];
			}
			i++;
		}
		return min;
	}
  
  
	public static void main(String[] args) {
		int[] array  = {7,2,5,72,5,102,84,35,200,1};
    
    //Method 1: Using array sort method
    Arrays.sort(array);
		System.out.println("Maximum Element " + array[array.length - 1]);
		System.out.println("Minimum Element " + array[0]);
		
    //Method 2: Using naive method; Functions are wriiten above
    /* 
    System.out.println("Maximum Element " + getMax(array));
		System.out.print("Minimum Element " + getMin(array));  
    */
		
   }
}
