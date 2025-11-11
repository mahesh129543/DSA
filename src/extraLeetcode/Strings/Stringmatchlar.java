package extraLeetcode.Strings;

public class Stringmatchlar {
    public static void sstrmatfch(String str,String p) {
        char[] ch=str.toCharArray();
        int n=ch.length;
        int m=p.length();
        int cnt=0;
        for (int i=0;i<=ch.length-m;i++) {
            if(str.substring(i,i+m).equals(p)) {
                cnt++;

            }
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
      String  sequence = "ababc", word = "ab";
      sstrmatfch(sequence,word);
    }
}
