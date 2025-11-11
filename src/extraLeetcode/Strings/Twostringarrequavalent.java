package extraLeetcode.Strings;

public class Twostringarrequavalent {
    public static void equavlentstrarr(String[] a, String[] b) {

        String s="";
        for(String s1 : a){
            String w=s1;
            for(int i=0;i<w.length();i++){
                s+=w.charAt(i);
            }

        }
        System.out.println(s);
        for(String s1 : b){
            String w=s1;
            for(int i=0;i<w.length();i++){
                if(w.charAt(i)!=s.charAt(i)){
                    System.out.println("not");
                }

            }
        }
//        StringBuilder sb1 = new StringBuilder();
//        StringBuilder sb2 = new StringBuilder();
//        for(String s : a){
//            sb1.append(s);
//        }
//        for(String s : b){
//            sb2.append(s);
//        }
//        System.out.println(sb1.toString());
//        System.out.println(sb2.toString());
//        if(sb1.toString().equals(sb2.toString())){
//            System.out.println("Equavlentstrarr ok");
//        }
//        else{
//            System.out.println("Equavlentstrarr fail");
//        }

    }
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};
        equavlentstrarr(word1, word2);
    }
}
