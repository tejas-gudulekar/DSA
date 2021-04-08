/*
Given a string we need to return a string by converting substring first letter to capital
*/
public class TitleString{
	static void toTitlestring(String str) {
		String[] strArray = str.split(" ");
		StringBuilder str2 = new StringBuilder();
		for(int i=0;i<strArray.length;i++) {
			str2.append(strArray[i].substring(0,1).toUpperCase() + strArray[i].substring(1).toLowerCase() + " ");
		}
		System.out.println(str2);
	}
	
	
	public static void main(String[] args) {
		String str = "tejas shankar gudulekar";
		toTitleString(str);
	
	}
}
