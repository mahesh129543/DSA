package extraLeetcode;

import java.util.Arrays;

public class sortarraybyparity {
    public static void sortarraybyparity(int[] a) {
        int n = a.length;
        int k=0;
        for (int i = 0; i <n; i++) {
            if(a[i]%2==0){
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
                k++;

            }
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[] arr={3,1,2,4};
        int[]arr1={1};
        sortarraybyparity(arr);

    }
}
