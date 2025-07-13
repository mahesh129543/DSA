package Array1;

public class unsortedsubarray {


    public static boolean unsortedoutofBound(int[] arr, int i) {
        if (i == 0) {
            return arr[i] > arr[i + 1];
        } else if (i == arr.length - 1) {
            return arr[i] < arr[i - 1];
        } else {
            return arr[i] < arr[i - 1] || arr[i] > arr[i + 1];
        }
    }

    public static void findSubarray(int[] arr) {
        int n = arr.length;
        int start = -1;
        int end = -1;


        for (int i = 0; i < n; i++) {
            if (unsortedoutofBound(arr, i)) {
                if (start == -1) start = i;
                end = i;
            }
        }


        if (start == -1) {
            System.out.println("The array is sorted");
            return;
        }


        int min = arr[start];
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }


        int left = start;
        while (left > 0 && arr[left - 1] > min) {
            left--;
        }


        int right = end;
        while (right < n - 1 && arr[right + 1] < max) {
            right++;
        }

        System.out.println("Unsorted subarray from index " + left + " to " + right);
        System.out.print("Subarray values: ");
        for (int i = left; i <= right; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 10, 11, 7, 12, 7, 7, 16, 18, 19};
        findSubarray(arr);
    }
}
