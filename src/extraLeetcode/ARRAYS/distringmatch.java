package extraLeetcode.ARRAYS;

import java.util.Arrays;

public class distringmatch {
    public static void distringMatch(String a) {
        int m = a.length();
        int[] arr = new int[m+1];
        int k=0;
        int j=m;
        for (int i = 0; i < m; i++) {
            if (a.charAt(i) == 'I') {
                arr[i] =k ;
                k++;
            } else if (a.charAt(i) == 'D') {
                arr[i] = j;
                j--;

            }

        }
        arr[m] = k;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        String s="IDID";
        String t="DDI";
        String t1="III";
        distringMatch(s);
        distringMatch(t);
        distringMatch(t1);



    }
}
