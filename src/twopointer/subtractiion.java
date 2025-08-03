package twopointer;

public class subtractiion {
    public static void subtract(int[] arr, int t) {
        int i=0,j=1;
        int n=arr.length-1;
        while(j<=n) {
            if(arr[j]-arr[i]==t) {
                System.out.println(arr[i]+" "+arr[j]);
                i++;
                j++;
            }else if(arr[j]-arr[i]>t) {
                i++;
            }else{
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={-3,0,1,3,6,8,11,14,18,25};
        int t=5;
        subtract(arr,t);
    }
}
