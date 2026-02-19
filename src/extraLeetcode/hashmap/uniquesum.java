package extraLeetcode.hashmap;

import java.util.HashMap;

public class uniquesum {
    public static void uniques(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        System.out.println(map);
        int sum = 0;
        for(int num: map.keySet()){
            if(map.get(num)==1){
                sum=sum+num;

            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
       int[] nums = {1,2,3,2};
       uniques(nums);
    }
}
