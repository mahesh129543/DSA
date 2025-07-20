package Recursion;

public class recursiondemo {
    public static void printNumber(int n) {

        if(n==0){
            return;
        }
        printNumber(n-1);
        System.out.println(n);
    }
    public static void printNumberdecending(int n) {
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printNumberdecending(n-1);

    }
    public static void main(String[] args) {
        printNumber(5);
        printNumberdecending(5);

    }
}
