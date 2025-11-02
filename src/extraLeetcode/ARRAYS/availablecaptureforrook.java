package extraLeetcode.ARRAYS;

public class availablecaptureforrook {
    public static void availablecaptureforrook(String[][] board) {
        int cnt = 0;
        int rookRow = -1, rookCol = -1;

        // Step 1: Find the rook position
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j].equals("R")) {
                    rookRow = i;
                    rookCol = j;
                }
            }
        }
        System.out.println(rookRow + "," + rookCol);

        // Step 2: Check all four directions
        // UP
        for (int i = rookRow - 1; i >= 0; i--) {
            if (board[i][rookCol].equals("B")) break;
            if (board[i][rookCol].equals("P")) {
                cnt++;
                break;
            }
        }

        // DOWN
        for (int i = rookRow + 1; i < 8; i++) {
            if (board[i][rookCol].equals("B")) break;
            if (board[i][rookCol].equals("P")) {
                cnt++;
                break;
            }
        }

        // LEFT
        for (int j = rookCol - 1; j >= 0; j--) {
            if (board[rookRow][j].equals("B")) break;
            if (board[rookRow][j].equals("P")) {
                cnt++;
                break;
            }
        }

        // RIGHT
        for (int j = rookCol + 1; j < 8; j++) {
            if (board[rookRow][j].equals("B")) break;
            if (board[rookRow][j].equals("P")) {
                cnt++;
                break;
            }
        }

        System.out.println("Number of pawns Rook can capture: " + cnt);
    }

    public static void main(String[] args) {
        String[][] board = {
                {".",".",".",".",".",".",".","."},
                {".",".",".","P",".",".",".","."},
                {".",".",".","R",".",".",".","P"},
                {".",".",".",".",".",".",".","."},
                {".",".",".",".",".",".",".","."},
                {".",".",".","P",".",".",".","."},
                {".",".",".",".",".",".",".","."},
                {".",".",".",".",".",".",".","."}
        };

        availablecaptureforrook(board);
    }
}
