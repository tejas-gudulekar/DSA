/*
In selection the Oth index is consider as the minimum'th value in the array and as the j traverse the min index gets updating and after
of the first iteration we have minimum'th value array in the index so we swap the alue with the current value of i. So the value at the minimum index
become the current value at index i and vice versa.
*/

public class SelectionSort{
	static int[] sort(int[] arr) {
		int min;
		int temp;
		int n = arr.length;
		//Traversing only till n-1 because at when i=n all the smallest element will
		//be sorted
		for(int i=0;i<n-1;i++) {
			min=i;
			//Traversing till n-1 because in comparison we are useing j+1;
			for(int j=i;j<n-1;j++) {
				if(arr[j+1]<arr[min]) {
					min=j+1;
				}
			}
			//Swapping the value
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
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
