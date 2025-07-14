package bit_Manipulation;

import java.util.Arrays;

public class uniquenointhree {
    public static void oneUniqueno(){
        int[] arr={2,4,4,4,3,2,6,6,6,7,7,7,2};
        int[] fre=new int[32];
        for(int x: arr){
            int j=0;
            while(x>0){
                int lastbit=x&1;
                fre[j]=fre[j]+lastbit;
                j=j+1;
                x=x>>1;
            }


        }
        System.out.println(Arrays.toString(fre));
        int ans=0;
        int p=1;
        for(int i=0;i<32;i++){
            fre[i]=fre[i]%3;
            ans=ans+fre[i]*p;
            p=p<<1;
        }

        System.out.println(Arrays.toString(fre));
        System.out.println(ans);

    }


    public static void main(String[] args) {
        oneUniqueno();

    }
}
