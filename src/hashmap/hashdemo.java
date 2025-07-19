package hashmap;

import java.util.HashMap;

public class hashdemo {
    public static void main(String[] args) {
        HashMap<String,Integer> menu=new HashMap<>();
        menu.put("pizza",100);
        menu.put("burger",203);
        menu.put("chiken",332);
        menu.put("poha",41);
        menu.put("vada pav",50);
        System.out.println( menu.size());

        System.out.println(menu);
        if(menu.containsKey("pizza")){
            System.out.println("yes pizza is present: "+menu.get("pizza"));
        }
        else{
            System.out.println("no pizza is present");
        }


    }
}
