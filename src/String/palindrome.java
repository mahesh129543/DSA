package String;

public class palindrome {
    public static void isPalindrome(char[] ch) {
        int start = 0;
        int end = ch.length - 1;
        while (start < end) {
            if (ch[start] != ch[end]) {
                System.out.println("Not a palindrome");
                return;

            }start++;
            end--;

        }System.out.println("Palindrome");

    }



    public static void main(String[] args) {
        char[] ch={'a','b','c','b','a','f'};
        isPalindrome(ch);


    }
}
