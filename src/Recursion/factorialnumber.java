package Recursion;

public class factorialnumber {
    public static int factNumber(int n) {
        if(n==0){
            return 1;
        }
        return n*factNumber(n-1);
    }
    public static void factorial1(int n) {
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("using loop:"+fact);
    }

    public static void main(String[] args) {
        System.out.println("factorial of the:"+factNumber(5));
       factorial1(5);

    }
}
