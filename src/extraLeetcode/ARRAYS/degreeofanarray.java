package extraLeetcode.ARRAYS;

import java.util.HashMap;

public class degreeofanarray {
    public static void degreeofanarray(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);
        int big=0;
        for(int i: map.keySet()){
            if(map.get(i) > big){
                big = map.get(i);

            }
        }
        System.out.println(big);
        int key=0;
        for(int k: map.keySet()){
            if(map.get(k)== big){
                key=k;
            }
        }
        System.out.println(key);
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                if (first == -1) {
                    first = i;
                }else{
                    last = i;

                }
            }
        }

        System.out.println("First index: " + first);
        System.out.println("Last index: " + last);
        System.out.println("Subarray length having same degree: " + (last - first + 1));

    }
    public static void main(String[] args) {
        int[] arr={1,3,2,1,2,5,5,2,4};
        degreeofanarray(arr);

    }
}
