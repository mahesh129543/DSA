package extraLeetcode.bitmasking;

public class numofset1bit {
    public static void numofset1bit(int n) {
        int cnt = 0;
        while (n > 0) {
            if((n&1)==1){
                cnt++;
            }
            n>>=1;

        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        int n=11;
        int n1=8;
        numofset1bit(n1);
        numofset1bit(n);
    }
}
