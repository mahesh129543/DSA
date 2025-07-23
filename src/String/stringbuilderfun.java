package String;



import java.util.*;

public class stringbuilderfun {

    public static void reversesentence(String sentence) {
        // Step 1: Use StringBuilder to reverse the entire sentence
        StringBuilder sb = new StringBuilder(sentence);
        sb.reverse();
        System.out.println(sb.toString());

        // Step 2: Split the reversed sentence into words
        String[] reversedWords = sb.toString().split(" ");
        System.out.println(Arrays.toString(reversedWords));

        // Step 3: Reverse each word again to restore original word letters
        for (int i = 0; i < reversedWords.length; i++) {
            reversedWords[i] = new StringBuilder(reversedWords[i]).reverse().toString();
            System.out.print(reversedWords[i]+" ");
        }
        System.out.println();

        // Step 4: Join the words back to form the final reversed sentence
        String finalSentence = String.join(" ", reversedWords);

        System.out.println("Reversed Sentence: " + finalSentence);
    }

    public static void main(String[] args) {
        String sentence = "I like eating the apple";
        reversesentence(sentence);
    }
}
