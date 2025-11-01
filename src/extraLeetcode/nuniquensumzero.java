package extraLeetcode;

import java.util.Arrays;

public class nuniquensumzero {
    public static void num(int n) {
        int[] arr = new int[n];
        int mid=n/2;
        if(n%2!=0){
            arr[mid]=0;
        }else{
            arr[mid]=mid;
        }
        for(int i=0; i<mid; i++){
            arr[i]=-(i+1);
        }
        for(int i=mid+1; i<n; i++){
            arr[i]=i-mid;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int n=13;
        int n1=2;
        num(n);
        num(n1);

    }
}
