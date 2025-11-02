package extraLeetcode.ARRAYS;

public class elementappearingmorethan25per {
    public static void ddd(int[] arr) {
        int n = arr.length;
        int maxCnt = 1;
        int currCnt = 1;
        int maxElement = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                currCnt++;
            } else {
                currCnt = 1; // reset counter
            }

            // update maximum
            if (currCnt > maxCnt) {
                maxCnt = currCnt;
                maxElement = arr[i];
            }
        }

        System.out.println("Most frequent element: " + maxElement);
        System.out.println("Count: " + maxCnt);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        ddd(arr);
    }
}
