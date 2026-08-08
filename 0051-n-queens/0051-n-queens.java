class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0 ; i<board.length ; i++){
            Arrays.fill(board[i],'.');
        }
        generate(board,0);
        return res;
    }
    public void generate(char[][] board,int row){
        if(row==board.length){
            ArrayList<String> ans = new ArrayList<>();
            for(int i=0 ; i<board.length ; i++){
                ans.add(new String(board[i]));
            }
            res.add(ans);
            return;
        }
        for(int i=0 ; i<board.length ; i++){
            if(isSafe(board,row,i)){
                board[row][i] = 'Q';
                generate(board,row+1);
                board[row][i] = '.';
            }
        }
    }
    public boolean isSafe(char[][] board,int row , int col){
        for(int i=0 ; i<board.length ; i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        int i=row-1;
        int j=col-1;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q'){
                return false;
            }
            i--;
            j--;
        }
        i=row-1;
        j=col+1;
        while(i>=0 && j<board.length){
            if(board[i][j]=='Q'){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}