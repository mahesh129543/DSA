package bit_Manipulation;

import static bit_Manipulation.generateno.getIthbit;

public class twoUniqueno {
    public static void twoUniqueno(int[] arr) {
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res=res^arr[i];


        }
        int temp = res;
        int pos=0;
        while((temp&1)==0){
            pos=pos+1;
            temp=temp>>1;
        }

        int A=0;
        int B=0;

        for(int i=0;i<n;i++){
            if((arr[i]& (1<<pos))==(1<<pos)) {
                A = A ^ arr[i];

            }else {
                B = B ^ arr[i];

            }

        }
        System.out.println("no of a:"+A);
        System.out.println("no of b:"+B);



    }


    public static void main(String[] args) {
        int[] arr={2,5,7,7,9,5,3,2};

        twoUniqueno(arr);

    }
}
