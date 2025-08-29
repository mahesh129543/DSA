package hashmap;

import java.util.HashMap;

public class duplicatepair {
    static void duplicatepair(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);

        }
        System.out.println(map);
        int cnt=0;

        for(int key : map.keySet()) {
            if(map.get(key)>=2) {
                int f=map.get(key);
                cnt+=(f*(f-1))/2;
            }
        }
        System.out.println(cnt);
    }
    static void duplicatepair2(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                cnt+=map.get(arr[i]);
                map.put(arr[i], map.get(arr[i]) + 1);


            }else{
                map.put(arr[i],1);
            }
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        int[] arr={1,4,3,1,4,1,5};
        duplicatepair(arr);
        duplicatepair2(arr);

    }
}
