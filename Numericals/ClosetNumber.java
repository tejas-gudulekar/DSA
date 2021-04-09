/*
Given two integers n and m, find the nearest number to n which is divisible by m, if chance of multiple numbers return the number with greatest 
absolute value;
*/

public class ClosetNumber{
	static int closetNumber(int N,int M) {
	      int q=N/M;
		    int n1=q*M;
		    int n2;
		    if(N*M>0)
		        n2=(M*(q+1));
		    else
		        n2=(M*(q-1));
		    if(Math.abs(n2-N)>Math.abs(N-n1))
	    	    return n1;
	    	else
	    	    return n2;
		
	}
	public static void main(String[] args) {
		int n = -17;
		int m = -5;
		System.out.println(closetNumber(n,m));
	}
}
