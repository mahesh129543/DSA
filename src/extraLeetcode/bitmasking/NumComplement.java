package extraLeetcode.bitmasking;

public class NumComplement {
    public static void numComplement(int num) {
        int ans = 0;
        int p=1;
        while (num >0) {
            int lastbit = (num &1);
            if (lastbit == 1) {
                lastbit = 0;
            }else{
                lastbit = 1;
            }

            ans = ans + lastbit*p;
            p = p*2;
            num = num>>1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int n=5;
        numComplement(n);
    }
}
