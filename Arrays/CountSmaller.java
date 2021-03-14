

public class CountSmaller{
	static void countSmaller(int[] arr,int n) {
		int count = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i] <= n) {
				count++;
			}
		}
		System.out.print(count);
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 2, 2, 5, 7, 9};
		int lessThen = 2;
		countSmaller(arr,lessThen);
	}
}
