package extraLeetcode;

public class largestatleasttwiceofele {
    public static void largeStatleasttwiceofele(int[] arr) {
        int n = arr.length;

        // Step 1: find largest number and its index
        int largest = arr[0];
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                index = i;
            }
        }

        // Step 2: check if largest is at least twice every other number
        for (int i = 0; i < n; i++) {
            if (i != index && largest < 2 * arr[i]) {
                System.out.println(-1);
                return;
            }
        }

        // Step 3: if condition holds, print the index
        System.out.println("Index of largest at least twice others: " + index);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        largeStatleasttwiceofele(arr);
    }
}
