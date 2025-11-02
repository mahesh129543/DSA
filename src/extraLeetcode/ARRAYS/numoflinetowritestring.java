package extraLeetcode.ARRAYS;

public class numoflinetowritestring {
    public static void numoflinetowritestring(String s,int[] widths) {
        int lines = 1;       // at least one line
        int currWidth = 0;   // current line width used

        for (int i = 0; i < s.length(); i++) {
            int w = widths[s.charAt(i) - 'a']; // width of current character

            // if adding this character exceeds 100, move to next line
            if (currWidth + w > 100) {
                lines++;
                currWidth = w; // start new line with current char width
            } else {
                currWidth += w;
            }
        }

        System.out.println("Lines used: " + lines);
        System.out.println("Width of last line: " + currWidth);
    }
    public static void main(String[] args) {
        String s="abcdefghijklmnopqrstuvwxyz";
        int[] width={10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s1="bbbcccdddaaa";
        int[] width1={4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        numoflinetowritestring(s,width);
        System.out.println("mahesh");
        numoflinetowritestring(s1,width1);
    }
}
