package extraLeetcode.Strings;

import java.util.ArrayList;
import java.util.List;

public class fizbuzz {
    public static void fizzbuzz(int n) {
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            }else if(i % 3 == 0) {
                list.add("Fizz");
            }else if(i % 5 == 0) {
                list.add("Buzz");
            }else {
                list.add(String.valueOf(i));
            }


        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int n=15;
        fizzbuzz(n);
    }
}
