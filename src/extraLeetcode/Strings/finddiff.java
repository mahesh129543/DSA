package extraLeetcode.Strings;

import java.util.Arrays;

public class finddiff {
    public static char findDiff(String s, String t) {
        char ans=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            ans= (char) (ans^ch);
        }
        for (int i = 0; i < t.length(); i++) {
            ans= (char) (ans^t.charAt(i));
        }
        return ans;
//        int[] arr=new int[26];
//        for (int i = 0; i < a.length(); i++) {
//            arr[a.charAt(i) - 'a']++;
//
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < b.length(); i++) {
//            if(arr[b.charAt(i) - 'a']--==0){
//                System.out.println(b.charAt(i));
//                return;
//            }
//        }
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcde";

        System.out.println( findDiff(s1, s2));
    }
}
