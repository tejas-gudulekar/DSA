package basicProject;
import java.util.Scanner;


public class helloWorld{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
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
