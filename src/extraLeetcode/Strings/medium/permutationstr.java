package extraLeetcode.Strings.medium;

import java.util.Arrays;

public class permutationstr {
    public static boolean permutationS(String s1, String s2) {
        if(s1.length() > s2.length()) {
            System.out.println("Not Permutation");
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(arr1));
        int w=s1.length();
        for(int i = 0; i < s2.length(); i++) {
            arr2[s2.charAt(i) - 'a']++;


        }


        return false;
    }

    public static void main(String[] args) {
       String  s1 = "ab", s2 = "eidbaooo";
       permutationS(s1,s2);
    }
}
