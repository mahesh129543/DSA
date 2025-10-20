package extraLeetcode;

import java.util.Arrays;
import java.util.HashMap;

public class medelprize {
    public static String[] medelprizec(int[] arr) {
        int n = arr.length;

        // Step 1: Copy and sort array in descending order
        int[] sorted = arr.clone();

        Arrays.sort(sorted);

        // Reverse the sorted array to get descending order
        for (int i = 0; i < n / 2; i++) {
            int temp = sorted[i];
            sorted[i] = sorted[n - 1 - i];
            sorted[n - 1 - i] = temp;
        }

        // Step 2: Map each score to its rank
        HashMap<Integer, String> rankMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (i == 0)
                rankMap.put(sorted[i], "Gold Medal");
            else if (i == 1)
                rankMap.put(sorted[i], "Silver Medal");
            else if (i == 2)
                rankMap.put(sorted[i], "Bronze Medal");
            else
                rankMap.put(sorted[i], String.valueOf(i + 1)); // rank number as string
        }

        // Step 3: Build result according to original array order
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 1};
        String[] ans = medelprizec(arr);
        System.out.println(Arrays.toString(ans));
    }
}
