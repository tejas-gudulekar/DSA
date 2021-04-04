/*
5! = 5 * 4 * 3 * 2 * 1 ie 5!= 5 * 4!
*/
public class Factorial{
  //Factorial using Recursion
	static int factorialRecursion(int n) {
		if(n==1) {
			return 1;
		}
		 return n*factorialRecursion(n-1);
	}
	
  //Factorial using Iterative
	static int factorialIterative(int n) {
		int fact=1;
		for(int i=5;i>0;i--) {
			fact = fact * i;
		}
		return fact;
	}
  
	public static void main(String[] args) {
		int factR = factorialRecursion(5);
		int factI = factorialIterative(5);
		System.out.println("Factorial using Recursion: " + factR);
		System.out.println("Factorial using Iterative: " + factI);
	}
}
