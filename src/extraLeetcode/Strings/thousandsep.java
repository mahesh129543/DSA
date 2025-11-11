package extraLeetcode.Strings;

public class thousandsep {
    public static void thousandsep(int n) {
        String str = "";
        int cnt = 0;
        while (n > 0) {
            int re=n%10;
            str=re+str;
            n=n/10;
            cnt++;
            if(n>0&&cnt==3){
                str="."+str;

            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        int n=1234;
        int n1=789;

        thousandsep(n);
        thousandsep(n1);

    }
}
