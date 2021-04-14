/*
Given a string, we need to compress the string as if a character is repeating continuously then the encode for rthe same will be characterCount; where count is how many times
it is repeating
Input: aaabbbaac
Output: 3a3b2ac1
*/

public class StringCompression {
    static String encode(String s) {
        {
            //Your code here
            StringBuilder strNew = new StringBuilder();
            int count = 1;
            strNew.append(s.charAt(0));

            for (int i = 1; i < s.length(); i++) {
                char current = s.charAt(i);
                char prev = s.charAt(i - 1);

                if (current == prev) {
                    count++;
                } else {
                    if (count > 1) {
                        strNew.append(count);
                    }
                    strNew.append(s.charAt(i));
                    count = 1;
                }
            }
            if (count > 1) {
                strNew.append(count);
            }
            return strNew.toString();
        }
    }

    public static void main(String[] args) {
        String s = "aaabbccccddd";
        System.out.println(encode(s));
    }
}
