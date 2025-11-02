package extraLeetcode.ARRAYS;

import java.util.Arrays;

public class shortdistancetochar {
    public static void shortestPath(String s,char ch) {
        int n = s.length();
         int i=0;
         int j=0;
         int[] arr = new int[n];
         int idx=0;
         while(i<n && j<n) {
             if(s.charAt(i)==ch) {
                 arr[i]=0;
                 idx=i;

             }

             else{
                 arr[i]=i;
             }
             i++;
         }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        String s="loveleetcode";
        char ch='e';
        shortestPath(s,ch);
    }
}
