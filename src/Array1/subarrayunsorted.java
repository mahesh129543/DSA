package Array1;

import java.util.Arrays;

public class subarrayunsorted {

    public static void unsortedArray() {
        int[] arr = {1, 2, 4, 7, 10, 11, 7, 12, 7, 7, 16, 18, 19};

        System.out.println( Arrays.toString(arr));

        int[] barr= arr.clone(); // Copy of original array
        Arrays.sort(barr);

        System.out.println( Arrays.toString(barr));

        int i = 0;
        while (i < arr.length && arr[i] == barr[i]) {
            i++;
        }
        System.out.println(arr[i]);

        int j = arr.length - 1;
        while (j > i && arr[j] == barr[j]) {
            j--;
        }
        System.out.println(arr[j]);


    }

    public static void main(String[] args) {
        unsortedArray();
    }
}
