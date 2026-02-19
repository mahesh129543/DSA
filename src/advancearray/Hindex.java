package advancearray;

import java.util.Arrays;

public class Hindex {
    public static void hindx(int[] arr){
        int n = arr.length;
        int[] h = new int[n+1];
        for (int i = 0; i < n; i++) {
            if(!(arr[i]>n)) {
                h[arr[i]]++;
            }
            else {
                h[n]++;
            }
        }
        System.out.println(Arrays.toString(h));


        int total = 0;

        for (int i = n; i >= 0; i--) {
            total += h[i];

            if (total >= i) {
                System.out.println(i);
                break;
            }
        }

    }
    public static void main(String[] args) {
        int[]  arr={3,0,6,1,5};
        hindx(arr);
    }
}
