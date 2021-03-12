/*
To find sum of all elements in an array
Example: input {1,5,3,2,7} 
Output: 18 */

public class SumOfAllElements{
	static int sumOfAllElements(int[] arr) {
		int total = 0, i =0;
    
    //If array contains only one element
		if(arr.length == 1) {
			return arr[0];
		}
    else if(arr.length == 0){
      return 0;
    }
    else{
      while(i<arr.length) {
        total += arr[i];
        i++;
      }
		return total;
    }
	}
	public static void main(String[] args) {
		int[] array  = {7,2,5,72,5,102,84,35,200,1};
		System.out.print(sumOfAllElements(array));
	}
}
