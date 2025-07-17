package String;

import java.util.Arrays;
// the code is not working something going wrong :

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
        int start = 0;
        int end =ch.length - 1;
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;

        }
        System.out.println("Reversed String: " + Arrays.toString(ch));
        char p1=0;
        char p2= (char) (ch.length-1);
        while(p1 != ch.length-1){
            while(p2<ch.length-1 && ch[p2] !='_'){
                p2++;
            }
            reverseTheString(Arrays.copyOfRange(ch, start, p2-1));
            p2= (char) (p2+1);
            p1=p2;

        }
        System.out.println("Reversed String: " + Arrays.toString(ch));


    }

    public static void main(String[] args) {
        char[] str = {'a', 'b', 'd', 'c'};
        reverseTheString(str);
        String[] str1={"I like eating the apple"};
        reversesentence(str1);
    }
}
