class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;
                            if (solve(board) == true) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValid(char[][] board, int i, int j, int c) {
        for (int m = 0; m < board.length; m++) {
            if (board[m][j] == c) {
                return false;
            }

            if (board[i][m] == c) {
                return false;
            }

            if (board[3 * (i / 3) + m / 3][3 * (j / 3) + m % 3] == c) {
                return false;
            }
        }
        return true;
    }
}