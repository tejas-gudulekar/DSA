import java.util.Arrays;

public class FirstLetterUppercase{
	static void firstUppercase(String str) {
		String[] strArray = str.split(" ");
		for(int i = 0; i<strArray.length;i++) {
			strArray[i] = strArray[i].substring(0,1).toUpperCase() + strArray[i].substring(1).toLowerCase();
			System.out.print(strArray[i] + " ");
;		}
		
		
	}
	public static void main(String[] args) {
		String str = "tEJAS sHankar gUdulekar";
		firstUppercase(str);
	}
}
