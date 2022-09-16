/*********************************************************************************************

The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that 
no two queens attack each other.

Given an integer n, return all distinct solutions to the n-queens puzzle. You may 
return the answer in any order.

Each solution contains a distinct board configuration of the n-queens' placement, 
where 'Q' and '.' both indicate a queen and an empty space, respectively.

 

Example 1:
Image link - https://assets.leetcode.com/uploads/2020/11/13/queens.jpg

Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
Example 2:

Input: n = 1
Output: [["Q"]]
 

Constraints:

1 <= n <= 9

*********************************************************************************************/


class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> ans = new ArrayList<List<String>>();
        
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        solveQueens(0,board,ans);
    
        return ans;
    }
    
    private void solveQueens(int col,char[][] board,List<List<String>> ans){
        
        if(col == board.length){
            ans.add(construct(board));
            return;
        }
        
        
        for(int row = 0; row < board.length; row++){
            if(validate(board,row,col)){
                board[row][col] = 'Q';
                solveQueens(col+1,board,ans);
                
                board[row][col] = '.';
            }
        }
        
    }
    
    private List<String> construct(char [][]board){
        
        int row = board.length;
        List<String> list = new ArrayList<String>();
        for(int  i=0;i<row;i++){
            
            list.add(new String(board[i]));
        }
        return list;
    }
    
    private boolean validate(char [][]board,int row,int col){
        
        int duprow = row;
        int dupcol = col;
        
       
        // check row
        while(col >= 0){
            if(board[row][col] == 'Q')
                return false;
            col--;
        }
        
        row = duprow;
        col = dupcol;
        
        // check main diagonal
        while(row >=0 && col >=0 ){
            if(board[row][col] == 'Q')
                return false;
            
            row--;
            col--;
        }
        
        row = duprow;
        col = dupcol;
        // check secondry diagonal
        while(row < board.length && col>=0){
            if(board[row][col] == 'Q')
                return false;
            
            row++;
            col--;
        }
        
        
        return true;
    }
}




