package bit_Manipulation;

import java.math.BigInteger;

public class powerofno {
    public static int powerofNo(int n,int a) {
        int ans=1;
        while(n>0){
            int last_bit=n&1;
            if(last_bit==1){
                ans=ans*a;
            }
            n=n>>1;
            a=a*a;
        }return ans;

    }
    public static int powerofNousingmodulo(int n,int a,int p){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*a;

        }return ans%p;
    }
    public static int powerofNousingmodulo1(int n,int a,int p){
        System.out.println("this can avoid the overflow of the memory for the store the number:");
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=((ans%p)*(a%p))%p;

        }return (int)ans;
    }
    public static void main(String[] args) {
        System.out.println(powerofNo(10,2));
        System.out.println(powerofNousingmodulo(23,10,2));
        System.out.println(powerofNousingmodulo1(25,10,12));
        System.out.println("another any size of number can using the biginteger object this class" +
                "it can already in the package :");

        BigInteger b=new BigInteger("3534646576567568685686879878676765756757");
        BigInteger b1=new BigInteger("1");
        System.out.println("addition: "+b.add(b1));
        System.out.println(b);

        System.out.println("factorial of the biginteger:" );
        int n=50;
        BigInteger ans=BigInteger.valueOf(1);
        for(int i=1;i<=n;i++){
            ans=ans.multiply(BigInteger.valueOf(i));
        }
          System.out.println("factorial of the biginteger:"+ans);

    }
}
