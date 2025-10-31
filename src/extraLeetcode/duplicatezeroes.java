package extraLeetcode;

import java.util.Arrays;

public class duplicatezeroes {
    public static void duplicateZeroes(int[] arr) {
        int n = arr.length;
        int[] arr1 = new int[n];
        int k=0;
        for (int i = 0; i < n; i++) {
            if(k<n && arr[i] != 0){
                arr1[k]=arr[i];
                k++;
            }
            if(k<n && arr[i] == 0){
                arr1[k]=0;
                arr1[k+1]=0;
                k=k+2;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        int [] arr={1,0,2,3,0,4,5,0};
        duplicateZeroes(arr);
    }
}
