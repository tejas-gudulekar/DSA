package basicProject;
/*
 * Given an Array of size we need to check if a element is repeating for n/2 or n/3 times within the O(n) time and O(1) space
 * Return the number if yes there is a element is integer which repeaters more than n/2 times else return -1
 */


public class Moore{
	//To check if the answer is repeating for n/2 or n/3 times
	static int isGreaterThan(int[] arr,int maximum,int greaterThan) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(maximum==arr[i]) {
				count++;
			}
		}
		
		if(count>greaterThan) {
			return maximum;
		}
		else {
			return -1;
			}
		}
	
	//Getting the maximum frequency number which can be the answer and passing it to the isGreaterThan function
	static int getMaximum(int[] arr,int n) {
		int answer = arr[0];
		int count = 0;
		
		for(int i=0;i<n;i++) {
			if(answer == arr[i]) {
				count++;
			}
			else {
				count--;
			}
			
			if(count==0) {
				answer = arr[i];
				count=1;
			}
		}
		return isGreaterThan(arr,answer,n/2);
	}
	public static void main(String[] args) {
		int[] arr = {1,2,1};
		System.out.println(getMaximum(arr,arr.length));
	}
}
