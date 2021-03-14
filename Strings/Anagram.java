

import java.util.Arrays;

public class Anagram{
	static void anagram(String s1,String s2) {
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		if(s1.length() == s2.length()&& Arrays.equals(s1Array,s2Array)){
			System.out.print("Anagram");
			return;
		}
		System.out.print("Not Anagram");
		
		
		
		
	}
	public static void main(String[] args) {
		String str = "toy1";
		String str2 = "wot1";
		
		anagram(str,str2);
		
	}
	
}
