package extraLeetcode.ARRAYS;

import java.util.Arrays;

public class slowestkey {
    public static void slowestKey(int[] arr,String s) {
        int n = arr.length;
        int[] temp = new int[26];
        temp[s.charAt(0)-'a']=arr[0];
        for (int i = 1; i < n; i++) {
            temp[s.charAt(i)-'a']+=arr[i]-arr[i-1];


        }
        System.out.println(Arrays.toString(temp));
        int max = temp[0];
        for (int i = 1; i < 26; i++) {
            if (max<temp[i]) {
                max = temp[i];

            }
        }
        System.out.println(max);
        String s1="";
        for(int i=0;i<26;i++){
            if(temp[i]==max){
             char ch =(char)('a'+i);
             s1+=ch;
            }
        }
        System.out.println(s1);
    }
    public static void main(String[] args) {
      int[]   releaseTimes = {9,29,49,50};
      String keysPressed = "cbcd";
      slowestKey(releaseTimes,keysPressed);
    }
}
