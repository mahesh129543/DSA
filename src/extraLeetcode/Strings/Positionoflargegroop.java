package extraLeetcode.Strings;

import java.util.ArrayList;
import java.util.List;

public class Positionoflargegroop {
    public static void positonlargegrp(String s){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int sidx=0;
        int eidx=0;
        int i=0;
        int j=1;
        char[] ch=s.toCharArray();
        while(i<ch.length&&j<ch.length){
            if(ch[i]!=ch[j]){
                i++;
                j++;
            }
            else if(ch[i]==ch[j]){
                sidx=i;

                if(ch[j]!=ch[j+1]){
                    eidx=j;
                }
                if(((eidx-sidx)+1>=0)){
                    list.add(list.get(sidx));
                    list.get(sidx).add(eidx);
                }
                j++;
            }
        }
    }
    public static void main(String[] args) {
       String s = "abcdddeeeeaabbbcd";
    }
}
