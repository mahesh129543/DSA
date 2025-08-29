package hashmap;

import java.util.HashMap;

public class distacebetweenrwoduplicate {
    static public void diastaceDuplicates(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int s=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }else {
                s=map.get(arr[i]);
                int dif=(i-s);
                min = Math.min(min,dif);
                map.put(arr[i],i);
            }
        }
        System.out.println("minimum distance between the two duplicate number:"+min);
    }
    public static void main(String[] args) {
        int[] arr= {1,2,4,5,7,8,9,2};
        diastaceDuplicates(arr);
    }
}
