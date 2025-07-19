package bit_Manipulation;

public class magicnumber {
    public static int magicNumber(int n) {
        int p=5;
        int ans=0;
        while(n>0){
            int lastbit=n&1;
            ans=ans+lastbit*p;
            n=n>>1;
            p=p*5;
            System.out.println(ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(magicNumber(7));

    }
}
