package extraLeetcode.bitmasking;

import java.util.Arrays;

public class countingbits {
    public static void countbits(int n){
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            int temp=i;
            int cnt=0;
            while(temp>0){
                if((temp&1)==1){
                    cnt++;
                }
                temp=temp>>1;
            }
            arr[i]=cnt;

        }
        System.out.println(Arrays.toString(arr));
    }
    public static boolean fourbits(int n){
        if(n<0){
            return false;
        }
        if((n&(n-1))!=0){
            return false;
        }
       int cnt=0;
        while(n>0){
            if((n&1)==0){
                cnt++;
            }
            n=n>>1;

        }
        if(cnt%2==0){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int n=5;
        int n1=2;
        countbits(n);
        countbits(n1);
        int num=16;
        int num1=8;
        System.out.println(fourbits(num));
        System.out.println(fourbits(num1));
    }
}
