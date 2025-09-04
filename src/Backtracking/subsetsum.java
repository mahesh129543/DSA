package Backtracking;

import java.util.ArrayList;

public class subsetsum {
    public static int subsetSum(int[] input, int i, int currentsum,int k, ArrayList<Integer> list) {
        if(i == input.length){
            if(currentsum == k){
                System.out.println(list);
                return 1;
            }
            return 0;
        }
        if(currentsum > k){
            return 0;
        }
        list.add(input[i]);
        int x=subsetSum(input,i+1,currentsum+input[i],k,list);

        list.remove(list.size()-1);
        int y=subsetSum(input,i+1,currentsum,k,list);
        return x+y;


    }
    public static void main(String[] args) {
        int[] input={3,2,6,7};
        int k=9;
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(subsetSum(input,0,0,9,list));

    }
}
