package extraLeetcode;

import java.util.Arrays;
import java.util.HashMap;

public class ranktransfronarray {
    public static void rankarray(int[] arr) {
        int n = arr.length;
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        // Assign ranks, same value = same rank
        for (int num : sorted) {
            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }

        // Replace with ranks
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = map.get(arr[i]);
        }

        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        rankarray(arr);
    }
}
