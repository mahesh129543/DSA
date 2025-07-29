package primenumber;

public class calculateprime {
    public static void calPrime(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }if(cnt==2){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
    public static void calPrime2(int n) {
        int i;
        for ( i = 2; i <= n; i++) {
            if (n % i == 0) {
                break;
            }

        }
        if(i==n){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
    public static void calPrime3(int n) {
       boolean isprime=true;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                isprime=false;
                break;
            }

        }
        if(isprime){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
    public static void main(String[] args) {
        int n=7;
        calPrime(n);
        calPrime2(n);
        calPrime3(n);

    }
}
