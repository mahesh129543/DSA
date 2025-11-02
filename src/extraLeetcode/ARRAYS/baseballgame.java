package extraLeetcode.ARRAYS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baseballgame {
    public static void baseballgame(String[] arr) {
        List<Integer> list = new ArrayList<Integer>();

        for(String op : arr){
            if(op.equals("C")){
                if(!list.isEmpty()){
                    list.remove( list.size()-1);
                }


            }
            else if(op.equals("D")){
               if(!list.isEmpty()){
                   list.add(list.get(list.size()-1)*2);
               }
            }
            else if(op.equals("+")){
                if(!list.isEmpty()){
                    list.add(list.get(list.size()-1)+list.get(list.size()-2));
                }
            }
            else{
                list.add(Integer.parseInt(op));
            }
        }
        System.out.println(list);
        int sum = 0;
        for(Integer i : list){
            sum += i;


        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        String[] arr={"5","2","C","D","+"};
        baseballgame(arr);
    }
}
