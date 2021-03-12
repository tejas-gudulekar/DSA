import java.util.Arrays;

//Probelm: Merge two arrays and return it sorted

public class MergeSortedArray{
	public static void main(String[] args) {
		
		//Two initial arrays
		int[] firstArray = {0,3,7,9,13,25};
		int[] secondArray = {1,2,6,11,17,18};
		
    //Getting the size of two  initial Array
		int firstArraySize = firstArray.length;
		int secondArraySize = secondArray.length;
		
    //Creating a static array to store the elements of firstArray and secondArray in single Array
		int mergedArraySize = firstArraySize + secondArraySize;
		int[] mergedArray = new int[mergedArraySize];
		
    //Travesring the first array and inserting the array elements in mergedArray
		for(int i=0; i<firstArraySize; i++) {
			mergedArray[i] = firstArray[i];
		}
		
    //Traversing the second array and inserting the array elements in mergedArray
		for(int i=0; i<secondArraySize; i++ ) {
			mergedArray[firstArraySize+i] = secondArray[i];
		}
		
    //Sorting the array
		Arrays.sort(mergedArray);
		
    //Printing the sorted merged array
		for(int i=0; i<mergedArraySize;i++) {
			System.out.print(mergedArray[i] + " ");
		}
	}
}
