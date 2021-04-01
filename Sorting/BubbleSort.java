/* 
In buuble sort a index is selected and the index value is compare with its next index value
At the end of the first iteration the greatest value will be at the end of the array
*/

public class BubbleSort{
	public static int[] sort(int[] arr) {
		int n = arr.length;
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {99,44,6,2,1,5,63,87,283,0};
		arr = sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
