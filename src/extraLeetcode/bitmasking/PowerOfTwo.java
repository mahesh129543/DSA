package extraLeetcode.bitmasking;

public class PowerOfTwo {
    public static void powerOfTwo(int n) {
        int cnt=0;
        while(n>0) {
            if((n&1)==1){
                cnt++;
            }
            n>>=1;
        }
        if(cnt==1){
            System.out.println("true");
        }
        System.out.println(cnt);
        System.out.println("false");
    }
    public static void main(String[] args) {
        int n=16;
        powerOfTwo(n);
    }
}
