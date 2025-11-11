package extraLeetcode.Strings;

import java.util.Arrays;

public class arrangespace {
    public static void arrangeSpace(String str) {
        String[] words = str.trim().split("\\s+");
        System.out.println(Arrays.toString(words));
        char[] arr = str.toCharArray();
        int totalSpaces = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                totalSpaces++;
            }
        }
        System.out.println(totalSpaces);

        if (words.length == 1) {

            StringBuilder sb = new StringBuilder(words[0]);
            for (int i = 0; i < totalSpaces; i++) sb.append(' ');
            System.out.println(sb.toString());
            return;
        }


        int spaceBetween = totalSpaces / (words.length - 1);
        int extraSpaces = totalSpaces % (words.length - 1);


        StringBuilder result = new StringBuilder();
        String gap = " ".repeat(spaceBetween);

        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);
            if (i != words.length - 1) result.append(gap);
        }

        result.append(" ".repeat(extraSpaces));

        System.out.println(result.toString());

    }
    public static void main(String[] args) {
      String  text = "  this   is  a sentence ";
      arrangeSpace(text);
    }
}
