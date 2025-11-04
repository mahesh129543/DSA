package extraLeetcode.Strings;

public class issubsequence {
    public static void isSubsequence(String a, String b) {
        int i=0;
        int j=0;
        int cnt=0;
        while(i<a.length() && j<b.length()) {

            if(a.charAt(i)==b.charAt(j)) {
                i++;
                j++;
                if(i+1==a.length()){
                    System.out.println("ture");
                    return;
                }

            }else if(a.charAt(i)!=b.charAt(j)) {
                j++;

            }

        }
        System.out.println("not subsequence");

    }
    public static void main(String[] args) {
       String s = "abc", t = "ahbgdc";
       String s1 = "axc", t1 = "ahbgdc";
       isSubsequence(s, t);
       isSubsequence(s1, t1);
    }
}
