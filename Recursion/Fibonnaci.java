/*
Fibonnaci Series: 0 1 1 2 3 5 8 13 21 34 55 89 144
*/
import java.util.ArrayList;
public class Fibonnaci{

	//Fibonnaci using recursion Time Complexity: O(2^n)
	int fibonnaciRecursion(int n) {
		if(n<2) {
			return n;
		}
		return fibonnaciRecursion(n-1) + fibonnaciRecursion(n-2);
	}
	
	int fibonnaciIterative(int n) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(1);
		for(int i=2;i<=n;i++) {
			arr.add(arr.get(i-1) + arr.get(i-2));
		}
		return arr.get(n);
	}
	public static void main(String[] args) {
		Fibonnaci f = new Fibonnaci();
		int r = f.fibonnaciRecursion(10);
		System.out.println(r);
		int i = f.fibonnaciIterative(32);
		System.out.println(i);
		
	}
}
