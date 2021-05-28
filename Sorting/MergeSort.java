public class MergeSort{
	
	void mergeSort(int[] arr) {
		int[] temp = new int[arr.length];
		mergeSort(arr,temp,0,arr.length-1);
	}
	
	void mergeSort(int[] arr,int[] temp, int left, int right) {
		if(left<right) {
			int mid = (left+right)/2;
			mergeSort(arr,temp,left,mid);
			mergeSort(arr,temp,mid+1,right);
			mergeHalves(arr,temp,left,mid,right);
		}
	}
	
	void mergeHalves(int[] arr,int[] temp,int left,int mid, int right) {
		
		int i = left;
		int j = mid+1;
		int k = left;
		
		
		while(i<=mid && j<=right) {
			if(arr[i]<=arr[j]) {
				temp[k] = arr[i];
				i++;
			}
			else {
				temp[k] = arr[j];
				j++;
			}
			k++;
		}
		
		if(i>mid) {
			while(j<=right) {
				temp[k] = arr[j];
				k++;
				j++;
			}
		}
		else {
			while(i<=mid) {
				temp[k] = arr[i];
				k++;
				i++;
			}
		}
		
		
		for(int p=left;p<=right;p++) {
			arr[p] = temp[p];
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {9, 5, 11, 2, 17, 4, 23, 18, 7, 1};
		MergeSort m = new MergeSort();
		m.mergeSort(arr);
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
