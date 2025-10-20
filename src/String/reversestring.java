package String;

import java.util.Arrays;


public class reversestring {
    public static void reverseTheString(char[] str) {
        int start = 0;
        int end = str.length - 1;

        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed String: " + Arrays.toString(str));
    }
    public static void reversesentence(String[] str1) {
        char[] ch = str1[0].toCharArray();

        // Step 1: Reverse the entire string
        int start = 0;
        int end = ch.length - 1;
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        // Step 2: Reverse each word individually
        int p1 = 0;
        int p2 = 0;
        while (p1 < ch.length) {
            while (p2 < ch.length && ch[p2] != ' ') {
                p2++;
            }
            // Reverse one word from p1 to p2-1
            int i = p1, j = p2 - 1;
            while (i < j) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            p2++;
            p1 = p2;
        }

        System.out.println("Reversed Sentence: " + new String(ch));
    }

    public static void main(String[] args) {
        char[] str = {'a', 'b', 'd', 'c'};
        reverseTheString(str);
        String[] str1={"I like eating the apple"};
        reversesentence(str1);
    }
}
