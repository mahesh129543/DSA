package extraLeetcode.Strings;

import java.util.Arrays;

public class replacequetoletter {

    public static void replaceLetters(String str) {
        char[] chars = str.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n; i++) {
            if (chars[i] == '?') {
                for (char c = 'a'; c <= 'z'; c++) {
                    // check left and right characters safely
                    if ((i == 0 || chars[i - 1] != c) && (i == n - 1 || chars[i + 1] != c)) {
                        chars[i] = c;
                        break;
                    }
                }
            }
        }
        System.out.println(new String(chars));
    }
    public static void main(String[] args) {
        String s = "?zs";
        replaceLetters(s);
    }
}
