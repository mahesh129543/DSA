package Array1;

import java.util.HashSet;

public class chaincosicutiveno {
    public static void  chaincosititivenumber(int[] arr) {
        HashSet<Integer> hs=new HashSet<>();
        for (int x:arr){
            hs.add(x);

        }
        System.out.println(hs.size());
        System.out.println(hs);
        int len=0;
        int largest=0;
        for(int x:arr){
            if(hs.contains(x-1)){
                len=1;
              int   no=x+1;
              while(hs.contains(no)==true){
                  no++;
                  len++;

              }

            }largest=Math.max(len,largest);


        } System.out.println("chian is largest:"+largest);
    }


    public static void main(String[] args) {
        int[] arr={3,5,2,1,4,8,9};
        chaincosititivenumber(arr);

    }
}
