
/*
 * Given a sequence of string containing opening and closing brackets, we need to check if their is a closing bracket for
 * every opening bracket, and there should not have any different type of closing bracket in between
 * example:
 * input: ")" Output:false
 * input: "([]) output: true
 * input: "([)] output: false
 * input: "([{}]) output: true
 */
 
public class BalancedParanthesis{
	 static boolean isPair(String s) {
		char[] stack = new char[s.length()];
		int top=-1;
		
		for(int i=0;i<s.length();i++) {
			char e = s.charAt(i);
			
			if(e=='(' || e=='[' || e=='{') {
				top++;
				stack[top] = e;
				continue;
			}
			
			//If the first element is closing bracket and not to get in index out of bound
			if(top==-1) {
				return false;
			}
			
			char peek = stack[top];
			if(peek=='(' && e!=')') {
				return false;
			}
			else if(peek=='[' && e!=']') {
				return false;
			}
			else if(peek=='{' && e!='}') {
				return false;
			}
			else {
				top--;
			}
		}
		
		//If stack is not empty at the end
		if(top!=-1) {
			return false;
		}
		
		//if it reaches by bypassing all the condition
		return true;
	}
	public static void main(String[] args) {
		String s ="({[]})";
	
		System.out.println(isPair(s));
		
		                                                                           
	}
}
