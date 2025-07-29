package Recursion.advancer;

public class digitsum {
    static int digitsumofarray(int[] arr, int n) {
        if(n<=0){
            return 0;
        }
        return digitsumofarray(arr,n-1) + arr[n-1];
    }
    static int digitsumofnumber(int n) {
        if(n==0){
            return 0;
        }
        return n%10 + digitsumofnumber(n/10);

    }
    public static void main(String[] args) {
        int[] arr={3,5,2,5};
        int n=arr.length;
        int no=9876;
        System.out.println("sum of the array digit using the recursioon:"+digitsumofarray(arr,n));
        System.out.println("sun of the number in condition of the single diigit:"+digitsumofnumber(no));

    }
}
