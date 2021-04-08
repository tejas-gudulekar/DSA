/*
Given a string, we need to print the words in string in reverse words
Input: I.Love.Programming
Output: Programming.Love.I
*/

public class ReverseWords{
	static void reverse(String str) {
		String[] strArray = str.split("\\.");
		int n = strArray.length;
		String Ans ="";
		for(int i=n-1;i>=0;i--) {
			if(i==0) {
				Ans += strArray[i];
				break;
			}
			Ans += strArray[i] + ".";
		}
		
		System.out.println(Ans);
		
	}
	public static void main(String[] args) {
		String str = "I.Like.Programming";
		reverse(str);
	}
}
