import java.util.Scanner;


public class ReverseString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		//Note: It is always good to check for input like whether the String is 1 or no character along or whether the input is String or not
		
		/* Converting String to Array uusing naive Approach		
		char[] charArray = new char[str.length()];
		
		for(int i =0 ; i<str.length(); i++) {
			charArray[i] = str.charAt(i);
		} */
		
		
    		//Converting using toCharArrayMethod
		char[] charArray = str.toCharArray();
		
		//Printing the Array Elements
		for(int i=(charArray.length -1);i>=0;i--) {
			System.out.print(charArray[i]);
		}
	
		
	}
}
