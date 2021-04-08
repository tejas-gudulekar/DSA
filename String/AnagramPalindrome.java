
import java.util.*;
/*
 * Given a string we need to check if a given string character can be arranged as it becomes a palindrome
 * The idea is in other to string to be palindrome it should have one odd number frequency character
 */

public class AnagaramPalindrome{
	static boolean isAnagramPalindrome(String str) {
		int[] ch = new int[26];
		boolean onlyOnce = true;
		Arrays.fill(ch, 0);
		
		for(int i=0;i<str.length();i++) {
			ch[str.charAt(i)-'a']++;
		}
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]%2!=0 && !onlyOnce) {
				return false;
			}
			if(ch[i]%2!=0 && onlyOnce) {
				onlyOnce = false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "ooohfhooo";
		System.out.println(isAnagramPalindrome(str));
	}
}
