
/*
 * Given two string we need to check if they are anagram which means if we twisted one string it can be equal to 
 * string 2
 * That means the characters are present in both the string with the same frequency
 * 
 * Another solution could be two declare a array of size 26,fill the arrays with 0. Arrays.file(ArrayName,0);
 * Traverse over the string and get the array index using (charAt(i)-'a'), and incrementing the value at the index
 * While traversing the string 2 decrementing the value for index;
 * The traverse over the array and see if there is any value 0,if yes return false
 */
import java.util.*;

public class Anangram{
	static boolean isAnagram(String str1,String str2) {
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<str1.length();i++) {
			if(!map.containsKey(str1.charAt(i))) {
				map.put(str1.charAt(i), 1);
			}
			else {
				int frequency = map.get(str1.charAt(i));
				frequency++;
				map.put(str1.charAt(i), frequency);
			}
		}
		
		for(int i=0;i<str2.length();i++) {
			if(!map.containsKey(str2.charAt(i))) {
				return false;
			}
			else {
				int frequency = map.get(str2.charAt(i));
				frequency--;
				map.put(str2.charAt(i), frequency);
			}
		}
		
		Set<Character> keys = map.keySet();
		for(char key:keys) {
			if(map.get(key)!=0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str1= "geeksforgeeks";
		String str2="forgeeksgeeks";
		System.out.println(isAnagram(str1,str2));
	}
}
