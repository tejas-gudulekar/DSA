/*
Given a String write a program which check if a given string is palindrome or not
Don't use extra space for array rather use two pointers
*/

public class Palindrome{
	static boolean isPalindrome(String str) {
		int n=str.length();
		int i=0;
		int j=n-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(isPalindrome(str));
	}
}
