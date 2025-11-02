package extraLeetcode.ARRAYS;

import java.util.Arrays;

public class sufflestring {
    public static void sufflestring(String s,int[] arr) {
        int n = arr.length;
        int slen = s.length();

        char[] res = new char[slen];
        for(int i=0;i<n;i++){
            res[arr[i]]=s.charAt(i);

        }
        System.out.println((new String(res)));
    }
    public static void main(String[] args) {
      String  s = "codeleet";
      int[] indices = {4,5,6,7,0,2,1,3};
      sufflestring(s,indices);
    }
}
