package extraLeetcode.ARRAYS;

import java.util.Arrays;

public class getmaxingenarr {
    public static void getmaxnum(int n){
        int[] arr = new int[n+1];
        System.out.println(Arrays.toString(arr));
        arr[0] = 0;
        arr[1] = 1;
        System.out.println(Arrays.toString(arr));
        for(int i=1;i<=n/2;i++){
            arr[i*2]=arr[i];
            arr[i*2+1]=arr[i]+arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
        int max=arr[0];
        for(int i=1;i<=n;i++){
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);

    }
    public static void main(String[] args) {
        int n=7;
        getmaxnum(n);
    }
}
