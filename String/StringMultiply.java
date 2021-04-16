/*
Given two very large string value, multiply these two string
String contains numerical value only
*/

public class StringMultiply{
	static String multiply(String num1,String num2) {
		if(num1.equals("0") || num2.equals("0")) {
            System.out.println("Reached here");
			return "0";
		}
		
		if((num1.charAt(0) == '-' && num2.charAt(0) != '-') || (num1.charAt(0) != '-' && num2.charAt(0) == '-')) {
			System.out.print("-");
		}
		
		if(num1.charAt(0) == '-') {
			num1= num1.substring(1);
		}
		
		if(num2.charAt(0) == '-') {
			num2= num2.substring(1);
		}
		
		int n = num1.length();
		int m = num2.length();
		int[] result = new int[n+m];
		int i_n1 = 0;
		int i_n2 = 0;
		
		
		for(int i=n-1;i>=0;i--) {
			int n1 = num1.charAt(i) - '0';
			i_n2 = 0;
			int carry = 0;
			for(int j=m-1;j>=0;j--) {
				int n2 = num2.charAt(j) - '0';
				
				int sum = n1 * n2 + result[i_n1+i_n2] + carry;
				carry = sum/10;
				result[i_n1+i_n2] = sum%10;
				i_n2++;
			}
			
			if(carry>0) {
				result[i_n1+i_n2] = carry;
			}
			
			i_n1++;
		}
		
		
		int i = result.length -1;
		while(i>=0 && result[i] == 0) {
			i--;
		}
		
		if(i==-1) {
			return "0";
		}
		
		
		String s="";
		while(i>=0) {
			s+=result[i];
			i--;
		}
		
		return s;
	}
	public static void main(String[] args) {
		String num1 = "99999999999999";
		String num2 = "999999999999999999999999999999";
		System.out.println(multiply(num1,num2));
	}
	
}
