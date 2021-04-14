/*
KMP is pattern searching algorithm which gives the result in O(n) times,buy maintaing a lps(longest proper suffix)
*/

public class KMP{
	static int[] computeLPS(String pat,int m,int[] lps) {
		lps[0] = 0;
		int j=0;
		int i=1;
		
		while(i<m) {
			if(pat.charAt(i) == pat.charAt(j)) {
				j++;
				lps[i] = j;
				i++;
			}
			else {
				if(j==0) {
					lps[i] = 0;
					i++;
				}
				else {
					j = lps[j-1];
				}
			}
		}
		return lps;
	}
	static void kmp(String txt,String pat) {
		int n = txt.length();
		int m = pat.length();
		if(m>n) {
			System.out.println("Invalid Pattern String");
			}
		
		int[] lps = new int[m];
		lps = computeLPS(pat,m,lps);
		
		int i=0;
		int j=0;
		
		while(i<n) {
			if(txt.charAt(i) == pat.charAt(j)) {
				i++;
				j++;
			}
			
			if(j==m) {
				System.out.println("Pattern found at index " + (i-m));
				j = lps[j-1];
			}
			
			if(txt.charAt(i)!= pat.charAt(j)) {
				if(j==0) {
					i++;
				}
				else {
					j=lps[j-1];
				}
				
			}
		}
	
		}
	public static void main(String[] args) {
		String str1 = "geeksforgeeks";
		String str2 = "geek";
		kmp(str1,str2);
	}
}
