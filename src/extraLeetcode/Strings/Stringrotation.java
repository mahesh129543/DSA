package extraLeetcode.Strings;

public class Stringrotation {
    public static void stringRotation(String a, String b) {
        int i=0;
        int j=0;
        int cnt=0;
        while(i<a.length()) {
            if(j==b.length()-1) {
                j=0;
            }
            if(a.charAt(i)!=b.charAt(j)) {
                j++;
            } else if (a.charAt(i)==b.charAt(j)) {
                i++;
                j++;
                cnt++;
            }
        }
        if(cnt==a.length()) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        stringRotation(s, goal);
    }
}
