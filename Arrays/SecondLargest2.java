
/* A better approach to solve the second largest element
Traversingthe array twice first getting the largest element and then getting the second largest element */ 

public class secondLargest2{
	static void secondLargest(int[] arr) {
    //Setting the first and largest variable to the minimum value of int
		int first, second;
		first = second = Integer.MIN_VALUE;
		
    //Checking if array contains less than 2 elements
		if(arr.length < 2) {
			System.out.println("Array contain less than 2 elements");
			return;
		}
		
		//Traversing the loop to get the largest element;
		for(int i= 0; i<arr.length;i++) {
      //If the element at i'th index is larger than the first, then updating the value of first
			if(arr[i]>first) {
				first = arr[i];
			}
		}
		
		//Traversing the loop to get the second_largest element;
		for(int i=0;i<arr.length;i++) {
      //Checking if the value of the i'th index is bigger than second and also it will should not be equal to the value of first
			if(arr[i]>second && arr[i]!= first) {
				second = arr[i];
			}
		}
		
    //If the value of second variable is not updated in second traversal of array
		if(second==Integer.MIN_VALUE) {
			System.out.println("There is no second largest element");
			return;
		}
    
    //Printing the second largest element
		System.out.print(second);
		
	}
	public static void main(String args[]) {
		int[] arr = {13, 10, 10,1,12,14};
		secondLargest(arr);
		
	}
}
