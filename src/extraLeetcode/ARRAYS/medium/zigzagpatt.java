package extraLeetcode.ARRAYS.medium;

public class zigzagpatt {
    public static String convert(String s, int numRows) {

        if(numRows == 1 || s.length() <= numRows)
            return s;

        int n = s.length();


        char[][] arr = new char[numRows][n];

        int row = 0;
        int col = 0;
        int i = 0;

        while(i < n){

            while(row < numRows && i < n){
                arr[row][col] = s.charAt(i);
                row++;
                i++;
            }

            row = numRows - 2;
            col++;

            while(row > 0 && i < n){
                arr[row][col] = s.charAt(i);
                row--;
                col++;
                i++;
            }
        }


        StringBuilder ans = new StringBuilder();

        for(int r=0; r<numRows; r++){
            for(int c=0; c<n; c++){
                if(arr[r][c] != '\0'){
                    ans.append(arr[r][c]);
                }
            }
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        System.out.println(convert(s, numRows));
        
    }
}
