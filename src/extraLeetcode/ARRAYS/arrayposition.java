package extraLeetcode.ARRAYS;

import java.util.Arrays;

public class arrayposition {
    public static int arraypos(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        int sum = 0;
        int i=0;
        int j=1;
        while(i<n-1&&j<n){
            sum=sum+Math.min(arr[i],arr[j]);
            i=j+1;
            j=j+2;

        }
        return sum;


    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(arraypos(arr));

    }
}
