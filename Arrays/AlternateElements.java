import java.util.Scanner;

//Probelm: To print alternate elements
//Input: 5
//Array Elements: 1 2 3 4 5 6
//Output: 1 3 5


public class AlternateElements{
	public static void main(String[] args) {
		
		System.out.print("Enter the array Size");
		Scanner sc = new Scanner(System.in);
    
		int n = sc.nextInt();
		int[] array = new int[n];
		
		System.out.print("Enter array elements");
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.print("Alternate elements are: ");
		int i = 0;
		while(i<n) {
			System.out.print(array[i]+ " ");
			i += 2;
		}
	}
}
