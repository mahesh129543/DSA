package String;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class togglecase {

    public static void togglechar(char[] str){
        System.out.println("give the char[] toggle the every char in the array eg. lower to upper" +
                "and upper to lower case do not use the built in function:");
        for(int i=0;i<str.length;i++){
            if(str[i]>='A'&& str[i]<='Z'){
                str[i]=(char)(str[i]+32);
            }else{
                str[i]=(char)(str[i]-32);
            }

        }
        System.out.println(Arrays.toString(str));


    }
    public static void togglecase(char[] str2){
        for(int i=0;i<str2.length;i++){
            if(str2[i]>='A'&& str2[i]<='Z'){
                str2[i]=(char)(str2[i]-'A'+'a');

            }else{
                str2[i]=(char)(str2[i]-'a'+'A');
            }
        }
        System.out.println(Arrays.toString(str2));
    }
    public static void main(String[] args) {
        char[] str={'S','N','a','k','E'};
        togglechar(str);
        char[] str2={'M','A','h','e','S','H'};
        togglecase(str2);
    }
}
