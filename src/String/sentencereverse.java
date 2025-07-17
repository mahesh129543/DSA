package String;

import java.util.Arrays;

public class sentencereverse {


    public static void reverseTheString(char[] ch, int start, int end) {
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }

    // Main logic to reverse words in a sentence
    public static void reversesentence(String[] str1) {
        char[] ch = str1[0].toCharArray();

        // Step 1: Reverse entire sentence
        reverseTheString(ch, 0, ch.length - 1);


        int start = 0;
        for (int i = 0; i <= ch.length; i++) {
            if (i == ch.length || ch[i] == ' ') {
                reverseTheString(ch, start, i - 1);
                start = i + 1;
            }
        }


        System.out.println("Reversed Sentence: " + Arrays.toString(ch));
        System.out.println("another approch to print the reversed string: "+new String(ch));
    }

    public static void main(String[] args) {
        String[] str1 = {"I like eating the apple hi my name is mahesh"};
        reversesentence(str1);
    }
}
