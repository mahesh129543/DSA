package extraLeetcode.Strings;

import java.util.Arrays;

public class reversestring3 {
    public static void reverseString(String str) {

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        for(int i=0; i<words.length; i++) {
            String temp = words[i];
            words[i] =reversestring(temp);
        }
        System.out.println(Arrays.toString(words));
        String res=String.join(" ", words);
        System.out.println(res);
//        StringBuilder sb=new StringBuilder();
//     for(int i=0; i<words.length; i++) {
//         sb.append(words[i]);
//         sb.append(' ');
//     }
//     System.out.println(sb.toString());

    }
    public static void reverseString2(String str) {
        char[] chars = str.toCharArray();
        int n = chars.length;

        int start = 0;

        for(int end = 0; end <= n; end++){
            if(end == n || chars[end] == ' '){
                int i = start;
                int j = end - 1;

                while(i < j){
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                    i++;
                    j--;
                }

                start = end + 1;
            }
        }

        System.out.println(new String(chars));



    }
    public static String reversestring(String words) {
        char[] arr = words.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
        return new String(arr);

    }

    public static void main(String[] args) {
        String  s = "Let's take LeetCode contest";
        reverseString(s);
        reverseString2(s);
    }
}
