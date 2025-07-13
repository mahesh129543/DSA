package Array2_2D;

import java.util.ArrayList;
import java.util.Arrays;

public class twodarraylis {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arr2d= new ArrayList<>(5);

        ArrayList<Integer> row1= new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        row1.add(4);
        arr2d.add(row1);

        ArrayList<Integer> row2= new ArrayList<>(Arrays.asList(1,2,3,4));
         arr2d.add(row2);
         arr2d.add(row1);
         arr2d.get(2).set(1,55);
         System.out.println(arr2d);
    }
}
