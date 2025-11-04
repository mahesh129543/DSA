package extraLeetcode.Strings;

public class firstoccurinstring {
    public static void firstoccurinstring(String s1,String s2) {
       if( s1.contains(s2)){
            System.out.println(s1.indexOf(s2));


        }
    }

public static void main(String[] args) {
    String haystack = "sadbutsad";
    String needle = "sad";
firstoccurinstring(haystack,needle);

}
}
