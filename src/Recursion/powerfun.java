package Recursion;

public class powerfun {
    public static int powerFun(int a, int n){
        if(n==0){
            return 1;
        }
        return a*powerFun(a, n-1);
    }
    public static int powerFun2(int a, int n){
        if(n==0){
            return 1;
        }
        int temp = powerFun2(a, n/2);
        if(n%2==0){
            return temp*temp;
        }else{
            return a*temp*temp;
        }
    }
    public static void main(String[] args) {
        System.out.println("simple recursion function:"+ powerFun(2,3));
        System.out.println("another option:"+ powerFun2(2,4));

    }
}
