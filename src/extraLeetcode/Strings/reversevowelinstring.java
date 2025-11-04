package extraLeetcode.Strings;

public class reversevowelinstring {
    public static String reversevowelinstring(String str) {

        int i = 0;
        int j = str.length() - 1;
        String vowel = "aeiouAEIOU";

        char[] arr = str.toCharArray();  // convert to char array

        while (i < j) {

            // move i forward until vowel found
            while (i < j && !vowel.contains(arr[i] + "")) {
                i++;
            }

            // move j backward until vowel found
            while (i < j && !vowel.contains(arr[j] + "")) {
                j--;
            }

            // swap vowels
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reversevowelinstring(s));  // Output: AmCreeIc
    }
}
