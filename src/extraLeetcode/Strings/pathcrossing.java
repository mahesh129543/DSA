package extraLeetcode.Strings;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class pathcrossing {
    public static void pathcrossing(String str) {
        int x = 0, y = 0;
        Set<String> visited = new HashSet<>();
        visited.add(x+"," +y);
        System.out.println(visited);

        for (char dir : str.toCharArray()) {
            if (dir == 'N') y++;
            else if (dir == 'S') y--;
            else if (dir == 'E') x++;
            else if (dir == 'W') x--;
            System.out.println(visited);

            String pos = x + "," + y;
            System.out.println(pos);

            if (visited.contains(pos)) {
                System.out.println("visited");
                return ;
            }
            visited.add(pos);
        }
        System.out.println("no path");

    }
    public static void main(String[] args) {
        String str1 = "SENWW";
        pathcrossing(str1);
    }
}
