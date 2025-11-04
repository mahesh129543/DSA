package extraLeetcode.Strings;

import java.util.Arrays;

public class firstuniquecharinstr {
    public static  void firstuniquecharinstr(String str) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }
        System.out.println(Arrays.toString(freq));

        // Find first character with frequency = 1
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i) - 'a'] == 1) {
                System.out.println("First unique character: " + str.charAt(i));
                return;
            }
        }

        System.out.println("No unique character found");
    }
    public static void main(String[] args) {
       String s = "loveleetcode";
       firstuniquecharinstr(s);
    }
}
