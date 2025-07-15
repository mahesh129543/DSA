package String;

import java.util.Arrays;

public class sortchararray {
    public static void sortcharArray(char[] ch) {
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j =  0; j < ch.length-1-i; j++) {
                if (ch[j] > ch[j+1]) {
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;

                }
            }
        }
        System.out.println("simply printing sorted character :"+Arrays.toString(ch));
    }
    public static void printfun(char[] ch) {
        System.out.println("iterating the array which can be alrady sorted:");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+" ");

        }
        System.out.println();
        Arrays.sort(ch);
        System.out.println("using built in function:"+Arrays.toString(ch));
    }
    public static char[] sortcharthirdapproach(char[] ch) {
        System.out.println("third approach:");
        int[] freq = new int[26];
        freq[25]=0;
        for (int i = 0; i < ch.length; i++) {
            freq[ch[i]-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            while(freq[i]!=0){
                System.out.print((char)(i+'a')+" ,");
                freq[i]--;
            }

        }
        System.out.println();
      return ch;
    }
    public static void main(String[] args) {
        char[] ch={'b','a','t','m','a','n'};
        sortcharArray(ch);
        printfun(ch);
        System.out.println(" printing in the array:"+Arrays.toString(sortcharthirdapproach(ch)));
    }
}
