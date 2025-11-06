package extraLeetcode.Strings;

import java.util.Arrays;

public class reformatestring {
    public static void reformateString(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        StringBuilder sb1 = new StringBuilder(); // store letters
        StringBuilder sb2 = new StringBuilder(); // store digits
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                sb1.append(ch[i]);
            } else {
                sb2.append(ch[i]);
            }
        }

        if (Math.abs(sb1.length() - sb2.length()) > 1) {
            System.out.println("empty");
            return;
        }


        boolean letterFirst = sb1.length() >= sb2.length();
        int j = 0, k = 0;


        for (int i = 0; i < n; i++) {
            if ((letterFirst && i % 2 == 0) || (!letterFirst && i % 2 == 1)) {

                arr[i] = String.valueOf(sb1.charAt(j++));
            } else {

                arr[i] = String.valueOf(sb2.charAt(k++));
            }
        }


        StringBuilder result = new StringBuilder();
        for (String val : arr) {
            result.append(val);
        }


        System.out.println(Arrays.toString(arr));
        System.out.println(result.toString());
    }
    public static void main(String[] args) {
       String s="a0b1c2";
       reformateString(s);
    }
}
