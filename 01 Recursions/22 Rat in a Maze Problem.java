/************************************************************************************

Consider a rat placed at (0, 0) in a square matrix of order N * N. It has to reach 
the destination at (N - 1, N - 1). Find all possible paths that the rat can take to
reach from source to destination. The directions in which the rat can move are
'U'(up), 'D'(down), 'L' (left), 'R' (right). Value 0 at a cell in the matrix
represents that it is blocked and rat cannot move to it while value 1 at a cell
in the matrix represents that rat can be travel through it.
Note: In a path, no cell can be visited more than one time. If the source cell
is 0, the rat cannot move to any other cell.

Example 1:

Input:
N = 4
m[][] = {{1, 0, 0, 0},
         {1, 1, 0, 1}, 
         {1, 1, 0, 0},
         {0, 1, 1, 1}}
Output:
DDRDRR DRDDRR
Explanation:
The rat can reach the destination at 
(3, 3) from (0, 0) by two paths - DRDDRR 
and DDRDRR, when printed in sorted order 
we get DDRDRR DRDDRR.
Example 2:
Input:
N = 2
m[][] = {{1, 0},
         {1, 0}}
Output:
-1
Explanation:
No path exists and destination cell is 
blocked.
Your Task:  
You don't need to read input or print anything. Complete the function
printPath() which takes N and 2D array m[ ][ ] as input parameters and
returns the list of paths in lexicographically increasing order. 
Note: In case of no path, return an empty list. The driver will output
"-1" automatically.

Expected Time Complexity: O((3N^2)).
Expected Auxiliary Space: O(L * X), L = length of the path, X = number of
*************************************************************************************/



// m is the given matrix and n is the order of matrix
class Solution {
    
    private static void findPathHelper(int row,int col,int m[][],int n,
    String path,ArrayList<String>res,boolean visited[][]){
        
        if(row == n-1 && col == n-1){
            res.add(new String(path));
            return;
        }
        
        // down
        if(row+1<n && visited[row+1][col] == false && m[row+1][col] == 1){
            visited[row][col] = true;
            findPathHelper(row+1,col,m,n,path+"D",res,visited);
            visited[row][col] = false;
        }        
        
        // left
        if(col-1>=0 && visited[row][col-1]==false && m[row][col-1] == 1){
            visited[row][col] = true;
            findPathHelper(row,col-1,m,n,path+"L",res,visited);
            visited[row][col] = false;
        }
        
        // up
        if(row-1>=0 && visited[row-1][col] == false && m[row-1][col] == 1){
            visited[row][col] = true;
            findPathHelper(row-1,col,m,n,path+"U",res,visited);
            visited[row][col] = false;
        }
        
        // right
        if(col+1<n && visited[row][col+1] == false && m[row][col+1] == 1){
            visited[row][col] = true;
            findPathHelper(row,col+1,m,n,path+"R",res,visited);
            visited[row][col] = false;
        }
    }
    
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> res = new ArrayList<String>();
        
        if(m[0][0] == 0)
            return res;
        
        boolean visited[][] = new boolean[n][n];
        findPathHelper(0,0,m,n,"",res,visited);
        
        return res;
    }
    
}



// Problem Link - https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
// Video Link - https://www.youtube.com/watch?v=bLGZhJlt4y0&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=18


