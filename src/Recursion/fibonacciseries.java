package Recursion;

import java.util.Arrays;

public class fibonacciseries {
    public static int fibonacci(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);

    }
    public static void fibonacci1(int n) {
        System.out.println("using the for loop:");
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+",");
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
    }
    public static int[] fibonacci2(int n) {
        System.out.println("using the for Array:");
        int[] arr=new int[n];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];

        }return arr;

    }
    public static void main(String[] args) {
        int n=6;
        System.out.println( fibonacci(6));
        for (int i=0;i<=n;i++){
            System.out.println(fibonacci(i));
        }
        fibonacci1(n);
        System.out.println("using Array:"+Arrays.toString(fibonacci2(n)));


    }
}
