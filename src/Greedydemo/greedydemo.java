package Greedydemo;

import java.util.*;

import static java.lang.Math.max;

public class greedydemo {
    public static int mincoins(int n, int[] arr){
        if(n==0){
            return 0;
        }
        int pick=0;
        for(int coin:arr){
            if(coin<=n){
                pick=max(pick , coin);

            }
        }
       int remcoin=mincoins(n-pick,arr);
        int ans=1+remcoin;
        return ans;
    }
    public static void main(String[] args) {

        int[] arr={1,2,5,10,20,50,100};
        System.out.println(mincoins(125,arr));
    }



}
