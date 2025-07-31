package Sorting;

public class countingsearch {
    static void countSearch(int[] arr) {
        int[] freq = new int[12];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                System.out.print(i + ",");
                freq[i]--;

            }
        }

    }
    public static void main(String[] args) {
        int[] arr={4,5,3,2,8,7,8,8,8,10,11};
        countSearch(arr);

    }
}
