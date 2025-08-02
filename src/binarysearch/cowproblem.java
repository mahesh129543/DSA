package binarysearch;

import java.util.Arrays;

public class cowproblem {
    public static int cow(int[] stall,int c) {
        int n = stall.length;
        Arrays.sort(stall);
        int s=0;
        int e=stall[n-1]-stall[0];
        int ans=0;
        while(s<=e){
            int mid=(s+e)/2;
            if(canplace(stall,mid,c)){
                ans=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }return ans;
    }
    public static boolean canplace(int[] stall,int mid,int c){
        int lastcow=stall[0];
        int cnt=1;
        for(int i=1;i<stall.length;i++){
            if(stall[i]-lastcow>=mid){
                cnt++;
                lastcow=stall[i];
                if(cnt==c){
                    return true;
                }
            }
        }return false;
    }
    public static void main(String[] args) {
        int[] stall={1,4,8,2,9};
        int c=3;
        System.out.println(cow(stall,3));


    }
}
