package extraLeetcode.ARRAYS;

import java.util.HashMap;

public class goodpairsinarrr {
    public static void goodpair(int[] arr){
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
        int ans=0;
        for(int num: map.keySet()){
            System.out.println(num);
            if(map.get(num)>=2){
                int per=((map.get(num))*(map.get(num)-1))/2;
                ans+=per;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,3};
        int[] arr2={1,1,1,1};
        goodpair(arr);
        goodpair(arr2);
    }
}
