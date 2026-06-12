import java.util.*;
public class ratinmazeStriver {
    //Recursive function to explore paths in the maze
    // private void solveMaze(int[][] maze, int x, int y, int[][] sol) {
    //     int n = maze.length;

    //     // If destination is reached
    //     if (x == n - 1 && y == n - 1) {
    //         sol[x][y] = 1;
    //         return;
    //     }

    //     // Check if the current cell is valid
    //     if (x >= 0 && y >= 0 && x < n && y < n && maze[x][y] == 1 && sol[x][y] == 0) {
    //         sol[x][y] = 1; // Mark the cell as part of the solution

    //         // Move right
    //         solveMaze(maze, x, y + 1, sol);
    //         // Move down
    //         solveMaze(maze, x + 1, y, sol);
    //         // Move left
    //         solveMaze(maze, x, y - 1, sol);
    //         // Move up
    //         solveMaze(maze, x - 1, y, sol);

    //         // Backtrack if no path found
    //         sol[x][y] = 0;
    //     }
    // }
    //to avoid the reapeated code we do it by using the for loop
    private void solve(int i,int j, int[][]a,int n,List<String> ans,String move,int [][] vis, int[]di, int[]dj){
        //if rate reach the destination i.e.
        if(i==n-1 && j==n-1){
            ans.add(move);
            return;
        }
        String [] dir = {"D","L","R","U"}; //directions for right, down, left, up
        //check if the current cell is valid

        //explore all the 4 directions
        for(int ind=0;ind<4;ind++){
            int ni=i+di[ind];
            int nj=j+dj[ind];
            //check if the next cell is valid
            if(ni>=0 && nj>=0 && ni<n && nj<n && a[ni][nj]==1 && vis[ni][nj]==0){
                vis[ni][nj]=1; //mark the cell as visited
                solve(ni,nj,a,n,ans,move+dir[ind],vis,di,dj); //recur for the next cell
                vis[ni][nj]=0; //backtrack
            }
        }   
    }

    public List<String> findPath(int[][] a, int n) {
        List<String> ans = new ArrayList<>();
        int[][] vis = new int[n][n]; //visited array to keep track of visited cells
        int[] di = {1, 0, 0, -1}; //direction arrays for  down, left,right, up
        int[] dj = {0,-1, 1,  0};
        
        if(a[0][0]==1) { //if the starting cell is valid
            vis[0][0] = 1; //mark the starting cell as visited
            solve(0, 0, a, n, ans, "", vis, di, dj); //start solving the maze
        }
        
        return ans; //return the list of paths found
    }
    public static void main(String[] args) {
        ratinmazeStriver rat = new ratinmazeStriver();
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 1, 1},
            {0, 1, 0, 1},
            {0, 1, 1, 1}
        };
        List<String> paths = rat.findPath(maze, maze.length);
        System.out.println("Paths found: " + paths);
    }
}
