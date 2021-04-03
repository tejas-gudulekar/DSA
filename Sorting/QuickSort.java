


public class QuickSort{
	void quickSort(int[] arr) {
		quickSort(arr,0,arr.length-1);
	}
	
	void quickSort(int[] arr,int left,int right) {
		
		if(left>=right) {
			return;
		}
		
		int pivot = arr[(left+right)/2];
		int index = partition(arr,left,right,pivot);
		quickSort(arr,left,index-1);
		quickSort(arr,index,right);
		
		
		
	}

	int partition(int[] arr,int left,int right,int pivot) {
		// TODO Auto-generated method stub
		while(left<=right) {
			while(arr[left]<pivot ) {
				left++;
			}
			while(arr[right]>pivot) {
				right--;
			}
			
			if(left<=right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
				
		}
		
		return left;
	}
	
	public static void main(String[] args) {
		int[] arr = {
	            92,
	            1,
	            54,
	            33,
	            7,
	            2,
	            33,
	            96
	        };
		QuickSort q = new QuickSort();
		q.quickSort(arr);
		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}
	
}
