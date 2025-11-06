package extraLeetcode.Strings;

import java.util.Arrays;

public class reverseonyLetters {
    public static void reverse(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n/2 ; i++) {
            if (arr[i]=='-') {
                i+=1;

            }if(arr[n-1-i]=='-') {
                n=n-i-1-1;
            }
            char temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;

        }
        System.out.println(Arrays.toString(arr));
//        int i = 0, j = arr.length - 1;
//        while (i <= j) {
//            if(arr[i]=='-') {
//                i++;
//
//            }
//            if(arr[j]=='-') {
//                j--;
//            }
//            char temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//
//        }
//        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
       String s = "a-bC-dEf-ghIj";
       reverse(s);
    }
}
