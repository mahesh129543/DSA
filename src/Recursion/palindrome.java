package Recursion;

import java.util.Arrays;

public class palindrome {
    public static boolean isPalindrome(String str,int i,int j) {
        if(i>=j){
            return true;
        }
        else if(str.charAt(i)==str.charAt(j)&& isPalindrome(str,i+1,j-1)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "abcba";
        int i=0;
        int j=str.length()-1;
        System.out.println("length of the string: "+str.length());
        System.out.println("Sting is the palindrome ture/false: "+isPalindrome(str,i,j));
        //String operation for the understanding
        String[] str1 =str.split("");


        System.out.println("split the string:"+Arrays.toString(str1));

        String[] s=str.split("");
        System.out.println(Arrays.toString(s ));
        char[] c=str.toCharArray();
        System.out.println(Arrays.toString(c));
        char[] c1=c.clone();
        Arrays.sort(c1);
        System.out.println("sorted copy of the array:"+Arrays.toString(c1));

    }
}
