package extraLeetcode;

import java.util.HashMap;

public class luckynuminarr {
    public static void luckynuminarr(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);
        int max=Integer.MIN_VALUE;
        for(int i:map.keySet()){

            if(i==map.get(i)){
                max=i;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr = {2,2,4,3};
        int[] arr1 = {1,2,2,3,3,3};
        luckynuminarr(arr);
        luckynuminarr(arr1);
    }
}
