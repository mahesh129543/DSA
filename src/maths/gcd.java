package maths;

import java.util.Scanner;

public class gcd {
    public  static int gcdofno(int a, int b) {
        if(a==0){
            return b;
        }
        return gcdofno(b%a,a);

    }
    public static void lcmofno(int a, int b){
        int i=1;
        while(true){
            if(i%a==0&&i%b==0){
                break;
            }
            i++;
        }
        System.out.println(i);
    }
    public static void lcmofno1(int a, int b){

        int larger=Math.max(a,b);
        int i=larger;
        int smaller=Math.min(a,b);
        while(true){
            if(i%smaller==0){
                System.out.println(i);
                break;
            }
            i=i+larger;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();


        int gcd=1;
        for (int i = 1; i <= Math.min(a,b); i++) {
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        int lcm=(a*b)/gcd;
        System.out.println("lcm of the number:"+lcm);
        System.out.println("the gcd of the number is:"+gcd);
        System.out.println("using the recursion:"+gcdofno(a,b));
        lcmofno(a,b);
        lcmofno1(a,b);
    }
}
