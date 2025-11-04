package extraLeetcode.ARRAYS;

import java.util.HashMap;

public class mostvisitedtrackincircle {

    public static void traccnt(int[] arr, int k) {
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        // initialize map with sectors 1..k
        for (int i = 1; i <= k; i++) {
            map.put(i, 0);
        }
        System.out.println(map);

        // FIX 1: loop only till n-1   (arr[i+1] must be valid)
        for (int i = 0; i < n - 1; i++) {

            int x = arr[i];
            int y = arr[i + 1];

            // FIX 2: handle circular movement
            if (x <= y) {
                // normal move
                for (int j = x; j <= y; j++) {
                    map.put(j, map.get(j) + 1);
                }
            } else {
                // circular move: x → k → 1 → y
                for (int j = x; j <= k; j++) {
                    map.put(j, map.get(j) + 1);
                }
                for (int j = 1; j <= y; j++) {
                    map.put(j, map.get(j) + 1);
                }
            }
        }

        System.out.println(map);
    }

    public static void main(String[] args) {
        int n = 4;
        int[] rounds = {1, 3, 1, 2};
        traccnt(rounds, n);
    }
}
