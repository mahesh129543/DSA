package extraLeetcode.Strings;

public class WordOcurrsInstrw {
    public static void checkWordOcurrs(String str, String sch) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(word.length()>=sch.length()&&word.startsWith(sch) ){
                System.out.println(i+1);
            }
        }
    }
    public static void main(String[] args) {
       String sentence = "i love eating burger", searchWord = "burg";
       checkWordOcurrs(sentence, searchWord);
    }
}
