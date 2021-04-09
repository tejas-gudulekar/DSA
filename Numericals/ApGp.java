/*
Calculate the ap and gp for a given starting index and their difference
*/

public class ApGp{
	//To get the Nth value in AP, where A1 and A2 first two starting index
	static int ap(int A1,int A2,int n) {
		 int c = A2-A1;
	     for(int i=1;i<n;i++){
	         A1+=c;
	     }
	     return A1;
	}
	
	static int gp(int a,int r,int n) {
	 return a * (int)Math.pow(r,n-1);
	}
	public static void main(String[] args) {
		int A1 = 1;
		int A2 = 4;
		int r = 5;
		int a= 2;
		int n=10;
		
		System.out.println(ap(A1,A2,n));
		System.out.println(gp(a,r,n));
	}
}
