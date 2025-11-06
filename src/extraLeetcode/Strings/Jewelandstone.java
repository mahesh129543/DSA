package extraLeetcode.Strings;

import java.util.Arrays;

public class Jewelandstone {
    public static void jewelandstone(String je, String s) {
        int[] arr = new int[60];
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {

            arr[s.charAt(i) - 'A']++;
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<je.length();i++) {
           ans=ans+ arr[je.charAt(i) - 'A'];
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
       String  jewels = "aA", stones = "aAAbbbb";
       jewelandstone(jewels, stones);
    }
}
