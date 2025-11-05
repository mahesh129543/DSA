package extraLeetcode.Strings;

import java.util.Arrays;
import java.util.HashMap;

public class longestpalindrom {
    public static void longestPalindrome(String s) {
        int[] arr = new int[60];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;

        }
        System.out.println(Arrays.toString(arr));
        boolean isodd = false;
        int ans=0;
        for (int i = 0; i <60; i++) {
            if (arr[i] % 2 == 0) {
                ans=ans+arr[i];

            }else{
                ans=ans+arr[i]-1;
                isodd=true;
            }


        }
        if(isodd){
            ans=ans+1;
        }
        System.out.println(ans);
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
//        }
//        System.out.println(map);
//        if(map.size()==1){
//            System.out.println(map.get(s.charAt(0)));
//            return;
//        }
//        int cnt=1;
//        for(char i: map.keySet()){
//            int n=map.get(i);
//            if(n%2==0){
//                cnt=cnt+map.get(i);
//            }else if(n>1 && n%2!=0){
//                cnt=cnt+map.get(i)-1;
//            }
//        }if(!map.values().contains(1)){
//                cnt=cnt-1;
//        }
//        System.out.println(cnt);
    }
    public static void main(String[] args) {
        String s1 = "abccccdd";
        String s2 = "bb";
        String s3 = "bbbaaaaadcv";
        String s4 = "tattarrattat";
        longestPalindrome(s1);

        longestPalindrome(s2);
        longestPalindrome(s3);
        longestPalindrome(s4);
    }
}
