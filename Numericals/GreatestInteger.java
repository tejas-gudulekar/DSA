import java.util.Arrays;

public class GreatestInteger{
	static void greatestInteger(int n) {
		String str = Integer.toString(n);
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
	}
	
	public static void main(String[] args) {
		int n = 12369;
		greatestInteger(n);
	}
}
