package extraLeetcode.Strings;

public class robotreturntoorigin {
    public static void robotreturntoorigin(String s) {
        int cnt=0;
        int cnt2=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='U') {
                cnt++;
            }
            else if (s.charAt(i)=='D') {
                cnt--;
            }
            else if (s.charAt(i)=='L') {
                cnt2++;

            }else if (s.charAt(i)=='R') {
                cnt2--;
            }

        }
        if (cnt==0 && cnt2==0) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        String a = "UD";
        String b = "LLUURDR";
        robotreturntoorigin(a);
        robotreturntoorigin(b);
    }
}
