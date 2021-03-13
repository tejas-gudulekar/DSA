import java.util.Arrays;

public class SecondLargest1{
  
	//function to find the second largest
	static void getSecondLargest(int[] arr) {
    
		//Checking if array Contains only one item, if then return invalid input
		if(arr.length-1 < 2) {
			System.out.println("Array contains one or no elements!!");
			return;
		}
		
    /* The approach is to first sort the array in ascending order
    then checking if the second last element is equal or less to the last element
    if less than? then return the element else go check for the third last element and so on utill i=0 or we get the secondLArgest element
    */
    
		Arrays.sort(arr);
    
		for(int i = (arr.length - 2); i>=0; i--){
			if(arr[i]<arr[arr.length-1]) {
				System.out.println(arr[i]);
				return;
			}
		}
		
		System.out.print("The array does not contain second largest element!!");
		
	}
	public static void main(String[] args) {
		int[] arr = {2,2,2,2,2,3};
		getSecondLargest(arr);
	}
}
