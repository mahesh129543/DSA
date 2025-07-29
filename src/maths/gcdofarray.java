package maths;

import static maths.gcd.gcdofno;

public class gcdofarray {
    public static int getGcd(int[] a) {
        int res=a[0];
        for (int i = 0; i < a.length; i++) {
            res=gcdofno(res,a[i]);
            if(res==1){
                return 1;
            }
        }return res;

    }

    public static void main(String[] args) {
        int[] arr={10,20,30,42,64};
        System.out.println("gcd of the hole array:"+getGcd(arr));

    }
}
