package extraLeetcode.ARRAYS;

import java.util.Arrays;
import java.util.HashMap;

public class smallerthancurrno {
    public static void smallerthancurrno(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for(int num : map.keySet()) {
                if(arr[i]>num) {
                    cnt=cnt+map.get(num);
                }
            }
            res[i]=cnt;

        }
        System.out.println(Arrays.toString(res));

    }
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        smallerthancurrno(arr);
    }
}
