package extraLeetcode.Strings.medium;

public class stroccurance {
    public static void stroccurance(String str,String p) {
        StringBuilder sb = new StringBuilder(str);
        while (sb.indexOf(p) != -1) {
            int idx = sb.indexOf(p);
            sb.delete(idx, idx + p.length());
        }

        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
       String s = "daabcbaabcbc", part = "abc";
       stroccurance(s, part);
    }
}
