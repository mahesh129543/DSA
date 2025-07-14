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
    public static int decimaltoBinary(int n) {
        int ans1=0;
        int power=1;
        while(n>0){
            int rem=n%2;
            ans1=ans1+rem*power;
            power=power*10;
            n=n/2;

        }return ans1;

    }

    public static void main(String[] args) {
        int ans=binarytoDecimal(101111);
        System.out.println("ans of the binary to decimal:"+ans);
        int ans1=decimaltoBinary(78);
        System.out.println("ans of the Decimal to binary: "+ans1);

    }
}
