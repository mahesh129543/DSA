package hashmap;

import java.util.HashSet;

public class longchain {
    static void longchain(int[] arr) {

        HashSet<Integer> hs=new HashSet<>();
        for(int x:arr){
            hs.add(x);
        }
     int largest=0;

        for(int x:arr){
            if(hs.contains(x-1)){
                continue;
            }
                int cnt=1;
                int next=x+1;
                while(hs.contains(next)){
                    cnt++;
                    next++;


            }
            largest = Math.max(largest, cnt);

        }
        System.out.println(largest);


    }
    public static void main(String[] args) {
        int[] arr={12,4,3,7,8,2,5,10,11,20};
        longchain(arr);
    }
}

