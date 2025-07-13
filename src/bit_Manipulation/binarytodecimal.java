package bit_Manipulation;

public class binarytodecimal {
    public static int binarytoDecimal(int n) {
        int ans=0;
        int power=1;
        while(n>0){
            int lastbit=n%10;
            ans=ans+lastbit*power;
            n=n/10;
            power*=2;
        }return ans;

    }
    public static void main(String[] args) {
        int ans=binarytoDecimal(101111);
        System.out.println(ans);

    }
}
