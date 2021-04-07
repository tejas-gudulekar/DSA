/*
 * Given an array of string, we need o print the winner with highest votes,if there are two winners with same vote 
 * we will follow the alphabetical order and will declare the lowest variable
 */
import java.util.*;


public class ElectionWinner{
	static String[] getWinner(String[] str,int n) {
		//Another and better method would be to keep track of the max and using string compare to key function;
		Arrays.sort(str);
		int max = 1;
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(int i=0;i<n;i++) {
			if(!map.containsKey(str[i])) {
				map.put(str[i], 1);
			}
			else {
				int votes = map.get(str[i]);
				votes++;
				
				if(votes>max) {
					max = votes;
				}
				
				map.put(str[i], votes);
			}
		}
		
		for(int i=0;i<n;i++) {
			if(map.get(str[i])==max) {
				str[0] = str[i];
				str[1] = Integer.toString(map.get(str[i]));
				break;
			}
		}
		
		return str;
	}
	public static void main(String[] args) {
		String[] str = {"john","johnny","jackie","johnny","john",
				"jackie","jamie","jamie","john","johnny","jamie",
				"johnny","john"};
		str = getWinner(str,str.length);
		System.out.println(str[0] + " " + str[1]);
	}
}
