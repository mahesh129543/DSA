package extraLeetcode.bitmasking;

public class reversebit {
    public static void reverse(int num) {

        int ans=0;
        int p=1;
        while (num >0) {
            int lastbit=num%2;
            ans = ans +lastbit*p;
            p=p*10;
            num=num/2;


        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int n = 43261596;
        int n1=8;
        reverse(n);
        reverse(n1);
    }
}
