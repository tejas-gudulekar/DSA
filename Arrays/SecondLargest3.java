/* Traversing the array only once and getting the second largest element in array*/

public class secondLargest3{
	static void secondLargest(int[] a) {
    //Initializing the value of first and second as the minimum value of integer;
		int first,second;
		first = second = Integer.MIN_VALUE;
		
    //Checking if the arrry has more or atleast 2 elements
		if(a.length<2) {
			System.out.println("Less than 2 elements");
			return;
		}
		
    //Traversing the loop
		for(int i = 0; i< a.length; i++){
      //If we find an element which is bigger than value of first
			if(first<a[i]) {
        //Set the second value as first and first value as the value at i'th index
				second = first;
				first = a[i];
			}
      //But if the value at i'th index is not bigger than first, but bigger than the bigger second. Update the value of 2nd
			else if(a[i] > second && a[i] != first) {
	                second = a[i];
	        }
		}
		
    //If second remains unchanged
		if(second == Integer.MIN_VALUE) {
			System.out.print("There is no second largest element");
			return;
		}
		System.out.print(second);
			
	}
	public static void main(String[] args) {
		int[] arr = {-2147481, -2147482, -2147483, -2147484};
		secondLargest(arr);
		
		}
	}
