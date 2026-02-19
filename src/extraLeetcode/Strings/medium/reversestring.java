package extraLeetcode.Strings.medium;

import java.util.Arrays;

public class reversestring {
    public static void reversethestring(String s) {
        int n=s.length();
        String[] str=s.trim().split("\\s+");
        System.out.println(Arrays.toString(str));
        int i=str.length-1;
        StringBuilder sb=new StringBuilder();
        while(i>=0) {
         sb.append(str[i]);
         if(i!=0) {
             sb.append(" ");
         }
         i--;
        }
        System.out.println(sb.toString());
        System.out.println(str.length);

    }
    public static void main(String[] args) {
     String   s = "  the sky is blue";
     reversethestring(s);
    }
}
