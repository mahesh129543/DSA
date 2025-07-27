package advancearray;

import java.util.ArrayList;

public class subset {
    public static void subsetofArray(int n,int[] arr,int x) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        int j=arr.length-1;
        int sum=0;
        while(n>0) {
            int lastbit=(n&1);
            if(lastbit==1) {
                list.add(arr[j]);
                sum+=arr[j];
            }
            j--;
            n=n>>1;

        }
        if(sum==x) {
          System.out.println("sum of the subset:"+list);
        }
        System.out.println(list);


    }



    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int n=arr.length;
        int x=4;
        for(int i=0;i<(1<<5);i++){
//            System.out.println(i);
            subsetofArray(i,arr,x);
        }
    }
}
