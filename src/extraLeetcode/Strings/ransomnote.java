package extraLeetcode.Strings;

import java.util.Arrays;
import java.util.HashMap;

public class ransomnote {
    public static void ransomNote(String s1,String s2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int[] arr3 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i) - 'a']++;

        }
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < s2.length(); i++) {
            arr2[s2.charAt(i) - 'a']++;


        }
        System.out.println(Arrays.toString(arr2));
        int cnt = 0;
        for(int i=0; i<26;i++){
            if(arr1[i]-arr2[i]>=0){
                arr3[i]=arr1[i]-arr2[i];

            }

        }

        for(int i=0; i<26;i++){
            if(arr3[i]==0){
                cnt++;


            }
        }
        if(cnt==26){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
//        HashMap<Character, Integer> map1 = new HashMap<>();
//        for (int i = 0; i < s1.length(); i++) {
//            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
//        }
//        System.out.println(map1);
//        for (int i = 0; i < s2.length(); i++) {
//            if (map1.containsKey(s2.charAt(i))) {
//                map1.put(s2.charAt(i), map1.get(s2.charAt(i)) - 1);
//                if (map1.get(s2.charAt(i)) == 0) {
//                    map1.remove(s2.charAt(i));
//                }
//
//            }
//        }
//        System.out.println(map1);
//        System.out.println(map1.size());
    }
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        ransomNote(ransomNote,magazine);

    }
}
