/*
Given two strings, we need to merge the two strings charcter from each string should appear alternatively
*/
class MergeStrings {
    static void mergeString(String str1,String str2){
  
        int k=0;
        int n=Math.max(str1.length(),str2.length());
        
        while(k<n){
            if(k<str1.length()){
                System.out.print(str1.charAt(k));
            }
            
            if(k<str2.length()){
                System.out.print(str2.charAt(k));
            }
            
            k++;
        }
        System.out.println();
        
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    String str1 = sc.next();
		    String str2 = sc.next();
		    mergeString(str1,str2);
		}
	}
}
