/*
Given two string of size n and m,considering n>=m find and print where string m is present in string n
*/

public class PatternFinding{
	static void bruteForce(String n, String m) {
		int windowSize = m.length();
		
		for(int i=0;i<n.length()-windowSize;i++) {
			for(int j=0;j<windowSize;j++) {
				if(n.charAt(i+j) != m.charAt(j)) {
					break;
				}
				if(j==windowSize-1) {
					System.out.println("Pattern found at index " + i);
				}
			}
		}
	}
	
	static void hashCode(String n,String m) {
		int windowSize = m.length();
		int mHash = m.hashCode();
		for(int i=0;i<n.length()-windowSize;i++) {
			if(mHash == n.substring(i,i+windowSize).hashCode()) {
				System.out.println("Pattern found at index " + i);
			}
		}
	}
	
	
		
	public static void main(String[] args) {
		String n ="apart";
		String m = "par";;
		hashCode(n,m);
		bruteForce(n,m);

	}
}
