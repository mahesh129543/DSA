package extraLeetcode.ARRAYS;

import java.util.Arrays;
import java.util.HashMap;

public class sortarrbyincrefreq {
    public static void sortarrbyincrefreq(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);
        int k = 0;

        while (!map.isEmpty()) {

            // find current minimum frequency
            int minfreq = Integer.MAX_VALUE;
            int minkey = Integer.MAX_VALUE;

            for (int key : map.keySet()) {
                int f = map.get(key);

                if (f < minfreq || (f == minfreq && key > minkey)) {
                    minfreq = f;
                    minkey = key;
                }
            }

            // place minkey minfreq times
            for (int i = 0; i < minfreq; i++) {
                res[k++] = minkey;
            }

            // remove that key
            map.remove(minkey);
        }
        System.out.println(Arrays.toString(res));

    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3};
        sortarrbyincrefreq(arr);
    }
}
