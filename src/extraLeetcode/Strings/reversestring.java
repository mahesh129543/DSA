package extraLeetcode.Strings;

import java.util.Arrays;

public class reversestring {
    public static void reverseString(String[] str) {
        int start = 0;
        int end = str.length - 1;
        while (start <= end) {
            String temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(str));
    }
    public static void main(String[] args) {
        String[]  s = {"h","e","l","l","o"};
        reverseString(s);

    }
}
