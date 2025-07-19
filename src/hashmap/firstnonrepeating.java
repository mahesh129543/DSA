package hashmap;

import java.util.HashMap;

import static java.util.Collections.frequency;


public class firstnonrepeating {
    public static void soteInhashmap(int[] arr){
        int n = arr.length;
        HashMap<Integer,Integer> ht = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            ht.put(arr[i],ht.getOrDefault(arr[i],0)+1);

        }
        System.out.println(ht);
        System.out.println(ht.keySet());
        int frequency = 0;
        for (int key : ht.keySet()) {
            System.out.println("Element: " + key + ", Frequency: " + ht.get(key));
        }
        for(int i=0;i<arr.length;i++){
            if (ht.get(arr[i])==1){
                System.out.println(arr[i]);
                return;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr={1, 2, 2, 2, 3, 4, 3, 2, 2, 1};
        soteInhashmap(arr);


    }

}