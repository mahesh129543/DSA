package extraLeetcode.Strings;

public class validpalindrom {
    public static void validPalindrome(String s) {
        int n = s.length();
        String res=s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        System.out.println(res);
        int i=0;
        int j=res.length()-1;
        while(i<=j){
            if(res.charAt(i)!=res.charAt(j)){
                System.out.println("Not a valid palindrome");
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
    public static void main(String[] args) {
        String a="A man, a plan, a canal: Panama";
        validPalindrome(a);
    }
}
