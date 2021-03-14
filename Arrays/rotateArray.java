public class rotateArray{
	static void leftRotate(int[] arr, int rotateBy) {
		int[] tempArr = new int[rotateBy];
		
		for(int i=0; i< rotateBy; i++) {
			tempArr[i] = arr[i];
		}
		
		for(int i=rotateBy; i< arr.length; i++) {
			arr[i-rotateBy] = arr[i];
		}
		
		for(int i=0;i<rotateBy;i++) {
			arr[arr.length - rotateBy + i] = tempArr[i];
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void rightRotate(int[] arr, int rotateBy) {
		int[] tempArr = new int[arr.length];
		for(int i = 0; i<rotateBy;i++) {
			tempArr[i] = arr[arr.length - rotateBy + i];
		}
		
		for(int i = 0; i<arr.length-rotateBy;i++) {
			tempArr[i+rotateBy] = arr[i];
		}
		
		for(int i=0;i<tempArr.length;i++) {
			System.out.print(tempArr[i] + " ");
		}
		
		
	}
	public static void main(String[] args) {
		int[] arr = {2,4,7,8,1,4,9,0};
		int rotateBy = 2;
		rightRotate(arr,rotateBy);
		System.out.println();
		leftRotate(arr,rotateBy);
	}
}
