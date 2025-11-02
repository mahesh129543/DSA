package extraLeetcode.ARRAYS;

import java.util.HashMap;

public class xofkindindeckofcards {
    public static void xofkindindeckofcards(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);

        }
        System.out.println(map);

        boolean allSame = true;
        int firstFreq = -1;

        for (int freq : map.values()) {
            if (firstFreq == -1) {
                firstFreq = freq;
            } else if (freq != firstFreq) {
                allSame = false;
                break;
            }
        }

        System.out.println(allSame);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,3,2,1};
        xofkindindeckofcards(arr);
    }
}
