package extraLeetcode;

import java.util.HashMap;

public class longestharmonsubsequen {
    public static int longestSubsequence(int[] a) {
        int n = a.length;
        int res=0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        System.out.println(map);
      for(int i : map.keySet()){
          if( map.containsKey(i+1)){
              int len=map.get(i)+map.get(i+1);
              res=Math.max(res,len);


          }

      }return res;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(longestSubsequence(arr));

    }
}
