package extraLeetcode.Strings;

import java.util.Arrays;

public class inceasingdeceasingstr {
    public static void strincresingdecresing(String str) {
        int[] arr = new int[26];
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(arr));
        while(sb.length()<str.length()) {


            for (int i = 0; i < 26; i++) {
                if (arr[i] != 0) {
                    char ch = (char) ('a' + i);
                    sb.append(ch);
                    arr[ch - 'a']--;
                }
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] != 0) {
                    char ch = (char) ('a' + i);
                    sb.append(ch);
                    arr[ch - 'a']--;
                }
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
       String s = "aaaabbbbcccc";
       String s1 = "rat";
       strincresingdecresing(s);
       strincresingdecresing(s1);
    }
}
