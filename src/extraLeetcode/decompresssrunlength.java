package extraLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class decompresssrunlength {
    public static  void decomp(int[] arr){
        int n = arr.length;
        List<Integer> list = new ArrayList<Integer>();
        int i=0;
        while(i<n-1){
            int freq=arr[i];
            int val=arr[i+1];
            for(int j=0;j<freq;j++){
                list.add(val);
            }
            i=i+2;

        }
        System.out.println(list);
        int[] res=new int[list.size()];
        for(int j=0;j<list.size();j++){
            res[j]=list.get(j);

        }
        System.out.println(Arrays.toString(res));

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] arr2={1,1,2,3};
        decomp(arr);
        decomp(arr2);

    }
}
